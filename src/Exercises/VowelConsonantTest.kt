package Exercises

import org.junit.Assert
import org.junit.Test

class VowelConsonantTest   {

    @Test fun contVowels(){ // cria um teste para checar a função que retorna o número de vogais em uma frase
        Assert.assertEquals(11,contVowels("Quantas vogais tem essa frase"))
    }

    @Test fun countConsonats() { // cria um teste para checar a função que retorna o número de consoantes em uma frase

        Assert.assertEquals(4,countConsonants("Michel!"))
    }

    @Test  fun countVowelsAndConsonants(){ // teste para vogais e consoantes
        val phrase = "Estou gostando muito de  aprender Kotlin!"
        Assert.assertEquals(15, contVowels(phrase))
        Assert.assertEquals(19, countConsonants(phrase))
    }
}