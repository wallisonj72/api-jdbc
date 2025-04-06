package com.wallison.api_jdbc.controller;

import com.wallison.api_jdbc.model.Cliente;
import com.wallison.api_jdbc.repository.ClienteRepositoryImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@Tag(name = "Api usando Swaggwer e Jdbc")
public class ClienteController {
    private final ClienteRepositoryImpl clienteRepositoryImpl;

    public ClienteController(ClienteRepositoryImpl clienteRepositoryImpl) {
        this.clienteRepositoryImpl = clienteRepositoryImpl;
    }

    @Operation(summary = "Retorna todos os clientes", description = "Retorna todos os clientes da base de dados")
    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteRepositoryImpl.listarTodos();
    }

    @Operation(summary = "Registra um novo cliente", description = "Adiciona clientes um a um!", tags = {"Salvar", "Clientes"})
    @PostMapping
    public void salvarClientes(@RequestBody Cliente cliente) {
        clienteRepositoryImpl.salvar(cliente);
    }
}
