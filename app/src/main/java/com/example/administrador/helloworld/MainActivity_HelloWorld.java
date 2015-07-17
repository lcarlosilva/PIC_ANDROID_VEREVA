package com.example.administrador.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity_HelloWorld extends AppCompatActivity {

    public static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity__hello_world);
        Log.i(TAG, "onCreate");

        TextView minhaView = (TextView) findViewById(R.id.textView);

        minhaView.setText("Minions ipsum jeje bananaaaa me want bananaaa! Uuuhhh bananaaaa para tú ti aamoo!" +
                "Bananaaaa tatata bala tu daa tulaliloo.");

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        /*aqui eu configuro como quero que seja mostrado minha mensagem*/
                        Toast.makeText(MainActivity_HelloWorld.this,"Cliquei aki!",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
