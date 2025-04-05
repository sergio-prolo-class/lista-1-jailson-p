//versão 1 : Paradígma de estruturada
package org.example;
public class App {

    private static final String[] PRETO       = {"preto",       "0",    ""              };
    private static final String[] MARROM      = {"marrom",      "1",    " (+- 1%)"      };
    private static final String[] VERMELHO    = {"vermelho",    "2",    " (+- 2%)"      };
    private static final String[] LARANJA     = {"laranja",     "3",    ""              };
    private static final String[] AMARELO     = {"amarelo",     "4",    ""              };
    private static final String[] VERDE       = {"verde",       "5",    " (+- 0,5%)"    };
    private static final String[] AZUL        = {"azul",        "6",    " (+- 0,25%)"   };
    private static final String[] VIOLETA     = {"violeta",     "7",    " (+- 0,1%)"    };
    private static final String[] CINZA       = {"cinza",       "8",    ""              };
    private static final String[] BRANCO      = {"branco",      "9",    ""              };
    private static final String[] OURO        = {"ouro",        "-1",   " (+- 5%)"      };
    private static final String[] PRATA       = {"prata",       "-2",   " (+- 10%)"     };
    private static final String[] NULO        = {"",             "",    " (+- 20%)"     };

    public static void main(String[] args) {

        if (args.length != 4) {
            System.out.println("Falta argumentos pode ocasionar em informação errada ou inconpleta.");
            return;
        }
        String dezenas          = descodificador(args,1,0);
        String multiplicador    = descodificador(args,1,2);
        String tolerancia       = descodificador(args,2,3);
        System.out.println(notaSI(dezenas,multiplicador) + tolerancia);

    }

    public static String descodificador(String[] argumento, int coluna, int opcao){
        StringBuilder dezena = new StringBuilder();
        int controlop= 2;
        if(opcao == 2 || opcao == 3) controlop = opcao+1;
        for (int i = opcao; i < argumento.length; i++){
            if(i <  controlop){
                if      (argumento[i].toLowerCase().equalsIgnoreCase(PRETO[0]))   {dezena.append(PRETO[coluna]);      continue;}
                else if (argumento[i].toLowerCase().equalsIgnoreCase(MARROM[0]))  {dezena.append(MARROM[coluna]);     continue;}
                else if (argumento[i].toLowerCase().equalsIgnoreCase(VERMELHO[0])){dezena.append(VERMELHO[coluna]);   continue;}
                else if (argumento[i].toLowerCase().equalsIgnoreCase(LARANJA[0])) {dezena.append(LARANJA[coluna]);    continue;}
                else if (argumento[i].toLowerCase().equalsIgnoreCase(AMARELO[0])) {dezena.append(AMARELO[coluna]);    continue;}
                else if (argumento[i].toLowerCase().equalsIgnoreCase(VERDE[0]))   {dezena.append(VERDE[coluna]);      continue;}
                else if (argumento[i].toLowerCase().equalsIgnoreCase(AZUL[0]))    {dezena.append(AZUL[coluna]);       continue;}
                else if (argumento[i].toLowerCase().equalsIgnoreCase(VIOLETA[0])) {dezena.append(VIOLETA[coluna]);    continue;}
                else if (argumento[i].toLowerCase().equalsIgnoreCase(CINZA[0]))   {dezena.append(CINZA[coluna]);      continue;}
                else if (argumento[i].toLowerCase().equalsIgnoreCase(BRANCO[0]))  {dezena.append(BRANCO[coluna]);     continue;}
                else if (argumento[i].toLowerCase().equalsIgnoreCase(OURO[0]))    {dezena.append(OURO[coluna]);       continue;}
                else if (argumento[i].toLowerCase().equalsIgnoreCase(PRATA[0]))   {dezena.append(PRATA[coluna]);      continue;}
                else if (argumento[i].toLowerCase().equalsIgnoreCase(NULO[0]))    {dezena.append(NULO[coluna]);       continue;}
                else {
                    System.out.println("O argumento \"" + argumento[i] + "\" não é válido!" +
                                        "\nGerando um erro abaixo na informação com '#'. ");
                    dezena.append(" #");
                }
            }
        }
       return dezena.toString();
    }

    public static StringBuilder notaSI(String decimal, String multi) {
        StringBuilder novoNum = new StringBuilder();
        if(multi.contains("#")) multi = new String("-3");
        switch (Integer.parseInt(multi)){
            case -2:
                novoNum.append(decimal ).append("0 m Ohms");
                break;
            case -1:
                novoNum.append(decimal).append( " Ohms").insert(1,",");
                break;
            case 0:
                novoNum.append(decimal ).append( " Ohms");
                break;
            case 1:
                novoNum.append(decimal).append( " Ohms");
                break;
            case 2:
                novoNum.append(decimal).append( " k Ohms").insert(1,",");
                break;
            case 3:
                novoNum.append(decimal).append( " k Ohms");
                break;
            case 4:
                novoNum.append(decimal).append( "0 k Ohms");
                break;
            case 5:
                novoNum.append(decimal).append( " M Ohms").insert(1,",");
                break;
            case 6:
                novoNum.append(decimal).append( " M Ohms");
                break;
            case 7:
                novoNum.append(decimal).append( "0 M Ohms");
                break;
            case 8:
                novoNum.append(decimal).append( " G Ohms").insert(1,",");
                break;
            case 9:
                novoNum.append(decimal).append( " G Ohms");
                break;
            default:
                novoNum.append(decimal).append( "  #");
        }
        if (novoNum.charAt(0)=='0') novoNum.deleteCharAt(0);
        return novoNum;
    }
}