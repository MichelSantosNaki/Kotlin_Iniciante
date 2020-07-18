fun contaCaracter(msg: String){
    println("A palavra $msg tem ${msg.length} caracteres")
}

fun main() {
    val palavra: String = "Michel"
    contaCaracter(palavra)
}