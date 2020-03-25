package com.pdi.contatos.repositories

import com.pdi.contatos.documents.Contato
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Repositório responsável por fazer as requisições no banco de dados
 */
interface ContatoRepository : MongoRepository <Contato, String> {

    /**
     * Método responsável por buscar um contato por nome no banco de dados
     */
    fun findByNome(nome: String): Contato

    /**
     * Método responsável por buscar um contato por e-mail no banco de dados
     */
    fun findByEmail(email: String): Contato

    /**
     * Método responsável por buscar um contato por telefone no banco de dados
     */
    fun findByTelefone(telefone: String): Contato
}