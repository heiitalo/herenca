package br.com.herenca;

import java.util.Scanner;

public class ProgramaAnimal {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
    Cavalo cavalo1 = new Cavalo();
	Cachorro cachorro1 = new Cachorro();
	Preguica preguica1 = new Preguica();
	
	//CAVALO
    System.out.println("Qual o nome do cavalo? ");
    cavalo1.setNome(entrada.nextLine());
    System.out.println("Qual a idade do " + cavalo1.getNome() + "?");
    cavalo1.setIdade(entrada.nextInt());
    
    //CACHORRO
    System.out.println("Qual o nome do cachorro?");
    cachorro1.setNome(entrada.next());
    System.out.println("Qual a idade do " + cachorro1.getNome() + "?");
    cachorro1.setIdade(entrada.nextInt());
    
    //PREGUIÇA
    System.out.println("Qual o nome da preguiça?");
    preguica1.setNome(entrada.next());
    System.out.println("Qual a idade do " + preguica1.getNome() + "?");
    preguica1.setIdade(entrada.nextInt());
    
    System.out.println("==================================================================================");
    
    System.out.println("O cavalo se chama: " + cavalo1.getNome() + " ele tem " + cavalo1.getIdade() + " anos");
    cavalo1.corre();
    System.out.println();
    System.out.println("O cachorro se chama: " + cachorro1.getNome() + " ele tem " + cachorro1.getIdade() + " anos");
    cachorro1.corre();
    System.out.println();
    System.out.println("a preguiça se chama : " + preguica1.getNome() + " ela tem " + preguica1.getIdade() + " anos");
    preguica1.subir();
	
	
	entrada.close();
	}

	
	
}
