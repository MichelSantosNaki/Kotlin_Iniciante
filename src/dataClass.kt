class Livro(var titulo: String, val autor: String, var ano:Int)
data class DataLivro(var titulo: String, val autor: String, var ano:Int)

fun main() {
    val livro = Livro("Android","Michel",2021)
   var dataLivro = DataLivro("outro titulo","santos",2022)

    println(livro)
    println(dataLivro)
}