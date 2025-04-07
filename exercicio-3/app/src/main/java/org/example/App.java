package org.example;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        int linhas = 10,
            colunas  = 10;
        Mapa mapa1 = new Mapa(linhas,colunas,'.');
        System.out.println(mapa1);

        //Random teste = new Random();
//        System.out.println(teste.nextInt(0,4));
//        System.out.println(teste.nextInt(2,7));
//        System.out.println(teste.nextInt(4,9));
//        System.out.println(teste.nextInt(0,10));

        Frota esquadrao = new Frota();
        System.out.println(esquadrao);


    }

}
