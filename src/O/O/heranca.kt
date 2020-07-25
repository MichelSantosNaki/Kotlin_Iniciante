package O.O

open class Maquina(val marca: String){ // open para permitir que pode ser usado de outros arquivos do programa

   open fun minhaMarca(){
        println("Minha marca é $marca")
    }
}


class  computador(marca: String, val nucleos : Int): Maquina(marca){ // computador herda tudo da classe pai minhaMarca
    override fun minhaMarca() {
        println("posso sobresquever a função") // subescreveu a função minhaMarca herdada da class pai
    }
    fun ligar(){}
    fun processar() {}

    // overload, se usa quando se usa mesmo métados mas com parâmetros diferentes
    fun pessoa(nome : String){
        println(nome)}
    fun pessoa(idade: Int){
        println("$idade anos")

    }

}

fun main() {
    val c : computador = computador("Dell", 4) // variaval c do tipo computador recebe a classe computador
        with(c){ // usa o comando witch para varios funções com a mesma variável
            ligar() // herdada da classe computador
            processar()// herdada da classe computador
            minhaMarca() // herdada da classe Pai Maquina
            pessoa(22 ) // usa altomatico o overload, kotlin sabe qual método usar!
            pessoa("Michel")

    }
}