package com.ms.email.controllers;

import com.ms.email.dtos.EmailDto;
import com.ms.email.models.EmailModel;
import com.ms.email.services.EmailService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    EmailService emailService;

    //metodo de envio de email
    @PostMapping("/sending-email")
    public ResponseEntity<EmailModel> sendingEmail(@RequestBody @Valid EmailDto emailDto){ //validaçao do campos
        EmailModel emailModel = new EmailModel(); // instanciando a classe EmailModel
        BeanUtils.copyProperties(emailDto, emailModel); // convertendo de dto para model
        emailService.sendEmail(emailModel); // enviando a conversao de dto para model para o metodo quanto de salvamento e envio de email(EmailService)
        return new ResponseEntity<>(emailModel, HttpStatus.CREATED);
    }
}
