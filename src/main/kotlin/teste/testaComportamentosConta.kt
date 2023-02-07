package teste

import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaComportamentosConta() {


    val conta1 = ContaCorrente(titular = "Alex", numero = 1000)
    conta1.deposita(100.0)

    val conta2 = ContaPoupanca(titular = "Fran", numero = 1001)
    conta2.deposita(100.0)

    println("Saldo Alex: ${conta1.saldo}")

    if (conta1.transfere(50.0, conta2)) {
        println("Transferência realizada!")
    } else {
        println("Falha ao realizar transferência!")
    }

    println("Saldo Alex: ${conta1.saldo}")
    println("Saldo Fran: ${conta2.saldo}")
}