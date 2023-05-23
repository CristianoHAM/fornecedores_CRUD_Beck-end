package com.example.fornecedores.dto;

import com.example.fornecedores.entities.Fornecedor;
import com.example.fornecedores.entities.FornecedorPF;
import com.example.fornecedores.entities.FornecedorPJ;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FornecedorDTO {

    private Long id;
    private String nome;
    private String email;
    private String cep;
    private String tipo;
    private String cnpj;
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;



    public FornecedorDTO(FornecedorPJ fornecedor){
        nome = fornecedor.getNome();
        email = fornecedor.getEmail();
        cep = fornecedor.getCep();
        tipo = fornecedor.getTipo();
        cnpj = fornecedor.getCnpj();
        cpf = null;
        rg = null;
        dataNascimento = null;
    }
    public FornecedorDTO(FornecedorPF fornecedor){
        nome = fornecedor.getNome();
        email = fornecedor.getEmail();
        cep = fornecedor.getCep();
        tipo = fornecedor.getTipo();
        cnpj = null;
        cpf = fornecedor.getCpf();
        rg = fornecedor.getRg();
        dataNascimento = fornecedor.getDataNascimento();
    }


}
