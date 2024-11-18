package view;

import br.edu.fatezl.arvore_char.Arvore;
import controller.ArvoreController;

public class Principal {

	public static void main(String[] args) {
		
		char [] vet= {'k','d','m','b','f','l','t','c','p','z','r'};
		
		ArvoreController cont=new ArvoreController();
		
		cont.executar(vet);
	}

}
