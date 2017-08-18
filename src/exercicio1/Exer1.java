package exercicio1;

public class Exer1 {
	public static void main(String [] args){
	
	int idade1 = 40;	String nome1 = "Daniel";
	int idade2 = 30;	String nome2 = "Flavio";
	int idade3 = 35;	String nome3 = "Jorge";


	
	if(idade1 > idade2 && idade1 > idade3 && idade3 > idade2){
			System.out.println("Pessoa mais velha:"+ nome1 + "\nPessoa mais nova:" + nome2);
		}else if(idade2 > idade3 && idade2 > idade1 && idade1 > idade3){
			System.out.println("Pessoa mais velha:" + nome2 + "\nPessoa mais nova:" + nome3);
		}else if(idade1 > idade2 && idade1 > idade3 && idade2 > idade3){
			System.out.println("Pessoa mais velha:" + nome1 + "\nPessoa mais nova:" + nome3);
		}else if(idade3 > idade2 && idade3 > idade1 && idade2 > idade1){
			System.out.println("Pessoa mais velha:" + nome3 + "\nPessoa mais nova:" + nome1);
		}else if(idade3 > idade2 && idade3 > idade1 && idade1 > idade2){
			System.out.println("Pessoa mais velha:" + nome3 + "\nPessoa mais nova:" + nome2);
		}else if(idade2 > idade3 && idade2 > idade1 && idade3 > idade1){
			System.out.println("Pessoa mais velha:" + nome2 + "\nPessoa mais nova:" + nome1);
		}
	}
}
	