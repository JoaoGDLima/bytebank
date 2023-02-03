class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    fun bonificaao(): Double {
        return this.salario * 0.1
    }
}