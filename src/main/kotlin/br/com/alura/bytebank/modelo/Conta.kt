package br.com.alura.bytebank.modelo

abstract class Conta(
    val titular: String,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    abstract fun saca(valor: Double): Boolean

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saca(valor)) {
            destino.deposita(valor)

            return true
        }

        return false
    }
}