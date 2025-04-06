package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Mapa {

    private char[][] mapa;
    private char caracter;

    public Mapa(int linhas, int colunas,char caracter) {
        this.mapa = preenchermapachar(linhas,colunas, caracter);
        this.caracter = caracter;
    }

    public static char[][] preenchermapachar(int linhas, int colunas, char caract){
        char[][] mapapreenchidoCaract =new char[linhas][colunas];
        for (int i = 0; i < linhas; i++){
            for(int j =0; j < colunas; j++){
                mapapreenchidoCaract[i][j] = caract;
            }
        }
        return mapapreenchidoCaract ;
    }

    public boolean getCharPosMatch(int posLinha,int posColuna) {
        if(this.mapa[posLinha][posColuna] != this.caracter) return true;
        return false;
    }

    public void setCharPostch(int posLinha, int posColuna, char caracter){
        this.mapa[posLinha][posColuna] = caracter;
    }

    @Override
    public String toString() {
        String mapstring = new String();
        for (int i = 0; i < mapa.length; i++){
            for(int j =0; j < mapa[0].length; j++){
                mapstring += mapa[i][j];
            }
            mapstring += "\n";
        }
        return "\n" + mapstring ;
    }
}

