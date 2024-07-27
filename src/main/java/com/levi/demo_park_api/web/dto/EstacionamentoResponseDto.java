package com.levi.demo_park_api.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class EstacionamentoResponseDto {

    private String placa;

    private String marca;

    private String modelo;

    private String cor;

    private String clienteCpf;

    private String recibo;

    private LocalDateTime dataEntrada;

    private LocalDateTime dataSaida;

    private String vagaCodigo;

    private BigDecimal valor;

    private BigDecimal desconto;
}