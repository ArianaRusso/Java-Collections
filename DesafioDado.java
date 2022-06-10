package List.exercicios;
/*
 *Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
 *Depois, mostre quantas vezes cada valor foi conseguido.
 */

import java.util.*;

public class DesafioDado {
    public static void main(String[] args) {
        List<Integer> numerosLancamentos= new ArrayList<>();
        Random gerador= new Random();

        for(int i=0; i<10; i++){
            numerosLancamentos.add(gerador.nextInt(10));
        }
        System.out.println(numerosLancamentos);

        Map<Integer,Integer> numerosRepetidos= new HashMap<>();

        Iterator<Integer> iterator= numerosLancamentos.iterator();


        while (iterator.hasNext()){
            Integer obj= iterator.next();
            int frequencia= Collections.frequency(numerosLancamentos,obj);
            numerosRepetidos.put(Integer.valueOf(obj), frequencia);
        }
        System.out.println(numerosRepetidos);




    }
}
