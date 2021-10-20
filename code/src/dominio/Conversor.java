package dominio;

public class Conversor {

    protected Numero fromDecimal(Numero numeroDecimal, int baseSaida){
        if (baseSaida <= 9){
            return fromDecimalBaseMenorQue10(numeroDecimal, baseSaida);
        }else{
            return fromDecimalBaseMaiorQue10(numeroDecimal, baseSaida);
        }
    }

    protected Numero toDecimal(Numero numeroNaoDecimal){
        int numConvertido = 0;
        int base = numeroNaoDecimal.getBase();
        for (int expoente = (numeroNaoDecimal.getValor().length()-1), posicao = 0; expoente >= 0; expoente--, posicao++){
            int unidadeRodada;
            if (base > 10){
                unidadeRodada = charToDecimal(numeroNaoDecimal.getValor().charAt(posicao));
            }else{
                unidadeRodada = Integer.parseInt(String.valueOf(numeroNaoDecimal.getValor().charAt(posicao)));
            }
            numConvertido += equacaoN(unidadeRodada, base, expoente);
        }
        return new Numero(Integer.toString(numConvertido), 10);
    }

    //SUBMÉTODOS
    private int equacaoN(int num1,int base, int expoente){
        System.out.println(num1 + "*" + base + "^" + expoente);
        return (int) (num1 * Math.pow(base, expoente));
    }

    private Numero fromDecimalBaseMenorQue10(Numero numeroDecimal, int baseSaida){
        int dividendo = Integer.parseInt(numeroDecimal.getValor());
        String numConvertido = "";

        while(dividendo >= baseSaida){
            numConvertido += Integer.toString(dividendo%baseSaida);
            dividendo/=baseSaida;
        }

        numConvertido += dividendo;

        return  new Numero(inverterString(numConvertido), baseSaida);
    }

    private Numero fromDecimalBaseMaiorQue10(Numero numeroDecimal, int baseSaida){
        int dividendo = Integer.parseInt(numeroDecimal.getValor());
        String numConvertido = "";

        if (dividendo < baseSaida && dividendo> 9){
            return new Numero(decimalToChar(dividendo) + "", baseSaida);
        }

        while(dividendo >= baseSaida){
            int resto = dividendo%baseSaida;

            if (resto >= 10){
                numConvertido += decimalToChar(resto);
            }else{
                numConvertido += Integer.toString(dividendo%baseSaida);
            }
            dividendo/=baseSaida;
        }
        numConvertido += dividendo;

        return  new Numero(inverterString(numConvertido), baseSaida);
    }

    //MÉTODOS AUXILIARES
    private char decimalToChar(int valor){
        return (char) (valor + 55);//Retorna uma letra maiúscula
    }
    private int charToDecimal(char valor){
        int saida = ((int) valor) - 55;
        if (saida >= 10){
            return saida;
        }else{
            return Integer.parseInt(valor + "");
        }

    }

    private String inverterString(String stringBase){
        String stringInverse = "";

        for(int cont = (stringBase.length()-1) ; cont >= 0; cont--){
            stringInverse += "" + stringBase.charAt(cont);
        }
        return stringInverse;

    }

}
