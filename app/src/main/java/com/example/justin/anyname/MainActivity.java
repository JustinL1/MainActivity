package com.example.justin.anyname;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login = (Button) findViewById(R.id.loginButton);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View V){
                Intent intent = new Intent (getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }

        });
        Button signUp = (Button) findViewById(R.id.signUpButton);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View V){
                Intent intent = new Intent (getApplicationContext(), signUpActivity.class);
                startActivity(intent);
            }

        });
    }
}
