package com.example.flashcardsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        EditText question = findViewById(R.id.question);
        EditText answer = findViewById(R.id.answer);
       // ImageView saveBtn;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);
        findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(AddCardActivity.this, MainActivity.class);
                AddCardActivity.this.startActivity(myIntent);
            }
        });

        findViewById(R.id.download).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ((EditText) findViewById(R.id.question)).getText().toString();
                ((EditText) findViewById(R.id.answer)).getText().toString();
                TextView question = findViewById(R.id.question);
                TextView answer = findViewById(R.id.answer);

                String questionString = question.getText().toString();
                String answerString = answer.getText().toString();

                Intent data = new Intent();
                data.putExtra("string1", questionString); // puts one string into the Intent, with the key as 'string1'
                data.putExtra("string2", answerString); // puts another string into the Intent, with the key as 'string2


                setResult(RESULT_OK, data); // set result code and bundle data for response
                finish();
            }
        });
    }
}