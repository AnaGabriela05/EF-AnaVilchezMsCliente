package com.ana.mscliente.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDtoRequest {

    private Integer idClienteDto;
    private String nombreClienteDto;
    private String apellidoClienteDto;
    private String nroCelularDto;
    private String direccionDto;
}
