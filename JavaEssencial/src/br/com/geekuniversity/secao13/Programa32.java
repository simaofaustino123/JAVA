package br.com.geekuniversity.secao13;

//TEMPLATE METHOD
/*
- Padrão que define o esqueleto de um algorítmo dentro
de um método, transferindo alguns de seus passos para
as subclasses.
- Permite que as subclasses redefinam certos passos de 
um algoritmo sem alterar a estrutura do próprio
algorítimo 

Receber numero
retornar numero * numero

metodo_principal(){
	passo1();
	passo2();
	passo3();
}


 */

public class Programa32 {

	public static void main(String[] args) {
		
		TreinamentoInicioDaTemporada tit = new TreinamentoInicioDaTemporada();
		
		tit.treinoDiario();
		
		TreinamentoFimDaTemporada tft = new TreinamentoFimDaTemporada();
		
		tft.treinoDiario();
		
	}

}
