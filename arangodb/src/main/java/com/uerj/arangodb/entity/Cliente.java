package com.uerj.arangodb.entity;

import org.springframework.data.annotation.Id;

import com.arangodb.springframework.annotation.Document;
import com.arangodb.springframework.annotation.HashIndex;

@Document("clientes")
@HashIndex(fields = { "nome", "ultimoNome" }, unique = true)
public class Cliente {

    @Id
    private String id;

    private String nome;
    private String ultimoNome;
    private String email;
    private String telefone;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente() {
        super();
    }

    public Cliente(final String nome, final String ultimoNome, final String email) {
        super();
        this.nome = nome;
        this.ultimoNome = ultimoNome;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(final String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nome=" + nome + ", ultimoNome=" + ultimoNome + ", email=" + email + "]";
    }

}
