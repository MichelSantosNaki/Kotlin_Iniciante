package cap3

fun main() {
    try {// ira tentar realizar se nao der ira pro catch
        println("Digite um número:")
        val numero: Int = readLine()!!.toInt()
        val divisao: Int = 100/numero
        println("A divisão é: ${divisao}")
    }catch (e: Exception){
        println("Erro: ${e.message}")
    }finally { // sempre ira ocorrer
        println("Programa Finalizado")
    }
}