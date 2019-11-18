package com.android.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView questionNumber;
    private TextView questionLabel;
    private Button answerBtn1;
    private Button answerBtn2;
    private Button answerBtn3;

    private String correctAnswer;
    private int numberOfCorrectAns = 0;
    private int questionCount = 1;

    ArrayList<ArrayList<String>> questionArray = new ArrayList<>();

    String questionData[][] = {

            {"1","One","Two","Nine"},
            {"10","Ten","Two","Three"},
            {"2","Two","Three","Nine"},
            {"9","Nine","Three","Eight"},
            {"3","Three","Four","Eight"},
            {"8","Eight","Four","Seven"},
            {"4","Four","Seven","Five"},
            {"7","Seven","Five","Six"},
            {"5","Five","One","Nine"},
            {"6","Six","Ten","One" },
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionNumber = findViewById(R.id.quesNum);
        questionLabel = findViewById(R.id.quesLabel);
        answerBtn1 = findViewById(R.id.ansbtn1);
        answerBtn2 = findViewById(R.id.ansbtn2);
        answerBtn3 = findViewById(R.id.ansbtn3);

        for(int i = 0; i < questionData.length;i++){

            ArrayList<String> tmpArray = new ArrayList<>();
            tmpArray.add(questionData[i][0]);
            tmpArray.add(questionData[i][1]);
            tmpArray.add(questionData[i][2]);
            tmpArray.add(questionData[i][3]);
            questionArray.add(tmpArray);
        }

        showNextQues();

    }

    public void showNextQues(){

        questionNumber.setText("Q"+ questionCount);

        Random random = new Random();
        int randomNum = random.nextInt(questionArray.size());

        ArrayList<String> question = questionArray.get(randomNum);

        questionLabel.setText(question.get(0));
        correctAnswer = question.get(1);
        question.remove(0);
        Collections.shuffle(question);


        answerBtn1.setText(question.get(0));
        answerBtn2.setText(question.get(1));
        answerBtn3.setText(question.get(2));

        questionArray.remove(randomNum);
    }
}
