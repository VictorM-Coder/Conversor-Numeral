package teste;

import dominio.Calculadora;
import dominio.Conversor;
import dominio.Numero;

public class TesteConversor {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Numero numero1 = new Numero("AAAA",2);
        Conversor c1 = new Conversor();

        Numero numConvertido = calculadora.converter(numero1, 2);

        System.out.println("-----------");
        System.out.println(numConvertido.getValor());


    }
}
