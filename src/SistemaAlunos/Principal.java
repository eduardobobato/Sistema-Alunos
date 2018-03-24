package SistemaAlunos;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner di = new Scanner(System.in);
        Colegio colegio = new Colegio();
        int digit;
        do {
            System.out.println("--------------------------");
            System.out.println("(1) - Manter Aluno.");
            System.out.println("(2) - Efetuar Operacoes.");
            System.out.println("(0) - Sair.");
            System.out.println("--------------------------");
            digit = Integer.parseInt(di.nextLine());
            switch (digit) {
                case 1:
                    interface0(colegio);
                    break;
                case 2:
                    interface1(colegio);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Operação Invalida.");
                    break;
            }
        } while (digit != 0);
	}
	static void interface0(Colegio colegio) {
        Scanner di = new Scanner(System.in);
        String digi;
        int digit;
        do {
            System.out.println("--------------------------");
            System.out.println("(1)-Cadastrar Aluno");
            System.out.println("(2)-Remover Aluno");
            System.out.println("(3)-Listar Alunos");
            System.out.println("(4)-Pesquisa Aluno");
            System.out.println("(0)-Retornar");
            System.out.println("--------------------------");
            digit = Integer.parseInt(di.nextLine());
            switch (digit) {
                case 1:
                	System.out.print("Insira o nome do aluno: ");
                	digi = di.nextLine();
                	System.out.print("Insira o Ano de estudo: ");
                	int ano = Integer.parseInt(di.nextLine());
                	colegio.cadastrarAluno(digi, ano);
                    break;
                case 2:
                	System.out.print("Insira o numero do aluno: ");
                	digit = Integer.parseInt(di.nextLine());
                	colegio.removerAluno(digit);
                    break;
                case 3:
                	colegio.listarAlunos();
                    break;
                case 4:
                	System.out.print("Insira o nome:");
                	digi = di.nextLine();
                	colegio.pesquisarAluno(digi);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Numero Invalido.");
            }
        } while (digit != 0);
    }

    static void interface1(Colegio colegio) {
        Scanner di = new Scanner(System.in);
        String dig;
        int digit;
        Integer num;
        do {
            System.out.println("--------------------------");
            System.out.println("(1)-Matricular Disciplina");
            System.out.println("(2)-Remover Disciplina");
            System.out.println("(3)-Listar Disciplinas");
            System.out.println("(0)-Retornar");
            System.out.println("--------------------------");
            digit = Integer.parseInt(di.nextLine());
            switch (digit) {
                case 1:
                	System.out.print("Insira o numero do aluno: ");
                	num = Integer.parseInt(di.nextLine());
                    System.out.print("Insira a disciplina: ");
                	dig = di.nextLine();
                	colegio.matriculaDisciplina(dig, num);
                    break;
                case 2:
                	System.out.print("Insira o numero do aluno: ");
                	num = Integer.parseInt(di.nextLine());
                    System.out.print("Insira a disciplina: ");
                	dig = di.nextLine();
                	colegio.removeDisciplina(dig, num);
                    break;
                case 3:
                	System.out.print("Insira o numero do aluno: ");
                	num = Integer.parseInt(di.nextLine());
                	colegio.listarDisciplina(num);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Numero Invalido.");
            }
        } while (digit != 0);
        
    }
}
