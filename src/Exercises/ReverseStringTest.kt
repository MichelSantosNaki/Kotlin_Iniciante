package Exercises

import org.junit.Assert
import org.junit.Test

class ReverseStringTest {
    // Usando SB
    @Test fun reverseUsingSB() {
       Assert.assertEquals("bs niltok", reverseUsingSb("kotlin sb"))
    }
    //Usando apenas loop
    @Test fun reverseUsingLoop(){
        Assert.assertEquals("lehciM",reverseUsingLoop("Michel"))

    }

}

