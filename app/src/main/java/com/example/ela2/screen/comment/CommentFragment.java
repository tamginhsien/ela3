package com.example.ela2.screen.comment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ela2.databinding.FragmentCommentBinding;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import timber.log.Timber;


public class CommentFragment extends Fragment {

    private FragmentCommentBinding binding;
    private CommentAdapter commentAdapter;
    private NavController navController;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCommentBinding.inflate(inflater, container, false);
        navController = NavHostFragment.findNavController(this);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        String commentsKey = CommentFragmentArgs.fromBundle(getArguments()).getCommentsKey();
        String title = CommentFragmentArgs.fromBundle(getArguments()).getTitle();

        setupRecyclerView();
        binding.tvTitle.setText(title);

        observeAllComments(commentsKey);

        binding.btnSend.setOnClickListener(v -> {
            String userInput = binding.etComment.getText().toString();

            if(!userInput.isEmpty()) {
                setComment(commentsKey, userInput);
                binding.etComment.setText("");
            }
        });

        binding.ivBack.setOnClickListener(v -> navController.navigateUp());
    }

    public void setupRecyclerView() {
        binding.rvComment.setLayoutManager(new LinearLayoutManager(getContext()));
        commentAdapter = new CommentAdapter();
        binding.rvComment.setAdapter(commentAdapter);
    }

    public void observeAllComments(String dbCollection) {
        db.collection(dbCollection).orderBy("timestamp").addSnapshotListener((snapshot, error) -> {
            if (error != null) {
                Timber.e(error);
                return;
            }

            if (snapshot != null) {
                List<UserComment> commentList = new ArrayList<>();
                for (DocumentSnapshot document : snapshot.getDocuments()) {
                    commentList.add(new UserComment(document.getString("comment"), document.getDate("timestamp")));
                }

                if(commentList.isEmpty()) {
                    binding.tvCommentEmpty.setVisibility(View.VISIBLE);
                } else {
                    binding.tvCommentEmpty.setVisibility(View.GONE);
                    commentAdapter.setData(commentList);

                    // always scroll to bottom when new data coming
                    binding.rvComment.smoothScrollToPosition(commentList.size() - 1);
                }
            }
        });
    }

    public void setComment(String dbCollection, String comment) {
        UserComment userComment = new UserComment(comment, Date.from(Instant.now()));

        db.collection(dbCollection)
                .add(userComment)
                .addOnFailureListener(Timber::e);
    }
}