package br.com.geekuniversity.secao19;
//Listas

import java.util.ArrayList;
import java.util.Collections;

public class Programa46 {

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<Integer> numeros = new ArrayList<Integer>();
			
			numeros.add(42);
			numeros.add(24);
			numeros.add(12);
			numeros.add(2);
			numeros.add(91);
			
			Collections.sort(numeros);
			
//			for (int i = 0; i < numeros.size(); i++) {
//				System.out.println(numeros.get(i));
//			}
			
			for (Integer numero : numeros) {
				System.out.println(numero);
			}
			
		}

	

}
