package tipos.numeros;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        final double salarioMinimo = 2000;

        int numero = 10;

        double numero1 = 20.2;

        double numero2 = numero + numero1;

        //final n permite o uso de outras variaveis para alteração
        //salarioMinimo = 5000;

        System.out.println(numero2);

        System.out.println("Salário minimo de: " + salarioMinimo);
    }
}
