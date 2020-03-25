package com.pdi.contatos.documents

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Entidade que representa um contato
 */
@Document
data class Contato (

        /*Nome do contato*/
        val nome: String,

        /*E-mail do contato*/
        val email: String,

        /*Telefone do contato*/
        val telefone: String,

        /*Id do contato*/
        @Id val id: String? = null
)