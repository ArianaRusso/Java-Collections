package List.exercicios;
/*
Enquete para saber qual o melhor jogador (entre 1 e 23).
O programa deverá exibir:
-total de votos;
-números e respectivos votos de todos os jogadores que receberam votos;
-percentual de votos de cada um destes jogadores;
-número do jogador escolhido como o melhor jogador da partida, juntamente com o número de votos e o
percentual de votos dados a ele.
 */

import java.util.*;

public class EnqueteTelespectadores {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        List<Integer> listaVotos= new ArrayList<>();
        int voto=1;
        int totalVotos=0;

        while(voto!=0){
            System.out.println("Melhor jogador: (1 a 23)");
            voto=teclado.nextInt();

            if(voto>=1 && voto <=23) listaVotos.add(voto);
            else {
                System.out.println("Numero invalido");
            }
        }

        System.out.println(listaVotos);

        totalVotos=listaVotos.size();

        System.out.println("Qtd de votos: "+totalVotos);

        Map<Integer, Integer> jogadoresQtdVotos= new HashMap<>();


        for ( int valor: listaVotos) {

            if(jogadoresQtdVotos.containsKey(valor)){
                Integer n= jogadoresQtdVotos.get(valor);
                jogadoresQtdVotos.put(valor,n+1);
            }else {
                jogadoresQtdVotos.put(valor,1);
            }
        }

        System.out.println("MAP:"+ jogadoresQtdVotos);

        Set<Integer> jogadoresVotados= jogadoresQtdVotos.keySet();
        System.out.println("Jogador que tiveram votos: "+ jogadoresVotados);



        Set<Map.Entry<Integer, Integer>> entries= jogadoresQtdVotos.entrySet();
        for (Map.Entry<Integer, Integer> entry:entries) {
            System.out.println("Jogador: "+entry.getKey()+ " Votos:  "+entry.getValue()+
                    " Porcentagem: " + (float)(100 * entry.getValue())/totalVotos + "%");
        }

        Integer jogadorMaisVotado= Collections.max(jogadoresQtdVotos.keySet());
        System.out.println("Jogador mais votado: "+jogadorMaisVotado+ " Votos: " +
                jogadoresQtdVotos.get(jogadorMaisVotado)+ " Porcentagem: "+
                (100 * jogadoresQtdVotos.get(jogadorMaisVotado)/totalVotos)+ "%");


    }
}
