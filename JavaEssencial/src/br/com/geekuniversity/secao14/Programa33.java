package br.com.geekuniversity.secao14;
//Interface - O que é e quando usar

/*
- São conhecidas como contratos;

Uma empresa criou um contrato "com regras" para definir a 
criação de um produto/serviço.

Quem implementar este contrato, é obrigado a seguir as regras.

João decidiu implementar  um produto/serviço baseado no contrato.
Maria também decidiu implementar um produto/serviço baseado no contrato

Contrato para a confecção de um bolo
	- Bolo precisa ser de chocolate;
	- Bolo deve ter cobertura;
	- Bolo deve ser recheado;

 */


public class Programa33 {

	public static void main(String[] args) {
		
		Ventilador vent = new Ventilador();
		
		System.out.println("A marca do ventiladior é " + vent.MARCA);
		
		vent.desligar();
		vent.ligar();
		vent.desligar();
		

	}

}
