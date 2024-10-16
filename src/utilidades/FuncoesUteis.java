package utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FuncoesUteis {

    // Criando metodo para somar dois inteiros
    public static int Soma(int a, int b) {
        return a + b;
    }

    // Criando metodo para exibir um triângulo com a altura especificada
    public static void Triangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Criando metodo para ler um arquivo de texto e imprimir seu conteúdo
    public static void printArquivo(String arquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}