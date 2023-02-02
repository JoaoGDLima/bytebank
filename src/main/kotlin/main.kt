fun main() {
    println("Bem vindo ao Bytebank")

    val conta1 = Conta()
    conta1.titular = "Alex"
    conta1.depositar(100.0)

    val conta2 = Conta()
    conta2.titular = "Fran"

    println("Saldo Alex: ${conta1.saldo}")
}

class Conta{
    var titular = ""
    var numeroConta = 0
    var saldo = 0.0

    fun depositar(valor: Double){
        this.saldo += valor
    }
    fun sacar(){

    }
    fun transferir(){

    }
}

fun testalacos(){
    for (i in 1..5) {
        val titular = "João Guilherme $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("saldo da conta: $saldo")

        testaCondicao(saldo)
    }
}

fun testaCondicao(saldo: Double) {
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}