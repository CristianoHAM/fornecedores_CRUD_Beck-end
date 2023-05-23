package com.example.fornecedores.dto;

import com.example.fornecedores.entities.Fornecedor;
import com.example.fornecedores.entities.FornecedorPJ;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FornecedorPJDTO {

    private Long id;
    private String nome;
    private String email;
    private String cep;
    private String tipo;
    private String cnpj;




    public FornecedorPJDTO(FornecedorPJ fornecedor){
         id = fornecedor.getId();
         nome = fornecedor.getNome();
         email = fornecedor.getEmail();
         cep = fornecedor.getCep();
         tipo = fornecedor.getTipo();
         cnpj = fornecedor.getCnpj();

    }



}
