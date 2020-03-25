package com.pdi.contatos.services

import com.pdi.contatos.documents.Contato

/**
 * Interface do serviço de contatos
 */
interface ContatoService {

    /**
     * Método resposável por retornar um contato por e-mail
     */
    fun bucarPorEmail (email: String): Contato?

    /**
     * Método resposável por retornar um contato por nome
     */
    fun bucarPorNome (nome: String): Contato?

    /**
     * Método resposável por retornar um contato por telefone
     */
    fun bucarPorTelefone (telefone: String): Contato?

    /**
     * Método resposável por salvar um contato
     */
    fun salvar (contato: Contato): Contato

    /**
     * Método resposável por excluir um contato
     */
    fun excluir (id: String)

    /**
     * Método resposável por retornar todos os contatos cadastrados
     */
    fun listarTodos (): List<Contato>
}