package Exercises

data class Food(val name: String, val calories: Double, val ingredients: List<Ingredients> = listOf())


data class Ingredients(val name: String, val quantity: Int)


fun main(args: Array<String>) {

    val data = listOf(

            Food("Lazanha", 1200.0,

                    listOf(

                            Ingredients("Farinha", 1),

                            Ingredients("Presunto", 5),

                            Ingredients("Queijo", 10),

                            Ingredients("Molho de tomate", 2),

                            Ingredients("Manjericão", 3)

                    )

            ),

            Food("Panqueca", 500.0),

            Food("Omelete", 200.0),

            Food("Parmegiana", 700.0),

            Food("Sopa de feijão", 300.0),

            Food("Hamburguer", 2000.0,

                    listOf(

                            Ingredients("Pão", 1),

                            Ingredients("Hamburguer", 3),

                            Ingredients("Queijo", 1),

                            Ingredients("Catupiry", 1),

                            Ingredients("Bacon", 3),

                            Ingredients("Alface", 1),

                            Ingredients("Tomate", 1)

                    )

            )

    )


    // Tenho receitas na lista ?
    println("Tenho receitas? ${if (data.any()) "Sim tenho Receitas" else "Não tenho nenhuma receita"}")


    // Quantas receitas tenho na coleção ?
    println("Eu tenho ${data.count()} receitas cadastradas")


    // Qual a primeira e última receita ?
    println("A primeira receita da lista é ${data.first().name}")
    println(message = "A última receita da lista é ${data.last().name}")


    // Qual a soma de calories
    var caloria = 0
    for (x in data) {
        caloria = caloria + x.calories.toInt()
    }

    // outro exemplo pra somar tudo de uma list é
    val sumCalories = data.sumBy { it.calories.toInt() } // como espera um Int e tem um Double , tem que converter
    val sumCaloriesD = data.sumByDouble { it.calories } // essa aqui já espera y=um duble
    println("O tatal de calorias da receita pe de $caloria calorias")
    println("O tatal de calorias da receita pe de $sumCalories calorias")
    println("O tatal de calorias da receita pe de $sumCaloriesD calorias")

    // Me dê as duas primeiras receitas!
    val firstwo = data.take(2) // take pega o numero de elementos que voceprecisa, no caso os dois primeiros
    println("As duas primeiras receitas da lista são:")
    for (r in firstwo.withIndex()) {
        println("${r.index + 1} -- ${r.value.name}")
    }

}