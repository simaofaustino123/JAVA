package br.com.geekuniversity.secao13;
//Template method
public abstract class Treinamento {

	//Template Method
	public final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}

	public abstract void preparoFisico();
	
	public abstract void jogoTreino();
	
	public final void treinoTatico() {
		System.out.println("Treino t�tico...");
	}
	
}
