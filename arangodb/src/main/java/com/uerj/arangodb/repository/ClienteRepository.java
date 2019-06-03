package com.uerj.arangodb.repository;

import com.arangodb.springframework.annotation.Query;
import com.arangodb.springframework.repository.ArangoRepository;
import com.uerj.arangodb.entity.Cliente;

public interface ClienteRepository extends ArangoRepository<Cliente, String> {

    @Query("FOR c IN clientes RETURN c")
    Iterable<Cliente> getClientes();

    @Query("INSERT { nome: ?1, ultimoNome: ?2, email: ?3 } INTO clientes")
    void cadastrarCliente(String nome, String ultimoNome, String email);

}
