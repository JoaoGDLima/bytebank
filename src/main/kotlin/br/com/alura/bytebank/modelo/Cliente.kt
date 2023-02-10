package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Autenticavel

class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: Int
): Autenticavel {
    override fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}