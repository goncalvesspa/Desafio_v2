package com.example.desafio_v2.domain.dto.response;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class StatusEventoResponse {
    
    private Integer IdEventoStatus;

    private String NomeStatus;
}