package com.smartwarehouse.aldillaputri.smartwarehouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.smartwarehouse.aldillaputri.smartwarehouse.activity.MainActivity;

public class LoginActivity extends AppCompatActivity {

    public TextView tv1;
    public EditText et1, et2;
    public Button btn1, btn2;
    public RelativeLayout rl1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        rl1 = findViewById(R.id.login_relative1);
        tv1 = findViewById(R.id.login_atau);
        et1 = findViewById(R.id.namaPengguna);
        et2 = findViewById(R.id.password);
        btn1 = findViewById(R.id.masuk);
        btn2 = findViewById(R.id.lupa_password);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


}
