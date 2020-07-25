package O.O

// usado para inicialização tardia, por exemplo uma váriavel sem valor numa classe!

class Pessoa(){

    lateinit var nome : String // variavel sem valor que sera inicializada apenas quando for chamada essa classe

    fun geradorDeNome( nome : String){
        this.nome = nome
        println(nome)
    }
}

fun main() {
    val p = Pessoa()
    p.geradorDeNome("Michel")


}