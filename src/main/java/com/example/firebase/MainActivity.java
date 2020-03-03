package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



    public class MainActivity extends AppCompatActivity {
        EditText mobile;
        Button button;
        String no;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mobile = (EditText) findViewById(R.id.mobile);
            button = (Button)  findViewById(R.id.button);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    no = mobile.getText().toString();
                    validNo(no);
                    Intent intent = new Intent(MainActivity.this,VerifyActivity.class);
                    intent.putExtra("mobile",no);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this,no,Toast.LENGTH_LONG).show();
                }

            });
        }
        private void validNo(String no){
            if (no.isEmpty()||no.length() < 10){
                mobile.setError("ENTER A VALID NO");
                mobile.requestFocus();
                return;
            }
        }
    }

