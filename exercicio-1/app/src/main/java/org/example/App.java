package org.example;

public class App {

    private static final String TRIANGULO   = "triangulo";
    private static final String LOSANGO     = "losango";
    private static final String QUADRADO    = "quadrado";

    public static void main(String[] args) {

        switch (option(args)){
            case 'T':
                System.out.println(triangulo(Integer.parseInt(args[1])));
                break;
            case 'L':
                System.out.println(losango(Integer.parseInt(args[1])));
                break;
            case 'Q':
                System.out.println(quadrado(Integer.parseInt(args[1]),Integer.parseInt(args[2])));
                break;
            default:
                System.out.println("Argumentos incorretos!");
        }

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

    private static char option(String[] arg){
        if      (arg[0].equals(TRIANGULO) && arg.length == 2 && validaNumString(arg[1]))                            return 'T';
        else if (arg[0].equals(LOSANGO)   && arg.length == 2 && validaNumString(arg[1]))                            return 'L';
        else if (arg[0].equals(QUADRADO)  && arg.length == 3 && validaNumString(arg[1]) && validaNumString(arg[2])) return 'Q';
        return 'Z';
    }

    private static boolean validaNumString(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}