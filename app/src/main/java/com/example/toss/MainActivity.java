package com.example.toss;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView coinImage;  //for using coinimage from xml file
    TextView resultText; //for using alignment of text from xml file by using "resultText" id
    Button tossButton; //for using button id from xaml file

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coinImage = findViewById(R.id.coinImage);
        resultText = findViewById(R.id.resultText);
        tossButton = findViewById(R.id.tossButton);
        tossButton.setOnClickListener(v -> {  //for writing logic
            Random random = new Random();

            int result = random.nextInt(2);
            if(result == 0){
                resultText.setText("HEADS");
                coinImage.setImageResource(R.drawable.heads);
            }
            else {
                resultText.setText("TAILS");
                coinImage.setImageResource(R.drawable.tails);
            }
        });
        }
    }