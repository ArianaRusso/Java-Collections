package List.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/
public class ExercicioCrime {
    public static void main(String[] args) {

        List<String> respostas= new ArrayList<String>();
        Scanner teclado= new Scanner(System.in);

        System.out.println("Telefonou para a vítima?");
        respostas.add(teclado.next());
        System.out.println("Esteve no local do crime?");
        respostas.add(teclado.next());
        System.out.println("Mora perto da vítima?");
        respostas.add(teclado.next());
        System.out.println("Devia para a vítima?");
        respostas.add(teclado.next());
        System.out.println("Já trabalhou com a vítima?");
        respostas.add(teclado.next());

        System.out.println(respostas);

        int contSim= 0;

        for(int i =0; i<respostas.size(); i++){
            if (respostas.contains("s")){
                contSim++;
            }
        }
        System.out.println("Numeros de respostas positivas: "+contSim);

        switch (contSim){
            case 2:
                System.out.println("Suspeita");
                break;

            case 3:
            case 4:
                System.out.println("Cumplice");
                break;

            case 5:
                System.out.println("Assassino");
                break;

            default:
                System.out.println("Inocente");
                break;
        }

    }
}
