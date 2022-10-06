package com.if31.kuis2125250052;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnSignUp, btnLogin, btnPlg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlg = findViewById(R.id.btn_plg);
        btnSignUp = findViewById(R.id.btn_signup);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    btnPlg.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent inte = new Intent(Intent.ACTION_VIEW);
            inte.setData(Uri.parse("https://www.palembang.go.id"));
            startActivity(inte);
        }
    });
    }
}