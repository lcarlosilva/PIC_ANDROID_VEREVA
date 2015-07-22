package com.example.administrador.helloworld.model.persistence;

import com.example.administrador.helloworld.model.entities.Client;

import java.util.List;

public interface ClientRepository {

    public abstract void save(Client client);

    public abstract List<Client> getAll();

    public abstract void delete(Client client);

}