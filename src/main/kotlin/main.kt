fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionario(
        nome = "Alex",
        cpf = "123.456.789-09",
        salario = 1000.0
    )

    println("nome: ${alex.nome}")
    println("cpf: ${alex.cpf}")
    println("salario: ${alex.salario}")
    println("bonificacao: ${alex.bonificacao}")

    val fran = Gerente(
        nome = "Fra",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 123
    )

    if (fran.autentica(123)) {
        println("Usuário autenticado")
    } else {
        println("Usuário não autenticado")
    }

    println("nome: ${fran.nome}")
    println("cpf: ${fran.cpf}")
    println("salario: ${fran.salario}")
    println("bonificacao: ${fran.bonificacao}")

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 2000.0,
        senha = 123,
        plr = 1000.0
    )

    if (gui.autentica(123)) {
        println("Usuário autenticado")
    } else {
        println("Usuário não autenticado")
    }

    println("nome: ${gui.nome}")
    println("cpf: ${gui.cpf}")
    println("salario: ${gui.salario}")
    println("bonificacao: ${gui.bonificacao}")
    println("plr: ${gui.plr}")
}