package br.com.geekuniversity.secao14;

/*
 Uma interface pode conter:
 	- constantes: valores fixos;
 	- m�todos abstratos;
 
 Interface para servir de contrato para produtos eletr�nicos. Todo
 produto eletr�nico que implementar esta interface, OBRIGATORIAMENTE
 dever� os m�todos abstratos.
 */

public interface IEletronico {
	
	public String MARCA = "Geek"; //Cosntante
	
	public void desligar();
	
	public void ligar();
}
