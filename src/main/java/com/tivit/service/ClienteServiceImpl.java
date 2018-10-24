package com.tivit.service;

import com.tivit.model.Cliente;
import com.tivit.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public long getTotalClientes() {
        return clienteRepository.count();
    }

    public Cliente findByCpf(String cpf) {
        return clienteRepository.findByCpf(cpf);
    }
}
