package com.ms.email.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailDto { // metodo recenbendo entrada no metodo post

    @NotBlank  //se estiver faltando algum campo vai mostrar para o usuario que determinado campo é obrigatorio
    private String ownerRef; // referencia ao do proprietario (pela ID dele)
    @NotBlank  //se estiver faltando algum campo vai mostrar para o usuario que determinado campo é obrigatorio
    @Email // verificando se o email é valido
    private String emailFrom; // quem esta mandando o email
    @NotBlank  //se estiver faltando algum campo vai mostrar para o usuario que determinado campo é obrigatorio
    @Email // verificando se o email é valido
    private String emailTo; // para quem o email esta sendo enviado
    @NotBlank  //se estiver faltando algum campo vai mostrar para o usuario que determinado campo é obrigatorio
    private String subject; // titulo email
    @NotBlank  //se estiver faltando algum campo vai mostrar para o usuario que determinado campo é obrigatorio
    private String text; // corpo do email
}
