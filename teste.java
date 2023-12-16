
public class teste {

	public static void main(String[] args) {

		// Maintenant essayer d’instancier une classe abstraite et 
		//-une interface, est-ce que cela est possible ?
		//Pet p = new Pet() ;
			Chien p = new Chien("IbnZaid", false, 3, 8);
			System.out.println(p);
			p.diagnostique();
			p.CanBePet();
			p.Cri();
	}

}
