package ru.unfortunately.school.customview2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//    private FinanceProgressView progressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        progressView = findViewById(R.id.finance_progress);
//        progressView.setmProgress(75);
    }
}
