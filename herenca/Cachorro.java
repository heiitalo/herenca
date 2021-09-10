package br.com.herenca;

public class Cachorro extends Animal {
	
	private String correr;
	
	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	void corre() {
		
		System.out.println("O cachorro esta correndo muito rápido!!");
	}
	

}
