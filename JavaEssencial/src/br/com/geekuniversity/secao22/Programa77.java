package br.com.geekuniversity.secao22;
//Streams
import java.util.ArrayList;
import java.util.List;

public class Programa77 {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Programação para leigos", 170));
		cursos.add(new Curso("Algoritmos e Lógica de Programação: Essencial", 280));
		cursos.add(new Curso("Programação em C: Essencial", 125));
		cursos.add(new Curso("Programação em JAVA: Essencial", 0));
		cursos.add(new Curso("Programação em Python: Essencial", 0));
		cursos.add(new Curso("Banco de dados: Essencial", 0));
		
		//Imprimir nnumero de alunos dos cursos com mais de 100 alunos
		cursos.stream()
			.filter(c -> c.getAlunos()>=100)
				.map(Curso::getAlunos)//Mapeira tipo de dado para outro
					.forEach(System.out::println);
	}
}
