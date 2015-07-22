package com.example.administrador.helloworld.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrador.helloworld.R;
import com.example.administrador.helloworld.model.entities.Client;

public class ClientPersistenceActivity extends AppCompatActivity {

    private EditText editTextNome;
    private EditText editTextAge;
    private EditText editTextCpf;
    private EditText editTextPeso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persistence_client);

        editTextNome = (EditText) findViewById(R.id.editTextNome);
        editTextAge = (EditText) findViewById(R.id.editTextAge);
        editTextCpf = (EditText) findViewById(R.id.editTextCpf);
        editTextPeso = (EditText) findViewById(R.id.editTextPeso);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(R.menu.menu_client_persist, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.menuSave) {
            Client client = bindClient();
            client.save();
            Toast.makeText(ClientPersistenceActivity.this, Client.getAll().toString(), Toast.LENGTH_LONG).show();
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    private Client bindClient() {
        Client client = new Client();

        client.setName(editTextNome.getText().toString());
        client.setAge(Integer.valueOf(editTextAge.getText().toString()));
        client.setCpf(editTextCpf.getText().toString());
        client.setPeso(Integer.valueOf(editTextPeso.getText().toString()));

        return client;
    }

    private void save() {

    }
}
