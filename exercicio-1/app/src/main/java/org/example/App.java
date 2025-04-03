package org.example;

public class App {

    public static void main(String[] args) {
        int largura = Integer.parseInt(args[0]);
        int altura = Integer.parseInt(args[1]);
        System.out.println(quadrado(largura,altura));
        //System.out.println(triangulo(altura));

    }

    private static StringBuilder quadrado(int largura, int altura){
        StringBuilder quadrado =new StringBuilder();
        for (int linhas = altura; linhas > 0; linhas -- ){
            if (linhas == altura || linhas == 1){
                quadrado.append("*".repeat(largura));
            }else {
                quadrado.append("*").append(" ".repeat(largura - 2)).append("*");
            }
            quadrado.append("\n");
        }
        return quadrado;
    }

    private static StringBuilder triangulo(int altura){
        StringBuilder triangulo = new StringBuilder();
        for (int spaces = altura; spaces >= 0; spaces-- ){
            triangulo.append(" ".repeat(spaces)).append("*".repeat(altura - spaces)).append("\n");
        }
        return triangulo;
    }


}
