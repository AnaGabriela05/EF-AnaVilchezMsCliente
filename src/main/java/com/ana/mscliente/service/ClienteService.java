package com.ana.mscliente.service;

import com.ana.mscliente.dto.response.ClienteDtoResponse;
import com.ana.mscliente.dto.request.ClienteDtoRequest;

import java.util.List;

public interface ClienteService {

    public void guardarCliente(ClienteDtoRequest cliente);
    public List<ClienteDtoResponse> listarClientes();
}
