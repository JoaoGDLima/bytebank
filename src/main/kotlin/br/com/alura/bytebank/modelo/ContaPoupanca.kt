package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Conta

class ContaPoupanca(titular: String, numero: Int) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            return true
        }
        return false
    }
}