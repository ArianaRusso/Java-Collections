package List.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

/*
Uma empresa paga seus vendedores com base em comissões. O vendedor recebe $200 por semana
mais 9 por cento de suas vendas brutas daquela semana.
Escreva um programa que determine quantos vendedores receberam salários nos seguintes intervalos de valores:
a .	$200 - $299
b.	$300 - $399
c.	$400 - $499
d.	$500 - $599
e.	$600 - $699
f.	$700 - $799
g.	$800 - $899
h.	$900 - $999
i.	$1000 em diante
 */
public class VendedoresComissionados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<Double> salariosVendedores = new ArrayList<>();

        Double salario;
        Double vendasSemana;

        String continuar = "s";

        while (continuar.equals("s")) {
            System.out.println("Valor das vendas semanais: ");
            vendasSemana = teclado.nextDouble();
            salario = 200 + (0.09 * vendasSemana);
            salariosVendedores.add(salario);

            System.out.println("Continuar? (s/n");
            continuar = teclado.next();

        }
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0;
        for (Double value : salariosVendedores) {
            if (value <= 299) {
                a++;
            } else if (value <= 399) {
                b++;
            } else if (value <= 499) {
                c++;
            } else if (value <= 599) {
                d++;
            } else if (value <= 699) {
                e++;
            } else if (value <= 799) {
                f++;
            } else if (value <= 899) {
                g++;
            } else if (value <= 999) {
                h++;
            } else if (value > 1000) {
                i++;
            }

        }
        System.out.println("--------");
        System.out.println(salariosVendedores);
        System.out.println("$200-299: " + a);
        System.out.println("$300-399: " + b);
        System.out.println("$400-499: " + c);
        System.out.println("$500-599: " + d);
        System.out.println("$600-699: " + e);
        System.out.println("$700-799: " + f);
        System.out.println("$800-899: " + g);
        System.out.println("$900-999: " + h);
        System.out.println(" Acima de $1000: " + h);
    }
}

