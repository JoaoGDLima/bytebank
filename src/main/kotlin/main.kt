fun main() {
    println("Bem vindo ao Bytebank")

    val titular = "João Guilherme"
    val numeroConta = 1000
    var saldo = 0.0

//    saldo = 100 + 2.0
//    saldo += 2.0

    println("Titular: $titular")
    println("Número da conta: $numeroConta")
    println("saldo da conta: $saldo")

    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}