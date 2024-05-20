public class Operadores {
    public static void main(String[] args) throws Exception {

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        concatenacao = 1 + "1" + 1 + "1";
        concatenacao = "1" + 1 + 1 + 1;
        concatenacao = 1 + 1 + 1 + "1";
        concatenacao = (1 + 1 + 1) + "1";

        System.out.println(concatenacao);

        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        // x repetição, incrementa +1 no ++ e decremento -1 no --
        int numero = 5;

        numero++;
        System.out.println(numero);

        int a, b;
        String resultado = "";
        a = 5;
        b = 5;

        if (a == b)
            resultado = "verdadeiro ";
        else
            resultado = "falso ";

        System.out.print(resultado);

        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das duas condições são verdadeiras");
        }
    }
}
