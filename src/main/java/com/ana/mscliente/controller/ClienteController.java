package com.ana.mscliente.controller;

import com.ana.mscliente.dto.request.ClienteDtoRequest;
import com.ana.mscliente.dto.response.ClienteDtoResponse;
import com.ana.mscliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @RequestMapping("/listar")
    public @ResponseBody List<ClienteDtoResponse> listarClientes() {

        return clienteService.listarClientes();
    }

    @PostMapping("/guardar")
    public @ResponseBody void guardarCliente(@RequestBody ClienteDtoRequest cliente) {

        clienteService.guardarCliente(cliente);
    }
}
