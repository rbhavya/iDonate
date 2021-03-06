package com.example.loginregister;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    database_helper myDb;
    Button blogin;
    Button bRegister;
    EditText etName, etUsername, etBloodGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new database_helper(this);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etName = (EditText) findViewById(R.id.etName);
        blogin = (Button) findViewById(R.id.blogin);
        bRegister = (Button) findViewById(R.id.bRegister);
        blogin.setOnClickListener(this);
        bRegister.setOnClickListener(this);

    }


    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.blogin:
                Intent intent = new Intent(this, Login.class);
                startActivity(intent);
                break;
            case R.id.bRegister:
                Intent intent1 = new Intent(this, Register.class);
                startActivity(intent1);
                break;


        }
    }


}
