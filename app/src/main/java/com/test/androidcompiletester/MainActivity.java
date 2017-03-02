package com.test.androidcompiletester;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    FactoriedFactory factory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // don't need this to cause build error but I put it in for completeness
        DaggerTheComponent.builder().theModule(new TheModule()).build().inject(this);
    }
}
