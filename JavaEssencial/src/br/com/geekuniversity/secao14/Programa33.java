package br.com.geekuniversity.secao14;
//Interface - O que � e quando usar

/*
- S�o conhecidas como contratos;

Uma empresa criou um contrato "com regras" para definir a 
cria��o de um produto/servi�o.

Quem implementar este contrato, � obrigado a seguir as regras.

Jo�o decidiu implementar  um produto/servi�o baseado no contrato.
Maria tamb�m decidiu implementar um produto/servi�o baseado no contrato

Contrato para a confec��o de um bolo
	- Bolo precisa ser de chocolate;
	- Bolo deve ter cobertura;
	- Bolo deve ser recheado;

 */


public class Programa33 {

	public static void main(String[] args) {
		
		Ventilador vent = new Ventilador();
		
		System.out.println("A marca do ventiladior � " + vent.MARCA);
		
		vent.desligar();
		vent.ligar();
		vent.desligar();
		

	}

}
