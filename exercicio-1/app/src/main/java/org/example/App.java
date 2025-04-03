package org.example;

public class App {

    public static void main(String[] args) {

        String tipo = args[0];
        //int argint1 = Integer.parseInt(args[0]);
        int argint2 = Integer.parseInt(args[1]);
        //System.out.println(quadrado(largura,altura));
        System.out.println(losango(argint2));

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

    private static StringBuilder losango(int altura){
        char asterisco = '*';
        int meioup = Math.ceilDiv(altura,2) ;
        int meiodown = Math.floorDiv(altura,2) ;
        StringBuilder losango = new StringBuilder();
        StringBuilder textotemp = new StringBuilder();
        textotemp.append(" ".repeat(altura-meioup)).append(asterisco).append(" ".repeat(altura-meioup)).append("\n");

        for (int linhasdown = altura,linhasup= 0 ; linhasdown >= 0; linhasdown--,linhasup++ ){
            if(linhasdown != linhasup && linhasdown > linhasup){
                textotemp.setCharAt(meiodown-linhasup,asterisco);
                textotemp.setCharAt(meiodown+linhasup,asterisco);
            }
            else {
                textotemp.setCharAt(meiodown-linhasdown,' ');
                textotemp.setCharAt(meiodown+linhasdown,' ');
            }
            losango.append(textotemp);
        }
        return losango;
    }
}
