package main;

import utilidades.FuncoesUteis;

public class Main {
    public static void main(String[] args) {
        // Testando o método Soma
        int resultadoSoma = FuncoesUteis.Soma(5, 10);
        System.out.println("Resultado da Soma: " + resultadoSoma);

        // Testando o método Triangulo
        FuncoesUteis.Triangulo(5);

        // Testando o método printArquivo
        String caminhoArquivo = "src/teste.txt"; // Certifique-se de ter este arquivo
        FuncoesUteis.printArquivo(caminhoArquivo);
    }
}
