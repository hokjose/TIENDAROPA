
package com.example.ms_cliente.dto;

import lombok.Data;

@Data
public class DniResponse {
    private String dni;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
}