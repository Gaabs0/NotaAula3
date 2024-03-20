import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    Funcionario f = new Funcionario();
    Diretor  d = new Diretor();
    Gerente g = new Gerente();

        System.out.println("Cadastro do Gerente:");
        //

        System.out.println("Qual seu nome?");
        g.setNome(sc.nextLine());

        System.out.println("Qual seu salario?");
        g.setSalario(sc2.nextDouble());

        System.out.println("Qual seu departamento?");
        g.setDepartamento(sc.nextLine());



        System.out.println("Cadastro do Diretor:");

        System.out.println("Qual seu nome?");
        d.setNome(sc.nextLine());

        System.out.println("Qual seu salario?");
        d.setSalario(sc2.nextDouble());

        System.out.println("quantas ações tem?");
        d.setAcoes(sc.nextInt());


        System.out.println("Dados cadastrados:");

        System.out.println("Gerente:");

        System.out.println("Nome: " + g.getNome());

        System.out.println("Salário: " + g.getSalario());

        System.out.println("Departamento: " + g.getDepartamento());

        System.out.println("Bônus: " + g.calcularbonus());


        System.out.println("Diretor:");
        //
        System.out.println("Nome: " + d.getNome());

        System.out.println("Salário: " + d.getSalario());

        System.out.println("Quantidade de ações: " + d.getAcoes());







    }


    }