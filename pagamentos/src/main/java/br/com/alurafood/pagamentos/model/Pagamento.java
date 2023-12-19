package br.com.alurafood.pagamentos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "pagamentos")
@Getter
@Setter
@NoArgsConstructor
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "valor")
    @NotNull
    private BigDecimal valor;

    @Column(name = "nome")
    @NotBlank
    @Size(max = 100)
    private String nome;

    @Column(name = "numero")
    @NotBlank
    @Size(max = 19)
    private String numero;

    @Column(name = "expiracao")
    @NotBlank
    @Size(max = 7)
    private String expiracao;

    @Column(name = "codigo")
    @NotBlank
    @Size(min = 3, max = 3)
    private String codigo;

    @Column(name = "status")
    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "pedido_id")
    @NotNull
    private Long pedidoId;

    @Column(name = "forma_de_pagamento_id")
    @NotNull
    private Long formaDePagamentoId;

}
