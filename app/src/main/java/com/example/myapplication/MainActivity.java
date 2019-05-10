
package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("monika","onstart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("manish","onstop");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("vinita","oncreate");



        final Button btn = findViewById(R.id.btn);
        final EditText edittext = findViewById(R.id.edittext);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this, classtwo.class);
                intent.putExtra("key", edittext.getText().toString());
                startActivity(intent);
            }
        });




    }
}
