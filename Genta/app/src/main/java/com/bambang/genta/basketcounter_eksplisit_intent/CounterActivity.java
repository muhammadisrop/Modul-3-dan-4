package com.bambang.genta.basketcounter_eksplisit_intent;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bambang.genta.R;

public class CounterActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    int reset = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        String recNameTimA = getIntent().getStringExtra("TIM A");
        String recNameTimB = getIntent().getStringExtra("TIM B");

        TextView tvNameTimA = findViewById(R.id.tv_name_tim_a);
        TextView tvNameTimB = findViewById(R.id.tv_name_tim_b);

        tvNameTimA.setText(recNameTimA);
        tvNameTimB.setText(recNameTimB);
    }

    public void counter(View view) {
        if (view.getId() == R.id.btn_score_one_tim_a) {
            scoreA = scoreA + 1;
        } else if (view.getId() == R.id.btn_score_two_tim_a) {
            scoreA = scoreA + 2;
        } else if (view.getId() == R.id.btn_score_three_tim_a) {
            scoreA = scoreA + 3;
        } else if (view.getId() == R.id.btn_reset_score_time_a) {
            scoreA = scoreA * reset;
        } else if (view.getId() == R.id.btn_reset_score_time_b) {
            scoreB = scoreB * reset;
        } else if (view.getId() == R.id.btn_score_one_tim_b) {
            scoreB = scoreB + 1;
        } else if (view.getId() == R.id.btn_score_two_tim_b) {
            scoreB = scoreB + 2;
        } else if (view.getId() == R.id.btn_score_three_tim_b) {
            scoreB = scoreB + 3;
        }

        TextView tvScoreTeamA = findViewById(R.id.tv_score_tim_a);
        TextView tvScoreTeamB = findViewById(R.id.tv_score_tim_b);

        tvScoreTeamA.setText(String.valueOf(scoreA));
        tvScoreTeamB.setText(String.valueOf(scoreB));
    }


}
