package dominio;

import servicos.ConverterNumero;

public class Calculadora implements ConverterNumero {
    Conversor conversor = new Conversor();

    @Override
    public Numero converter(Numero numeroEntrada, int baseSaida) {

        return conversor.fromDecimal(numeroEntrada,baseSaida);
    }
}
