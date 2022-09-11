public class Main {
    public static void main(String[] args) {
        //
        //System.out.println("Hello world!");
        //
        String nome;
        nome = "Let's Code";

        System.out.println("Olá, " + nome);
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Nessa aula conhecemos os tipos primitivos de dados, que são: ");
        System.out.println("byte, short, int, long, float, double, boolean, char");
        System.out.println("Por convenção para declarar valores numericos inteiros usa-se int, pois já possui um intervalo suficiente");
        System.out.println("Para numeros com casas decimais usa-se o float ou double");
        System.out.println("Para tipos logicos utilizamos boolean");
        System.out.println("Para um unico caracter utilizamos char");
        ////////////////////////////////////////////////////////////////////////
        System.out.println("////////////////////////////////////////////////////////////////////////");
        ////////////////////////////////////////////////////////////////////////
        System.out.println("Atalho Util: sout");
        System.out.println("////////////////////////////////////////////////////////////////////////");


        int a;
        int b;
        //
        b = 2;
        a = 3;
        //
        int soma = a+b;
        int subtracao = a - b;
        int multiplicacao = a*b;
        float divisao = (float) a/b;
        //
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " +subtracao);
        System.out.println("Multiplicação: "+multiplicacao);
        System.out.println("Divisão: "+divisao);

        System.out.println(" ");
        System.out.println("Variaveis boolean ");

         //boolean resultado = false;
        //System.out.println(resultado);

        boolean fimDeSemana = true;
        boolean fazendoSol = true;

        boolean vamosAPraia = fimDeSemana && fazendoSol;

        String mensagem = "Vamos a praia ? " + (fimDeSemana ? "Sim, Hoje é Fim de Semana" : "Não, Hoje não é fim de semana") ;




        System.out.println(mensagem);

        System.out.println("////////////////////////////////////////////////////////////////////////");

        System.out.println("Tabela Verdade");
        System.out.println("Operador && ( AND ) -" +
                " true && true = true ," +
                " true && false = false ," +
                " false && true = false ," +
                " false && false = false");

        System.out.println("Operador || ( OR ) - " +
                " true || true = true ," +
                " true || false = true ," +
                " false || true = true ," +
                " false || false = false");

        System.out.println("////////////////////////////////////////////////////////////////////////");


        //
    }
}