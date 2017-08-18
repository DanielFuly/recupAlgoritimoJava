package exercicio1;

public class Exer2 {
	
	public static void main(String [] args){
		
		int lado1 = 15;
		int lado2 = 15;
		int lado3 = 15;

		if(lado1 == lado2 && lado2 == lado3 && lado1 == lado3){
				System.out.println("Triangulo Equilátero.");
			}else if (lado1 == lado2 && lado1 != lado3){
				System.out.println("Triangulo Isósceles.");
			}else if (lado1 == lado3 && lado1 != lado2){
				System.out.println("Triangulo Isósceles.");	
			}else if (lado1 != lado2 && lado2!= lado3 && lado1 != lado3){
				System.out.println("Triangulo Escaleno.");
			}
	}
}

