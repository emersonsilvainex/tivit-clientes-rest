package com.tivit.service;

import com.tivit.model.Cliente;

import java.util.List;

public interface ClienteService {

    long getTotalClientes();

    List<Cliente> findAll();

    Cliente findByCpf(String cpf);
}
