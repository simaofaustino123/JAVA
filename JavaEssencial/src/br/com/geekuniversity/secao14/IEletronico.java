package br.com.geekuniversity.secao14;

/*
 Uma interface pode conter:
 	- constantes: valores fixos;
 	- métodos abstratos;
 
 Interface para servir de contrato para produtos eletrônicos. Todo
 produto eletrônico que implementar esta interface, OBRIGATORIAMENTE
 deverá os métodos abstratos.
 */

public interface IEletronico {
	
	public String MARCA = "Geek"; //Cosntante
	
	public void desligar();
	
	public void ligar();
}
