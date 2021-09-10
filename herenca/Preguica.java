package br.com.herenca;

public class Preguica extends Animal {
	
	private String subirArvore;

	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}
	
	void subir() {
	System.out.println("Ela sobe na arvore vagarosamente...");	
	}

}
