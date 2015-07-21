package com.example.administrador.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity_HelloWorld extends AppCompatActivity {

    public static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity__hello_world);

        List<Client> clients = getClients();

        ListView listViewClientes = (ListView) findViewById(R.id.listViewCliente);

        ClientListAdapter clienteAdapter = new ClientListAdapter(MainActivity_HelloWorld.this, clients);

        listViewClientes.setAdapter(clienteAdapter);

    }

    private List<Client> getClients() {
        List<Client> clients = new ArrayList<>();

        Client renan = new Client();
        renan.setName("Renan");
        renan.setAge(23);
        clients.add(renan);

        Client aszamandas = new Client();
        aszamandas.setName("Aszamandas");
        aszamandas.setAge(36);
        clients.add(aszamandas);

        return clients;
    }
}
