package com.yu.atm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText edPassword;
    private Button login;
    private EditText edUsername;
    private String password;
    private String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = findViewById(R.id.login);
        edUsername = findViewById(R.id.username);
        edPassword = findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = edUsername.getText().toString();
                password = edPassword.getText().toString();
                if("andy".equals(username)&&"1234".equals(password)){
                    setResult(RESULT_OK);
                    finish();
                }else{
                    new AlertDialog.Builder(LoginActivity.this)
                            .setTitle("登入訊息")
                            .setMessage("登入失敗")
                            .setPositiveButton("OK",null)
                            .show();
                }
            }
        });

    }
}
