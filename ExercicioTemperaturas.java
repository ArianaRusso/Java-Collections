package List.exercicios;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.util.*;

public class ExercicioTemperaturas {

    public static void main(String[] args) {

        List<Double> temperaturas= new ArrayList<>();
        Scanner teclado= new Scanner(System.in);

        for(int i=0; i<6; i++){
            System.out.println("Digite a temperatura");
            double temp= teclado.nextDouble();
            temperaturas.add(temp);
        }
        System.out.println(temperaturas);

        Iterator<Double> iterator= temperaturas.iterator();
        Double soma= 0d;
        while(iterator.hasNext()){
            soma= soma + iterator.next();
        }
        System.out.println(soma);
        Double media= soma/6;
        System.out.println("Media: " + media);


        Iterator<Double> iterator1= temperaturas.iterator();
        int cont=0;
        while(iterator1.hasNext()){
            Double temp = iterator1.next();
            if(temp>media){
                switch (cont) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            cont++;
        }





    }


}
