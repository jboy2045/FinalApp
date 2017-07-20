package com.creid.finalapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

        public void gotoRegister(View view){


            //Create an intent in order to launch the Register Activity
            Intent intent = new Intent(getApplicationContext(), Main2Activity.class);

            startActivity(intent);
        }

        public void gotoManage(View view){

            //test
       }

       public void tryLogin(View view) {

           EditText usernameEditText = (EditText) findViewById(R.id.EmailText);
           EditText passwordEditText = (EditText) findViewById(R.id.PasswordText);

           String username = usernameEditText.getText().toString();
           String passwordEntered = passwordEditText.getText().toString();

           Log.i("Info", "Username is:" + username);
           Log.i("Info", "Username is:" + username);

       }

    


   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       SharedPreferences sharedPreferences = this.getSharedPreferences("com.creid.sharedpreferences", Context.MODE_PRIVATE);

       sharedPreferences.edit().putString("test@test.com", "password").apply();
    }
}
