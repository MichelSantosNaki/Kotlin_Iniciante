fun operancao(a: Int, b: Int, c: String) {
//when é muito parecido com o if
    when {
        a > 0 && b > 0 -> println("Expressoes maires que zero")
    }
//usando um range junto com when, se usa .. para ir por exemplo de 0 a 50: 1..50
    when (a) {
        in 1..100 -> println("Entre 1 e 100") // unico comando não precisa usas conchetes
    }

    when (c) {
        "soma" -> println(a + b)
        "multiplicacao" -> println(a * b)
    }
}

fun main() {
    println(operancao(20, 10, "multiplicacao   "))
}