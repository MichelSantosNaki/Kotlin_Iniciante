package O.O

open class Maquina(val marca: String){ // open para permitir que pode ser usado de outros arquivos do programa

    fun minhaMarca(){
        println("Minha marca é $marca")
    }
}


class  computador(marca: String, val nucleos : Int): Maquina(marca){ // computador herda tudo da classe pai minhaMarca
    fun ligar(){}
    fun processar() {}

}

fun main() {
    val c : computador = computador("Dell", 4) // variaval c do tipo computador recebe a classe computador
        with(c){ // usa o comando witch para varios funções com a mesma variável
            ligar() // herdada da classe computador
            processar()// herdada da classe computador
            minhaMarca() // herdada da classe Pai Maquina

    }
}