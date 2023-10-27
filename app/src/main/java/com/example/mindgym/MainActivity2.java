package com.example.mindgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private EditText useredit, pswdedit;
    private Button loginbutton;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initView();

        button1 = (Button) findViewById(R.id.reg);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openMainActivity3();
            }
        });
    }

    private void initView() {

        useredit = findViewById(R.id.loginuser);
        pswdedit = findViewById(R.id.loginpswd);
        loginbutton = findViewById(R.id.loginbutton);

        loginbutton.setOnClickListener(v -> {
            if (useredit.getText().toString().isEmpty() || pswdedit.getText().toString().isEmpty()){
                Toast.makeText(MainActivity2.this, "Please fill your username and password", Toast.LENGTH_SHORT).show();
            } else if (useredit.getText().toString().equals("test") && pswdedit.getText().toString().equals("test")) {
                startActivity(new Intent(MainActivity2.this, Home.class));
            } else {
                Toast.makeText(MainActivity2.this, "Your username and password is not correct", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void openMainActivity3(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}