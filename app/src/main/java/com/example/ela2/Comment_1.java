package com.example.ela2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.common.base.MoreObjects;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ServerValue;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.HashMap;
import java.util.Map;

public class Comment_1 extends AppCompatActivity{
    private static final String TAG = "Comment_1";		//Constant TAG location, "Comment_1" could replaced with any other name as long it same as the current java. location.
    private EditText entercomment1;
    private Button sendButton1;
    private TextView recComment1;

    //Keys
    public static final String KEY_COMMENT = "comment";

    //Connection to Firestore
    //private FirebaseDatabase db = FirebaseDatabase.getInstance();
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    private DocumentReference commentRef = db.collection("CommentFeatures").document("Comment Example 1");
    //private DocumentReference commentRef = db.document("CommentFeature/Comment Example 1");

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment1);		//activity_comment1 is the name of xml. file where this written for

        //Id of XML file is here
        sendButton1 = findViewById(R.id.send_button1);
        entercomment1 = findViewById(R.id.enter_comment1);
        recComment1 = findViewById(R.id.rec_comment1);	//Maybe later changed with RecycleView


        //Updating cumulative comment (directly typed).


        //Button Triggered for directly show comment typed.
        sendButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String comment = entercomment1.getText().toString();
                recComment1.setText(comment);
            }
        });

//        //Button triggered for FireStore
//        sendButton1.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                String comment = entercomment1.getText().toString().trim();
//
//                Map<String, Object> data = new HashMap<>();
//                data.put(KEY_COMMENT, comment);
//
//                START OF SET DATA
//                1st way
//                db.collection("CommentFeature")	//Name of the collection = "Comment Feature"
//                .document("Comment Example 1")		//Name of the document = "Comment Example 1"
//
//                2nd way
//                //commentRef.document("Comment Example 1")
//                //.set(data)

//                //3nd Way
//                //commentReF.set(data)
//                //4th Way (Database)
//
//                        //How about when Success?
//                commentRef.set(data).addOnSuccessListener(new OnSuccessListener<Void>(){
//                            @Override
//                            public void onSuccess(Void aVoid){
//                                Toast.makeText(Comment_1.this,"Success",Toast.LENGTH_LONG)
//                                        .show();
//                            }
//                        })
//                        .addOnFailureListener(new OnFailureListener() {
//                                                  @Override
//                                                  public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
//                                                      Log.d(TAG,"onFailure" + e.toString());
//                                                  }
//                                              });
//
//            }
//
//        });



    }

}


//START OF GET DATA
//                commentRef.get()
//                        .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
//                            @Override
//                            public void onSuccess(DocumentSnapshot documentSnapshot) {
//                                if (documentSnapshot.exists()) {
//                                    String comment = documentSnapshot.getString(KEY_COMMENT);
//
//                                    recComment1.setText(comment);
//                                } else {
//                                    Toast.makeText(Comment_1.this, "No data exists", Toast.LENGTH_LONG)
//                                                            .show();
//                                }
//                            }
//                        }).addOnFailureListener(new OnFailureListener() {
//                            @Override
//                            public void onFailure(@NonNull @org.jetbrains.annotations.NotNull Exception e) {
//                                Log.d(TAG, "onFailure: " + e.toString());
//                            }
//                        });

//START OF UPDATING DATA

