package dominio;

import servicos.ConverterNumero;

public class Calculadora implements ConverterNumero {
    Conversor conversor = new Conversor();

    @Override
    public Numero converter(Numero numeroEntrada, int baseSaida) {
        if (numeroEntrada.getBase() == 10){
            return conversor.fromDecimal(numeroEntrada,baseSaida);
        }else if (baseSaida == 10){
            return conversor.toDecimal(numeroEntrada);
        }else {
            return conversor.numberForBase(numeroEntrada,baseSaida);
        }
    }
}
