package controller;

import br.edu.fatezl.arvore_char.Arvore;

public class ArvoreController {

	public ArvoreController() {
		super();
	}

	public void executar(char[] vet) {
		
		Arvore arvore=new Arvore();
		for(char elemento:vet) {
			if (Character.isUpperCase(elemento)) {
			    elemento = Character.toLowerCase(elemento);
			}
			arvore.Insert(elemento);
		}
		
		 try {
			 System.out.println("\n pré ordem: ");
			arvore.prefixSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			System.out.println("\n Em Ordem :");
			arvore.infixSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			 System.out.println("\n Pós Ordem :");
			arvore.postfixSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("\n\n\nRemovendo M");
		 arvore.remove('m');
		 
		 
		 
		 System.out.println("\n");
		 arvore.search('r');
		
	}

}
