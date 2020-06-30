package br.com.geekuniversity.secao22;

//Stream + Thread (paralelismo)

/*
Útil qdo estamos trabalhando com milhoes/bilhoes de dados

Não é recomendado para quantidade pequena de dados
*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa81 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Programação para leigos", 170));
		cursos.add(new Curso("Algoritmos e Lógica de Programação: Essencial", 280));
		cursos.add(new Curso("Programação em C: Essencial", 125));
		cursos.add(new Curso("Programação em JAVA: Essencial", 0));
		cursos.add(new Curso("Programação em Python: Essencial", 0));
		cursos.add(new Curso("Banco de dados: Essencial", 0));
		
		cursos.parallelStream().
		filter(c -> c.getAlunos() >= 100)
		.collect(Collectors.toMap(
				c -> c.getNome(),
				c -> c.getAlunos()))
		.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));
	}

}
