package com.maylis.moodtracker;

import android.app.Activity;
import android.app.Dialog;
import android.widget.Button;
import android.widget.TextView;


class MoodDialogActivity extends Dialog {

    private String comment;
    private String dialogComment;
    private Button cancelButton, validateButton;
    private TextView commentView, dialogCommentView;

    MoodDialogActivity(Activity activity)
    {
        super (activity, R.style.Theme_AppCompat_DayNight_Dialog);
        setContentView(R.layout.dialog_template);
        this.comment = "Commentaire";
        this.dialogComment = "";
        this.cancelButton = findViewById(R.id.activity_mood_dialog_cancel_btn);
        this.validateButton = findViewById(R.id.activity_mood_dialog_validate_btn);
        this.commentView = findViewById(R.id.activity_mood_dialog_title_comment_txt);
        this.dialogCommentView = findViewById(R.id.activity_mood_dialog_message_comment_txt);
    }

    void setComment(){
        this.comment = "Commentaire";}

    String getCurrentTextComment(){
        return commentView.getText().toString();
    }

    void setDialogComment(){
        this.dialogComment = "";
    }

    Button getCancelButton(){
        return cancelButton;
    }

    Button getValidateButton(){
        return validateButton;
    }

    void build(){

        show();
        commentView.setText(comment);
        dialogCommentView.setText(dialogComment);
    }
}

