package com.example.ela2.screen.comment;


import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ela2.databinding.ItemCommentBinding;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.CommentVH> {

    private List<UserComment> commentList;

    public void setData(List<UserComment> commentList) {
        this.commentList = commentList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CommentVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CommentVH(ItemCommentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CommentVH holder, int position) {
        holder.binding.tvComment.setText(commentList.get(position).getComment());

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss", Locale.getDefault());
        holder.binding.tvTimestamp.setText(sdf.format(commentList.get(position).getTimestamp()));
    }

    @Override
    public int getItemCount() {
        return commentList == null? 0: commentList.size();
    }

    public static class CommentVH extends RecyclerView.ViewHolder {

        ItemCommentBinding binding;

        public CommentVH(ItemCommentBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
