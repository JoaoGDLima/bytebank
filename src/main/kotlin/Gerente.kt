class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario
        }
}