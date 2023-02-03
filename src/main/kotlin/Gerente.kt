class Gerente(val senha: Int) {

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}