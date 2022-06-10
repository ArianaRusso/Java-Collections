package List.exercicios;
/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

import java.util.*;

public class CoresArcoIris {
    public static void main(String[] args) {
        Set<String> coresArcoIris= new HashSet<>();
        coresArcoIris.add("Azul");
        coresArcoIris.add("Amarelo");
        coresArcoIris.add("Vermelho");
        coresArcoIris.add("Verde");
        coresArcoIris.add("Violete");
        coresArcoIris.add("Laranja");

        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra;");
        for (String cores: coresArcoIris) System.out.println(cores);

        System.out.println("A quantidade de cores que o arco-íris tem: "+ coresArcoIris.size());

        System.out.println("Exiba as cores em ordem alfabética");
        Set<String> coresArcoIris1= new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris1);

        System.out.println("Exiba as cores na ordem inversa da que foi informada");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("Exiba todas as cores que começam com a letra ”v”");
        for (String cor: coresArcoIris){
            if(cor.startsWith("V")){
                System.out.println(cor);
            }
        }
        System.out.println("Remova todas as cores que não começam com a letra “v”");
        Iterator<String > iterator= coresArcoIris.iterator();
        while(iterator.hasNext()){
            if(iterator.next().startsWith("V")){
                iterator.remove();
            }
        }
        System.out.println(coresArcoIris);

        coresArcoIris.clear();
        System.out.println("Limpe o conjunto: "+ coresArcoIris);
        System.out.println("Confira se o conjunto está vazio;"+ coresArcoIris.isEmpty());



    }





}
