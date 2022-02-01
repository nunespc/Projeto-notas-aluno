package media;

public class Notas_medelo1 {
	public static void main(String[] args) {
		
		double n1 = 6;
		double n2 = 7;
		double n3 = 9;
		double n4 = 10;
		double media;
		
		Aluno a = new Aluno("");
		
		if(media >= 7.0) {
			System.out.println("O(A)" +a.nome+ " foi aprovado(a)");
		}else if (media <= 6.9 && media >= 5 ){
			System.out.println("O(A)" +a.nome+ "está em reculperação");
		}else {
			System.out.println("O(A)" +a.nome+ " foi reprovado(a)");
		}
	}
	

}
