package Singleton;
public class Client {
	public static void main(String[] args) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		
		System.out.println("\nShow the initial values... ");
        System.out.println("Empty: " + boiler.isEmpty()); 
        System.out.println("Boiled: " + boiler.isBoiled());
        
        System.out.println("\nFill and boil");
        boiler.fill();
        boiler.boil();
        
        System.out.println("\nShow the values... ");
        System.out.println("Empty: " + boiler.isEmpty()); 
        System.out.println("Boiled: " + boiler.isBoiled()); 

        System.out.println("\nDrain");
        boiler.drain();
        
        System.out.println("\nShow the values... ");
        System.out.println("Empty: " + boiler.isEmpty()); 
        System.out.println("Boiled: " + boiler.isBoiled());
	}
}

//GONZÁLEZ HERNÁNDEZ YAEL GUILLERMO
//PATRONES DE DISEÑO DE SOFTWARE