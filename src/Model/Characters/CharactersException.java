package Model.Characters;

public class CharactersException extends Exception {

	public CharactersException(String n){
		if(n.compareTo("Negative")==0){
			System.out.println("level n�gatif. Level ramen� � 1");
		}
		
		if(n.compareTo("Enemy 0")==0){
			System.out.println("Enemy level 0. Level ramen� � 1");
		}
	}
	
}
