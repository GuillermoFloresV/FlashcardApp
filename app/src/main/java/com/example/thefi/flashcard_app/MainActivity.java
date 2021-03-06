package com.example.thefi.flashcard_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    findViewById(R.id.flashcard_question).setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            findViewById(R.id.flashcard_answer).setVisibility(View.VISIBLE);
            findViewById(R.id.flashcard_question).setVisibility(View.INVISIBLE);
            findViewById(R.id.flashcard_question2).setVisibility(View.INVISIBLE);
            findViewById(R.id.flashcard_answer2).setVisibility(View.INVISIBLE);

    }
});
        findViewById(R.id.flashcard_answer).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_question).setVisibility(View.VISIBLE);
                findViewById(R.id.flashcard_question2).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_answer2).setVisibility(View.INVISIBLE);

            }
        });

        findViewById(R.id.next_button).setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_question).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_answer2).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_question2).setVisibility(View.VISIBLE);
            }
        }));


        findViewById(R.id.flashcard_question2).setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_question).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_answer2).setVisibility((View.VISIBLE));
                findViewById(R.id.flashcard_question2).setVisibility((View.INVISIBLE));
            }
        }));

        findViewById(R.id.flashcard_answer2).setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_question).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_answer2).setVisibility((View.INVISIBLE));
                findViewById(R.id.flashcard_question2).setVisibility((View.VISIBLE));
            }
        }));

        findViewById(R.id.button2).setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_question).setVisibility(View.VISIBLE);
                findViewById(R.id.flashcard_answer2).setVisibility((View.INVISIBLE));
                findViewById(R.id.flashcard_question2).setVisibility((View.INVISIBLE));
            }
        }));
    }

}
