package com.uerj.arangodb.runner;

import com.arangodb.springframework.core.ArangoOperations;
import com.uerj.arangodb.entity.Cliente;
import com.uerj.arangodb.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;
import java.util.Collection;

@ComponentScan("com.uerj.arangodb")
public class CrudRunner implements CommandLineRunner {

    @Autowired
    private ArangoOperations operations;
    @Autowired
    private ClienteRepository repository;

    @Override
    public void run(final String... args) throws Exception {
        //Apagando registros no banco
        operations.dropDatabase();

        //Adicionando alguns clientes na base
        final Collection<Cliente> createClientes = criarClientes();
        repository.saveAll(createClientes);

    }

    public static Collection<Cliente> criarClientes() {
        return Arrays.asList(new Cliente("Leonardo", "Santos", "email@teste"), new Cliente("Luana", "Riemsdijk", "email@teste"));
    }

}
