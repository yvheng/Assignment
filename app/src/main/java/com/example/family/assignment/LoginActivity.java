package com.example.family.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private EditText editTextUs, editTextPassword;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUs = (EditText)findViewById(R.id.editTextUs);
        editTextPassword = (EditText)findViewById(R.id.editTextPassword);
    }

    public void login(View v){
        intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void register(View v){
        intent = new Intent(this, Register1Activity.class);
        startActivity(intent);
    }

    public void forgetPassword(View v){
        intent = new Intent(this, RecoveryActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
