package O.O
//Não pode ter o mesmo nome de classe no mesmo arquivo, mas no mesmo projeto sim,
//desde que estejam em arquivos difetentes!!!


class pessoa1  //apenas criando uma classe sem atributos

class Pessoa2(var nome: String, var anoNascimento: Int) { // classe recebendo atributos mas sem funcionalidade

}

//classe usando uma função com os atributos recebidos pela classe
class Pessoa3(var nome: String) {

    var ano: Int? = null//Cria variável ano para poder usar ano que esta no atríbuto

    //Construtor que recebe ano, assim pode se usar a classe sem saber ano da pessoa!
    constructor(nome: String, ano: Int) : this(nome) {
        this.ano = ano // this mostra que é para usar a v ano da classe e recebe o valor do parâmetro ano
    }

    fun saudacao() { // não precisa passar os parâmetros para a função pq ela usa os atributos da própria classe
        if (ano == null) {// verificação para seber se temos o atributo ano
            println("Olá, seu nome é $nome e não sabemos seu ano de Nascimento")
        } else {
            println("Olá, seu nome é $nome e você nasceu no ano de $ano")
        }
    }
}

fun main() {
    val pessoa1: Pessoa3 = Pessoa3("Michel", 1992)
    val pessoa2: Pessoa3 = Pessoa3("Dani")
    pessoa1.saudacao()
    pessoa2.saudacao()
    println(pessoa1.ano)
    println(pessoa2.nome)
}