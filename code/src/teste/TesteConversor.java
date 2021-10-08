package teste;

import dominio.Calculadora;
import dominio.Numero;

public class TesteConversor {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Numero numero1 = new Numero("20",10);

        Numero numCovertido = calculadora.converter(numero1, 2);

        System.out.println("-----------");
        System.out.println(numCovertido.getValor());
    }
}
