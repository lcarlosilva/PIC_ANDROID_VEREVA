package com.example.administrador.helloworld.model.entities;

import android.content.Intent;

import com.example.administrador.helloworld.model.persistence.MemoryClientRepository;

import java.util.List;

public class Client {

    private String name;
    private Integer age;
    private Integer peso;
    private String cpf;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void save() {
        MemoryClientRepository.getInstance().save(this);
    }

    public static List<Client> getAll() {
        return MemoryClientRepository.getInstance().getAll();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (!name.equals(client.name)) return false;
        if (!age.equals(client.age)) return false;
        if (!peso.equals(client.peso)) return false;
        return cpf.equals(client.cpf);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age.hashCode();
        result = 31 * result + peso.hashCode();
        result = 31 * result + cpf.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "\nClient" +
                "name ->'" + name + '\'' +
                "\n, age ->" + age +
                "\n, peso -> " + peso +
                "\n, cpf -> '" + cpf + '\'';
    }
}
