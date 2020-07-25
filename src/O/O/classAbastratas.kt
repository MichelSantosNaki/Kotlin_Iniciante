package O.O
// quem erda uma classe ou método abstrato, deve implementar sua propria classe/método
abstract class  Mamifere(var nome : String){
    abstract fun falar() // quem herdar mamífero deve implementar essa função
    open fun dormir(){ // deixa a classe aberta para caso queira fazer um override por ex
        println("Estou dormindo")
    }
}

class  Cachoro (nome: String) : Mamifere(nome){
    override fun falar() {
        println(" $nome  faz au au")
    }


}
class  gato (nome: String) : Mamifere(nome){
    override fun falar() {
        println("$nome faz miau")
    }

    override fun dormir() {
        println("Estou sem sono")
    }

}

fun main() {
    val pipoca : Cachoro = Cachoro("Pipoca")
    val  branquinho : gato = gato("Branquinho")

    branquinho.falar()
    branquinho.dormir()

    pipoca.falar()
    pipoca.dormir()



}