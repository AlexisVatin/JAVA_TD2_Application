package com.example.td2_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";
    public static String NOM = "nom";

    private EditText editText;
    private Button button;
    private String prenom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void connect(View view) {
        Log.d("MainActivity", "J'ai clické");

        if (((EditText) findViewById(R.id.etPassword)).getText().toString().equals("xxx")) { ;
        Log.d(TAG, "Psw OK");
        String name = ((EditText) findViewById(R.id.etName)).getText().toString();

        Intent it = new Intent(MainActivity.this, DetailActivite.class);

        it.putExtra("nom", name);

        startActivity(it);
    }
    else
            Toast.makeText(this, "Accès refusé", Toast.LENGTH_SHORT).show();
    }
}
