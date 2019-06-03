package com.uerj.arangodb.controller;

import com.uerj.arangodb.entity.Cliente;
import com.uerj.arangodb.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping("/clientes")
    public Iterable<Cliente> getTodosClientes() {
        return clienteRepository.getClientes();
    }

    @PostMapping("/clientes")
    public void cadastrarCliente(@Valid @RequestBody Cliente cliente) {
        clienteRepository.cadastrarCliente(cliente.getNome(), cliente.getUltimoNome(), cliente.getEmail());
    }

}
