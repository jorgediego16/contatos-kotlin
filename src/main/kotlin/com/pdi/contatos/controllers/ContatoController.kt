package com.pdi.contatos.controllers

import com.pdi.contatos.documents.Contato
import com.pdi.contatos.documents.dtos.ContatoDTO
import com.pdi.contatos.response.Response
import com.pdi.contatos.services.ContatoService
import org.springframework.http.ResponseEntity
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

/**
 * Classe responsável por controlar as requisições
 */
@RestController
@RequestMapping("/api/contatos")
class ContatoController (val contatoService: ContatoService) {

    /**
     * Método responsável por salvar um contato
     */
    @PostMapping("/salvar")
    fun salvar (@Valid @RequestBody contatoDTO: ContatoDTO, result: BindingResult): ResponseEntity<Response<ContatoDTO>> {
        val response: Response<ContatoDTO> = Response()
        val contato = Contato(contatoDTO.nome, contatoDTO.email, contatoDTO.telefone, contatoDTO.id)
        val contatoSalvo: Contato = contatoService.salvar(contato)
        response.data = ContatoDTO(contatoSalvo.nome, contatoSalvo.email, contatoSalvo.telefone, contatoSalvo.id)
        return ResponseEntity.ok(response)
    }

    /**
     * Método responsável por deletar um contato
     */
    @DeleteMapping("/delete/{email}")
    fun delete (@PathVariable email: String): ResponseEntity<Contato> {
        val contato: Contato? = contatoService.bucarPorEmail(email)
        if (contato != null) {
            contato.id?.let { contatoService.excluir(it) }
        }
        return ResponseEntity.ok().body(contato)
    }

    /**
     * Método responsável por listar todos os contatos cadastrados
     */
    @GetMapping("/list")
    fun list (): ResponseEntity<List<Contato>> {
        return ResponseEntity.ok().body(contatoService.listarTodos())
    }
}