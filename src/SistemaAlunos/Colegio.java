package SistemaAlunos;

import java.util.ArrayList;
import java.util.Iterator;

public class Colegio {
	private ArrayList<Aluno> alunos;
	private int idProximo;
	public Colegio() {
		alunos = new ArrayList<Aluno>();
		idProximo=1;
	}
	public void cadastrarAluno(String nome, int ano) {
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setAno(ano);
		aluno.setIdAluno(idProximo);
		idProximo++;
		alunos.add(aluno);
	}
	public void removerAluno(int idAluno) {
		Iterator<Aluno> iterator = alunos.iterator();
		while(iterator.hasNext()) {
			Aluno disci = iterator.next();
			if(disci.getIdAluno() == idAluno) {
				iterator.remove();
			}
		}
	}
	public void listarAlunos() {
		System.out.println("-----------------------------");
		for(int i=0;i<alunos.size();i++) {
			System.out.println("ID Aluno: "+alunos.get(i).getIdAluno());
			System.out.println("Nome Aluno: "+alunos.get(i).getNome());
			System.out.println("Ano: "+alunos.get(i).getAno()+"º Ano");
			System.out.println("-----------------------------");
		}
	}
	public void pesquisarAluno(String nome) {
		for(int i=0;i<alunos.size();i++) {
			if(alunos.get(i).getNome().equals(nome)) {
				System.out.println("ID Aluno: "+alunos.get(i).getIdAluno());
				System.out.println("Nome Aluno: "+alunos.get(i).getNome());
				System.out.println("Ano: "+alunos.get(i).getAno()+"º Ano");
			}
		}
	}
	public void matriculaDisciplina(String nome, int id) {
		for(int i=0;i<alunos.size();i++) {
			if(alunos.get(i).getIdAluno() == id) {
				alunos.get(i).adicionarDisciplina(nome);
				System.out.println("Vai matricular");
			}
		}
	}
	public void removeDisciplina(String nome, int id) {
		for(int i=0;i<alunos.size();i++) {
			if(alunos.get(i).getIdAluno() == id) {
				alunos.get(i).removerDisciplina(nome);
			}
		}
	}
	public void listarDisciplina(int id) {
		for(int i=0;i<alunos.size();i++) {
			if(alunos.get(i).getIdAluno() == id) {
				alunos.get(i).listarDisciplina();
			}
		}
	}
}
