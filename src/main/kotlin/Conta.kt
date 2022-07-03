class Conta(
    val titular: String,
    val conta: Int
) {
    var saldo = 0.0
        private set


    fun sacar(saque: Double) {
        if (saque <= this.saldo) {
            this.saldo -= saque
        } else {
            println("Você não tem saldo suficiente")
        }
    }

    fun depositar(deposito: Double) {
        if (deposito < 0) {
            println("Não é posssível depositar um valor negativo")
        } else {
            this.saldo += deposito
        }

    }

    fun tranferir(conta: Conta, tranferencia: Double) {
        if (tranferencia <= this.saldo) {
            this.saldo -= tranferencia
            conta.depositar(tranferencia)
        } else {
            println("Você não tem esse valor para transferir")
        }
    }
}