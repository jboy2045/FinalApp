package com.creid.finalapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        public void gotoRegister(View view){


            //Create an intent in order to launch the Register Activity
            Intent intent = new Intent(getApplicationContext(), Main2Activity.class);

            startActivity(intent);
        }

        public void goToManage(View view){


        //Create an intent in order to launch the Manage Activity
        Intent intent = new Intent(getApplicationContext(), ManageActivity.class);

        startActivity(intent);
    }




       public void tryLogin(View view) {

           SharedPreferences sharedPreferences = this.getSharedPreferences("com.creid.sharedpreferences", Context.MODE_PRIVATE);


           EditText usernameEditText = (EditText) findViewById(R.id.EmailText);
           EditText passwordEditText = (EditText) findViewById(R.id.PasswordText);

           String username = usernameEditText.getText().toString();
           String passwordEntered = passwordEditText.getText().toString();

           String passwordStored = sharedPreferences.getString(username, "");

           Log.i("Info", "Username is:" + username);
           Log.i("Info", "Password entered is:" + passwordEntered);
           Log.i("Info", "Password stored is:" + passwordStored);

           if (passwordStored.equals(passwordEntered)) {
               Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
               goToManage(view);
           }
       }

    


   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       SharedPreferences sharedPreferences = this.getSharedPreferences("com.creid.sharedpreferences", Context.MODE_PRIVATE);

       sharedPreferences.edit().putString("test@test.com", "password").apply();
    }
}
