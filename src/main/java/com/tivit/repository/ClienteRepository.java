package com.tivit.repository;

import com.tivit.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

    Cliente findByCpf(String lastname);
}
