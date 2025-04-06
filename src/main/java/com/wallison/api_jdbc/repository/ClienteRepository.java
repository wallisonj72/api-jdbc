package com.wallison.api_jdbc.repository;

import com.wallison.api_jdbc.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository {
    List<Cliente> listarTodos();
    void salvar(Cliente cliente);
}
