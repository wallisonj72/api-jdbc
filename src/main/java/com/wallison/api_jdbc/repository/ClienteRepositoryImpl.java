package com.wallison.api_jdbc.repository;

import com.wallison.api_jdbc.model.Cliente;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClienteRepositoryImpl implements ClienteRepository{
    private final JdbcTemplate jdbcTemplate;

    public ClienteRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Cliente> listarTodos() {
        String sql = "SELECT * FROM clientes";
        return jdbcTemplate.query(sql,
                (rs, rowNum) ->
                new Cliente(
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getString("cpf")));
    }

    @Override
    public void salvar(Cliente cliente) {
        String sql = "INSERT INTO clientes (nome, email, cpf) VALUES(?, ?, ?)";
        jdbcTemplate.update(sql, cliente.getNome(), cliente.getEmail(), cliente.getCpf());
    }
}