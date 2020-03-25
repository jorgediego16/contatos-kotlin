package com.pdi.contatos.documents.dtos

import org.hibernate.validator.constraints.Length
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

data class ContatoDTO (

        /*Nome do contato*/
        @get:NotEmpty(message = "Nome não pode ser vazio")
        @get:Length(min = 3, max = 200, message = "Nome deve ter entre 3 e 200 caractéres")
        val nome: String,

        /*E-mail do contato*/
        @get:Email(message = "E-mail inválido")
        val email: String,

        /*Telefone do contato*/
        @get:NotEmpty(message = "Telefone não pode ser vazio")
        @get:Length(min = 9, max = 10, message = "Telefone deve ter 9 ou 10 caractéres")
        val telefone: String,

        /*Id do contato*/
        val id: String? = null
)