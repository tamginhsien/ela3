package com.example.ela2.screen.comment;

import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class UserComment {

    private String comment;
    @ServerTimestamp private Date timstamp;

    public UserComment() {}

    public UserComment(String comment, Date timestamp) {
        this.comment = comment;
        this.timstamp = timestamp;
    }

    public String getComment() {
        return comment;
    }

    public Date getTimestamp() {
        return timstamp;
    }
}

