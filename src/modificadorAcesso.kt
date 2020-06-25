 open class Animal(){
    private var nome="Pipoca" //Private só tem acesso dentro da própria Classe
    protected var ano: Int=2019 // essa ira utilizar em todas as subclasses
     internal  var tipo: String = "Mamifero" // tem acesso somente no memso modulo
    var patas: Int = 4 //por padao o acesso é público

}

class Cachorro(): Animal(){

    fun descobrirIdade(){
        println("A idade é " + (2020-ano))
    }
}

 fun main() {
     var pipoca=Cachorro()
     println(pipoca.descobrirIdade())
     println(pipoca.tipo)
     println("tem ${pipoca.patas} patas")
 }