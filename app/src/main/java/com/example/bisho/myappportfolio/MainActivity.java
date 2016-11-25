package com.example.bisho.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.movies_app) Button movies_btn;
    @BindView(R.id.stockhawk_app) Button stockhawk_btn;
    @BindView(R.id.material_design) Button materialdesign_btn;
    @BindView(R.id.go_ubiquitous_app) Button ubiquitous_btn;
    @BindView(R.id.builditbigger_app) Button builditbigger_btn;
    @BindView(R.id.capstone_app) Button capstone_btn;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        context = this;
        
        movies_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Popular Movies",Toast.LENGTH_SHORT).show();
            }
        });

        stockhawk_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Stock Hawk!",Toast.LENGTH_SHORT).show();
            }
        });

        materialdesign_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Build It Bigger",Toast.LENGTH_SHORT).show();
            }
        });

        ubiquitous_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Make Your App Material",Toast.LENGTH_SHORT).show();
            }
        });

        builditbigger_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Go Ubiquitous",Toast.LENGTH_SHORT).show();
            }
        });

        capstone_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Capstone",Toast.LENGTH_SHORT).show();
            }
        });

    }

}
