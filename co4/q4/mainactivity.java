package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();

        Button btn1 = findViewById(R.id.b1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
fragmentManager.beginTransaction()
        .

    replace(R.id.fragmentContainerView, fragment1.class, null)
    .

    setReorderingAllowed(true)
    .

    addToBackStack("name") // name can be null
    .

    commit();
}
        });
        Button btn2 = findViewById(R.id.b2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                                .

                        replace(R.id.fragmentContainerView, fragment2.class, null)
                                .

                        setReorderingAllowed(true)
                                .

                        addToBackStack("name") // name can be null
                        .

                        commit();
            }
        });
        Button btn3 = findViewById(R.id.b3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                                .

                        replace(R.id.fragmentContainerView, fragment3.class, null)
                                .

                        setReorderingAllowed(true)
                                .

                        addToBackStack("name") // name can be null
                        .

                        commit();
            }
        });
}
}