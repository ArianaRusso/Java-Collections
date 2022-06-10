package List.exercicios;

import java.util.*;

/*
Programa que leia o resultado da enquete e informe ao final o resultado da mesma.
Calcular a percentual de cada um dos concorrentes e informar o vencedor da enquete.
As possíveis respostas são: 1- Windows Server 2- Unix 3- Linux 4- Netware 5- Mac OS  6-Outro
 */
public class EnqueteSistemasOperacionais {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        EnqueteSistemasOperacionais porcentagem= new EnqueteSistemasOperacionais();

        List<Integer> votacao= new ArrayList<>();
         int voto=1;
         int totalVotos=0;

         while(voto!=0){
             System.out.println("Melhor SO: (1- Windows Server, 2- Unix, 3-Linux, 4-Netware, 5- Mac OS, 6-Outro)");
             voto = teclado.nextInt();
             if(voto>=1 && voto<=6) votacao.add(voto);
             else System.out.println("Voto invalido");
         }
         totalVotos=votacao.size();

         System.out.println("Votos: "+votacao);
        System.out.println("Total: "+totalVotos);

        Map<Integer, Integer> qtdVotos= new HashMap<>();
        for (Integer valor: votacao) {
            if(qtdVotos.containsKey(valor)){
                Integer n=  qtdVotos.get(valor);
                qtdVotos.put(valor, n+1);
            }else{
                qtdVotos.put(valor,1);
            }
        }

        System.out.println("Quantidade de votos de cada SO: "+qtdVotos);

        System.out.println("Sistema Operacional  Votos");
        System.out.println("------------------------------");

        Set<Map.Entry<Integer, Integer>> entries= qtdVotos.entrySet();

        for (Map.Entry<Integer,Integer> entry: entries) {
            String nomeSO= " ";
            switch (entry.getKey()){
                case 1:
                    nomeSO="Windows";
                    break;
                case 2:
                    nomeSO= "Unix";
                    break;
                case 3:
                    nomeSO= "Linux";
                    break;
                case 4:
                    nomeSO= "Netware";
                    break;
                case 5:
                    nomeSO= "Mac OS";
                    break;
                case 6:
                    nomeSO= "Outro";
                    break;
            }

            System.out.println(nomeSO + " " + entry.getValue()+ " "+
                    porcentagem.calculaPorcentagem(totalVotos, entry.getValue())+"%");


            System.out.println("Vencedor: "+ Collections.max(qtdVotos.values()));
        }

    }
    public float calculaPorcentagem(int totalVotos, int votosSO){
        return (float) ((votosSO * 100)/totalVotos);
    }
}

