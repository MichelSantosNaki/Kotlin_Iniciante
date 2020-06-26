package cap3


enum class Direcao{
    Leste,Oeste,Norte,SUl

}

class Bussula{
    var direcao: Direcao = Direcao.Norte
}

fun main() {
    val bussula = Bussula()
    println(bussula.direcao)

    bussula.direcao = Direcao.Leste

    println(bussula.direcao)
}