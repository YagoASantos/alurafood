package br.com.alurafood.pagamentos.dto;

import br.com.alurafood.pagamentos.model.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record PagamentoDto(
        Long id,
        @NotNull
        BigDecimal valor,
        @NotBlank
        @Size(max = 100)
        String nome,
        @NotBlank
        @Size(max = 19)
        String numero,
        @NotBlank
        @Size(max = 7)
        String expiracao,
        @NotBlank
        @Size(min = 3, max = 3)
        String codigo,
        @NotNull
        Status status,
        @NotNull
        Long formaDePagamentoId,
        @NotNull
        Long pedidoId
) {
}
