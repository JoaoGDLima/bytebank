class Conta(
    val titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            return true
        }
        return false
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saca(valor)) {
            destino.deposita(valor)

            return true
        }

        return false
    }
}