package com.pdi.contatos.response

/**
 * Classe modelo para as respostas da API
 */
data class Response<T> (

        /*Erros*/
        val erros: ArrayList<String> = arrayListOf(),
        /*Dados*/
        var data: T? = null
)