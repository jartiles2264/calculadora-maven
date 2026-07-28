package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    public void testSumar() {
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calc.multiplicar(2, 3));
    }
}