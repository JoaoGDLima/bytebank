package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Conta

class ContaCorrente(titular: String, numero: Int) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double): Boolean {
        val valorComTaxa = valor + 0.1

        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
            return true
        }
        return false
    }
}