interface Dirigivel{
    fun acelerar(velocidade: Long)


}

open class Veiculo(open var cor: String, open var ano: Int, open var modelo: String)

class Carro(override var cor: String, override  var ano: Int, override var modelo: String): Veiculo(cor,ano,modelo),Dirigivel {
    fun abrirPorta(){
        println("Abrindo porta do $modelo")
    }

    override fun acelerar(velocidade: Long) {
        println("$modelo esta acelerando a $velocidade Km/h")
    }

//    override fun acelerar(velocidade: Long) {
//        println("Acelerando o $modelo")
//    }

}


fun main() {
    val uno=Carro("Amarelo",2018,"Uno")
    println("O modelo do caro é ${uno.modelo} de cor ${uno.cor} e ano ${uno.ano}")
    val palio: Dirigivel=Carro("Prata",2006,"Fiat")

    println("${palio.acelerar(150)}")
}


//para estender uma classe precisa utilizar a palavra OPEN antes da classe