package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data // gerando constructs e getters e setters automaticos
@Entity // apontando que essa classe é uma entidade
@Table(name = "TB_EMAIL") // gerando o nome da tabela no ms_email
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id // apontando que o emailID é o ID(único) na tabela
    @GeneratedValue(strategy = GenerationType.AUTO) // gerando o emailId de uma maneira automatica
    private Long emailID; // id do email
    private String ownerRef; // referencia ao do proprietario (pela ID dele)
    private String emailFrom; // quem esta mandando o email
    private String emailTo; // para quem o email esta sendo enviado
    private String subject; // titulo do email

    @Column(columnDefinition = "TEXT") // inserindo mais caracters na String no banco (por padrao a String tem 255 de tamanho)
    private String text; // corpo do email
    private LocalDateTime sendDateEmail; // enviando a data de agora 
    private StatusEmail statusEmail; // status do email (se foi enviado ou teve algum erro) (classe enum)
}
