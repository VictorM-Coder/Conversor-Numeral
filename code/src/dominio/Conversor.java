package dominio;

public class Conversor {

    protected   Numero fromDecimal(Numero numeroDecimal, int base){
        int dividendo = Integer.parseInt(numeroDecimal.getValor());
        String restos = "";

        while(dividendo >= base){
            restos += Integer.toString(dividendo%base);
            dividendo/=base;
        }

        return  new Numero(inverterString(restos), base);
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

}
