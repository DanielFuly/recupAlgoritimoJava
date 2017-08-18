package exercicio1;

public class Exer4 {

	public static void main(String [] args){
		
		double saldo = 500;

		if(saldo < 201){
				System.out.println("Nenhum credito");
			}else if (saldo <= 401){
				System.out.println("Credito do cliente com acréscimo:" + (saldo * 1.2) + "\nSaldo do cliente:" + saldo);
			}else if (saldo <= 600 ){
				System.out.println("Credito do cliente com acréscimo:" + (saldo * 1.3) + "\nSaldo do cliente:" + saldo);
			}else if(saldo >= 601){
				System.out.println("Credito do cliente com acréscimo:" + (saldo * 1.4) + "\nSaldo do cliente:" + saldo);
				}

			}
		}
	
