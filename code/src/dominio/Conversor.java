package dominio;

public class Conversor {

    protected   Numero fromDecimal(Numero numeroDecimal, int baseSaida){
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
        String restos = "";

        while(dividendo >= baseSaida){
            restos += Integer.toString(dividendo%baseSaida);
            dividendo/=baseSaida;
        }

        return  new Numero(inverterString(restos), baseSaida);
    }

    private Numero fromDecimalBaseMaiorQue10(Numero numeroDecimal, int baseSaida){
        return null;
    }
    private int charToDecimal(char letra){
        return (int) (letra - 55);
    }
}
