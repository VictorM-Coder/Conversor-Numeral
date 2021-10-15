package dominio;

public class Conversor {

    protected Numero fromDecimal(Numero numeroDecimal, int baseSaida){
        if (baseSaida <= 9){
            return fromDecimalBaseMenorQue10(numeroDecimal, baseSaida);
        }else{
            return fromDecimalBaseMaiorQue10(numeroDecimal, baseSaida);
        }
    }

    protected Numero toDecimal(){

        return null;
    }

    private String inverterString(String stringBase){
        String stringInverse = "";

        for(int cont = (stringBase.length()-1) ; cont >= 0; cont--){
            stringInverse += "" + stringBase.charAt(cont);
        }
        return stringInverse;

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
    private char decimalToChar(int valor){
        return (char) (valor + 55);//Retorna uma letra maiúscula
    }

}
