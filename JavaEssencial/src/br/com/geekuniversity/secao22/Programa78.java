package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

//Streams
public class Programa78 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Programação para leigos", 170));
		cursos.add(new Curso("Algoritmos e Lógica de Programação: Essencial", 280));
		cursos.add(new Curso("Programação em C: Essencial", 125));
		cursos.add(new Curso("Programação em JAVA: Essencial", 0));
		cursos.add(new Curso("Programação em Python: Essencial", 0));
		cursos.add(new Curso("Banco de dados: Essencial", 0));
		
		int soma = cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.mapToInt(Curso::getAlunos)//permite que possamos efetuar cáculos com o resultado.
				.sum();
		System.out.println("A soma de alunos nos curso com mais de 100 é " + soma);

	}

}
