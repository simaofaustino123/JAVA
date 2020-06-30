package br.com.geekuniversity.secao22;
//STREAM
import java.util.ArrayList;
import java.util.List;

public class Programa79 {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Programa��o para leigos", 170));
		cursos.add(new Curso("Algoritmos e L�gica de Programa��o: Essencial", 280));
		cursos.add(new Curso("Programa��o em C: Essencial", 125));
		cursos.add(new Curso("Programa��o em JAVA: Essencial", 0));
		cursos.add(new Curso("Programa��o em Python: Essencial", 0));
		cursos.add(new Curso("Banco de dados: Essencial", 0));

		cursos.stream()
			.filter(c -> c.getAlunos() < 1 )
			//.findAny()// pega aqlqr um de acordo com o filtro 
			.findFirst()//pega o primeiro
			.ifPresent(System.out::println);//se encotnrar algum curso, imprime

	}
}
