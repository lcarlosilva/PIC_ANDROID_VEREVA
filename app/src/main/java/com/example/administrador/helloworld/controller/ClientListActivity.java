package com.example.administrador.helloworld.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.example.administrador.helloworld.R;
import com.example.administrador.helloworld.model.entities.Client;
import com.example.administrador.helloworld.model.persistence.MemoryClientRepository;

import java.util.ArrayList;
import java.util.List;


public class ClientListActivity extends AppCompatActivity {

    public static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_client);

        List<Client> clients = MemoryClientRepository.getInstance().getAll();

        ListView listViewClientes = (ListView) findViewById(R.id.listViewClient);

        ClientListAdapter clienteAdapter = new ClientListAdapter(ClientListActivity.this, clients);

        listViewClientes.setAdapter(clienteAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(R.menu.menu_client_list, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menuAdd) {
            startActivity(new Intent(this, ClientPersistenceActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

}
