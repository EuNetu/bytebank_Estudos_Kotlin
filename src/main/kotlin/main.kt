fun main() {
    var contaNeto = Conta("Neto", 1234)
    var contaMilla = Conta("Milla", 4321)

    contaNeto.depositar(25000.25)


    println("Seu saldo é ${contaNeto.saldo}")
    contaNeto.sacar(17000.0)
    println("Seu saldo é ${contaNeto.saldo}")
    contaNeto.sacar(17000.0)
    contaNeto.depositar(25000.0)
    println("Seu saldo é ${contaNeto.saldo}")
    println("O saldo de milla é ${contaMilla.saldo}")
    contaNeto.tranferir(contaMilla, 25000.25)
    println("O saldo de milla é ${contaMilla.saldo}")
    testeCompraFazer(contaMilla.saldo)
}

fun testeCompraFazer(valor: Double) {
    when {
        valor >= 17000 -> print("Eu tenho dinheiro para comprar a fazer")
        valor < 17000 && valor > 0 -> print("Eu ainda não tenho dinheiro para comprar a fazer")
        else -> print("tá crítica a minha situação financeira")
    }
}