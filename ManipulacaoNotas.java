package List.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Programa que leia um número indeterminado de valores, correspondentes a notas.
Após esta entrada de dados, faça:
-Mostre a quantidade de valores que foram lidos;
-Exiba todos os valores na ordem em que foram informados, um ao lado do outro;
-Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro;
-Calcule e mostre a soma dos valores;
-Calcule e mostre a média dos valores;
-Calcule e mostre a quantidade de valores acima da média calculada;
-Calcule e mostre a quantidade de valores abaixo de sete;


 */
public class ManipulacaoNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        List<Float> listaNumeros = new ArrayList<>();
        float continua = 0f;
        float soma = 0f;
        int qtdAcimaMedia = 0;
        int qtdAcimaSete = 0;

        while (continua != -1) {
            System.out.println("Digite o numero a ser armazenado: ");
            float numero = teclado.nextFloat();
            if (numero == -1) continua = numero;
            else {
                listaNumeros.add(numero);
                soma += numero;
            }
        }

        System.out.println("Qtd de valores: " + listaNumeros.size());
        System.out.println("Valores um ao lado do outro: " + listaNumeros);
        Collections.reverse(listaNumeros);
        System.out.println("Ordem inversa: " + listaNumeros);
        System.out.println("Soma dos valores inseridos: " + soma);
        System.out.println("Média: " + (soma / listaNumeros.size()));

        for (Float numero : listaNumeros) {
            if (numero > (soma / listaNumeros.size())) qtdAcimaMedia++;
            if (numero > 7) qtdAcimaSete++;
        }
        System.out.println("Qtd de valores acima da media: " + qtdAcimaMedia);
        System.out.println("Qtd de valores acima de sete: " + qtdAcimaSete);
    }
}
