package br.com.alura.bytebank.teste

fun testaLacos() {
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