import java.rmi.registry.LocateRegistry;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;

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
        System.out.println("Condicionais");
        System.out.println(" ");

        int nota = 80;
        String graduacao = "";

        System.out.println("Nota do Aluno: " + nota);
        // A 80, B 70 C 60 D 0

        if(nota>=80 && nota >70){
            graduacao = "A";
            }else if (nota>=70 && nota > 60){
            graduacao = "B";
            }else if (nota >= 60 && nota > 50) {
            graduacao = "C";
            }else if (nota == 50) {
            graduacao = "D";
            }else if(nota < 50 && nota >= 0){
            graduacao = "Aluno Reprovado";
        }else{
            System.out.println("Nota Inválida");
        }

        switch (graduacao){
            case "A":
                System.out.println("Aprovado, o Aluno atingiu Graduação A");
                break;
            case "B":
                System.out.println("Aprovado, o Aluno atingiu Graduação B");
                break;
            case "C":
                System.out.println("Aprovado, o Aluno atingiu Graduação C");
                break;
            case "D":
                System.out.println("Aprovado, o Aluno atingiu Graduação D");
                break;
            default:
            System.out.println("");
        }

        System.out.println("////////////////////////////////////////////////////////////////////////");
        System.out.println("Manipulando Strings e Datas");

        // Olá, {nome}, Hojé é {dia da semana}. {saudações}

        String nomeMensagem = "Patrick";
        //System.out.println(nomeMensagem.toLowerCase());
        //System.out.println(nomeMensagem.toUpperCase());
        //System.out.println(nomeMensagem.length());

        String compara = "patrick";

        //System.out.println(nomeMensagem.equalsIgnoreCase(compara));

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");

        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;

        LocalDateTime agora = LocalDateTime.now();
        if(agora.getHour() >= 0 && agora.getHour() <12){
            saudacao = "bom dia";
        }else if(agora.getHour() >= 12 && agora.getHour() <18 ){
            saudacao = "boa tarde";
        }else if (agora.getHour() >= 18 && agora.getHour() < 24 ){
            saudacao = "boa noite";
        }else {
            saudacao = "Olá";
        }

        System.out.println("Olá, "+nomeMensagem+". Hoje é " +diaDaSemana.toUpperCase()+", "+saudacao);



    }
}