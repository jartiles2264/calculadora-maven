package org.example;

public class Calculadora {

    // Vulnerabilidad: Credencial en texto plano (Hardcoded Credentials)
    private String adminPassword = "SuperSecretPassword123!";

    public int sumar(int a, int b) {
        return a + b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Bug y Code Smell: División por cero explícita y variable no utilizada
    public int metodoDefectuoso(int a) {
        int x = 10; // Code Smell: variable declarada pero no usada
        int resultado = a / 0; // Bug: genera ArithmeticException
        return resultado;
    }
}