package com.pdi.contatos.services.impl

import com.pdi.contatos.documents.Contato
import com.pdi.contatos.repositories.ContatoRepository
import com.pdi.contatos.services.ContatoService
import org.springframework.stereotype.Service

/**
 * Classe responsável por implementar os métodos do serviço de contatos
 */
@Service
class ContatoServiceImpl(val contatoRepository: ContatoRepository) : ContatoService {

    /**
     * Método resposável por retornar um contato por e-mail (implementação)
     */
    override fun bucarPorEmail(email: String): Contato? = contatoRepository.findByEmail(email)

    /**
     * Método resposável por retornar um contato por nome (implementação)
     */
    override fun bucarPorNome(nome: String): Contato? = contatoRepository.findByNome(nome)

    /**
     * Método resposável por retornar um contato por telefone (implementação)
     */
    override fun bucarPorTelefone(telefone: String): Contato? = contatoRepository.findByTelefone(telefone)

    /**
     * Método resposável por salvar um contato (implementação)
     */
    override fun salvar(contato: Contato): Contato = contatoRepository.save(contato)

    /**
     * Método resposável por excluir um contato (implementação)
     */
    override fun excluir(id: String) = contatoRepository.deleteById(id)

    /**
     * Método resposável por retornar todos os contatos cadastrados (implementação)
     */
    override fun listarTodos(): List<Contato> = contatoRepository.findAll()
}