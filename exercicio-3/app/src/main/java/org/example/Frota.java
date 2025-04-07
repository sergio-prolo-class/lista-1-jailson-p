package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Frota {

    private ArrayList<Character[][]> marinha = new ArrayList<>();
    private Character[][] frota;

    public Frota() {
        this.marinha.add(new Character[][]{{'P'},{'5'}});
        this.marinha.add(new Character[][]{{'E'},{'4'}});
        this.marinha.add(new Character[][]{{'C'},{'3'}});
        this.marinha.add(new Character[][]{{'S'},{'3'}});
        this.marinha.add(new Character[][]{{'N'},{'2'}});
    }

    public Character[][] getFrota() {
        Collections.shuffle(this.marinha);
        Character[][] alpha=new  Character[this.marinha.size()][this.marinha.getFirst().length];
        


        //        for (int i = 0; i < this.marinha.size(); i++){
//            for (int j = 0;i < this.marinha.getFirst().length; j++){
//                alpha[i][j] = this.marinha.get(i).
//            }
//        }
        return this.frota;
    }
    public String componenteList(int num){
        String leitura;
        leitura = String.valueOf(this.marinha.get(num)[0][0]);
        leitura += this.marinha.get(num)[1][0];
        return leitura;

    }

    @Override
    public String toString() {
        String alpha=new  String();
        for(Character[][] marinha: this.marinha){
            for(Character[] navio: marinha){
                alpha += navio[0] +" ";
            }
            alpha += "\n";
        }
        System.out.println(this.marinha.getFirst().length);
        return  alpha;
    }
}
