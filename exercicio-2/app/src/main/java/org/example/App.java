package org.example;

public class App {

    private static final String[] PRETO       = {"preto",       "0",    ""          };
    private static final String[] MARROM      = {"marrom",      "1",    "+- 1%"     };
    private static final String[] VERMELHO    = {"vermelho",    "2",    "+- 2%"     };
    private static final String[] LARANJA     = {"laranja",     "3",    ""          };
    private static final String[] AMARELO     = {"amarelo",     "4",    ""          };
    private static final String[] VERDE       = {"verde",       "5",    "+- 0,5%"   };
    private static final String[] AZUL        = {"azul",        "6",    "+- 0,25%"  };
    private static final String[] VIOLETA     = {"violeta",     "7",    "+- 0,1%"   };
    private static final String[] CINZA       = {"cinza",       "8",    ""          };
    private static final String[] BRANCO      = {"branco",      "9",    ""          };
    private static final String[] OURO        = {"ouro",        "0.1",  "+- 5%"     };
    private static final String[] PRATA       = {"prata",       "0.01", "+- 10%"    };
    private static final String[] NULO        ={"",             "",     "+- 20%"    };

    public static void main(String[] args) {

        System.out.println(dezenas(args));;

    }

    public static String dezenas(String[] argumento){
        String dezena = new String();
        for (int i = 0; i < argumento.length; i++){
            if(i <  2){
                if      (argumento[i].equalsIgnoreCase(PRETO[0]))   {dezena += PRETO[1];      continue;}
                else if (argumento[i].equalsIgnoreCase(MARROM[0]))  {dezena += MARROM[1];     continue;}
                else if (argumento[i].equalsIgnoreCase(VERMELHO[0])){dezena += VERMELHO[1];   continue;}
                else if (argumento[i].equalsIgnoreCase(LARANJA[0])) {dezena += LARANJA[1];    continue;}
                else if (argumento[i].equalsIgnoreCase(AMARELO[0])) {dezena += AMARELO[1];    continue;}
                else if (argumento[i].equalsIgnoreCase(VERDE[0]))   {dezena += VERDE[1];      continue;}
                else if (argumento[i].equalsIgnoreCase(AZUL[0]))    {dezena += AZUL[1];       continue;}
                else if (argumento[i].equalsIgnoreCase(VIOLETA[0])) {dezena += VIOLETA[1];    continue;}
                else if (argumento[i].equalsIgnoreCase(CINZA[0]))   {dezena += CINZA[1];      continue;}
                else if (argumento[i].equalsIgnoreCase(BRANCO[0]))  {dezena += BRANCO[1];     }

            }

        }

       return dezena;
    }


}
