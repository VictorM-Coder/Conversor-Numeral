package servicos;

import dominio.Numero;

public interface ConverterNumero {
    public abstract Numero converter(Numero numeroEntrada, int baseSaida);
}
