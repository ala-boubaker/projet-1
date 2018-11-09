package com.aladino.stream;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStream {

    public static void main(String[] args) {

        List<Personne> listP = Arrays.asList(

                new Personne(1.80, 70, "A", "Nicolas", Couleur.BLEU),

                new Personne(1.56, 50, "B", "Nicole", Couleur.VERRON),

                new Personne(1.75, 45, "C", "Germain", Couleur.VERT),

                new Personne(1.68, 10, "D", "Michel", Couleur.ROUGE),

                new Personne(1.96, 65, "E", "Cyrille", Couleur.BLEU),

                new Personne(2.10, 120, "F", "Denis", Couleur.ROUGE),

                new Personne(1.90, 90, "G", "Olivier", Couleur.VERRON)

        );      
  

        //Stream.iterate(2d, (x) -> x + 1).limit(100).forEach(System.out::println);
        
     /*   Stream<Personne> sp = listP.stream();
        sp.forEach(System.out::println);

        System.out.println("\nAprès le filtre et le map");
        sp = listP.stream();
        sp.	filter(x -> x.getPoids() > 50).map(x -> x.getPoids()).forEach(System.out::println);
        
        
        System.out.println("\nAprès le filtre et le map et reduce");

        sp = listP.stream();
        long sum = sp .filter(x -> x.getPoids() < 50)

                .map(x -> x.getPoids()).count();
        System.out.println("Nombre d'éléments : " + sum);
        */
        
           //     .reduce(0.0d, (x,y) -> x+y);

             //   System.out.println(sum);
        
       String fileName = "C:/Users/albo4285/Desktop/TestWorkspace/projet 1/sdz.txt";

        try(Stream<String> sf = Files.lines(Paths.get(fileName))){

           
        	long sum = sf.filter(x -> x.equals("Salut wiou")).map(x -> x).count();
        	System.out.println("Nombre d'éléments : " + sum);
        	
       // sf.forEach(System.out::println);

        }catch(Exception e) {

            System.out.println(e.getMessage());

        }
        
    }

}