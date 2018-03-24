package SistemaAlunos;

import java.util.ArrayList;
import java.util.Iterator;


public class Aluno {
	private String nome;
	private int idAluno;
	private ArrayList<String> disciplinas;
	private int ano;
	
	public Aluno() {
		disciplinas = new ArrayList<String>();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public ArrayList<String> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<String> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	public void removerDisciplina(String remover) {
		Iterator<String> iterator = disciplinas.iterator();
		while(iterator.hasNext()) {
			String disci = iterator.next();
			if(disci.equals(remover)) {
				iterator.remove();
			}
		}
	}
	public void adicionarDisciplina(String disciplina) {
		boolean verif= true;
		for(int i=0;i<disciplinas.size();i++) {
			if(this.disciplinas.get(i).equals(disciplina)) {
				verif = false;
				System.out.println("Nao vai add");
			}
		}
		if(verif) {
			this.disciplinas.add(disciplina);
			System.out.println("ADICIONOU " + disciplina);
		}
	}
	public void listarDisciplina() {
		System.out.println("------------------");
		System.out.println("Disciplinas:");
		for(int i=0;i<disciplinas.size();i++) {
			System.out.println((i+1)+":"+this.disciplinas.get(i));
		}
	}
	
}
