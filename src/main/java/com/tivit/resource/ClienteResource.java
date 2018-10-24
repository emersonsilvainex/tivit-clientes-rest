package com.tivit.resource;

import com.tivit.model.Cliente;
import com.tivit.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(value = "/clientes")
    public List<Cliente> listar() {
        return clienteService.findAll();
    }

    @GetMapping(value = "/total")
    public long count() {
        return clienteService.getTotalClientes();
    }

    @GetMapping("/cpf/{cpf}")
    public Cliente getClienteById(@PathVariable("cpf") String cpf) {
        return clienteService.findByCpf(cpf);
    }
}
