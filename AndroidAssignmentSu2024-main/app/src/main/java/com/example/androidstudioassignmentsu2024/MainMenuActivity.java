package com.example.androidstudioassignmentsu2024;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainMenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // DO NOT MODIFY!
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Button btnCreateFlashcard = findViewById(R.id.btnCreateFlashcard);
        Button btnStartQuiz = findViewById(R.id.btnStartQuiz);


        // TODO 1: Program the btnCreateFlashcard and btnStartQuiz to trigger intents
        //  Intent should switch the activity on screen to CreateFlashcardActivity when btnCreateFlashcard is clicked
        //  Intent should switch the activity on screen to QuizActivity when btnStartQuiz is clicked

    }
}
