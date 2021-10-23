/*
Este Aplicativo � um teste de meus aprendizado sobre vetores
Autor: Igor Montezuma
*/
package aplicativoBaralho;
import java.util.Random;

public class AplicativoBaralho {

	public static void main(String[] args) {
		
		String[] faces = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
		String[] nipes = {"Espadas", "Paus", "Copas", "Ouros"};
		
		Random r = new Random();
		
		int indiceFace = r.nextInt(faces.length);
		String face = faces[indiceFace];
		
		int indiceNipe = r.nextInt(nipes.length);
		String nipe = nipes[indiceNipe];
		
		String carta = face + " " + nipe;
		System.out.println(carta);
		
		
	}

}
