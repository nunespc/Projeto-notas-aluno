package media;
import java.util.Scanner;

import pessoa.Aluno;

public class Nota_modelo2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Aluno p = new Aluno("");
		
		System.out.println("Informe o nome do aluno(a):  ");
		p.nome = entrada.next();
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		double nota3 = entrada.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		double nota4 = entrada.nextDouble();
		 
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media >= 7.0) {
			System.out.println("O(A) aluno(a) "+ p.getNome() +" obteve a média "+ media + " e foi aprovado.");
		}else if (media <= 6.9 && media >= 5 ){
			System.out.println("O(A) aluno(a) "+ p.getNome() +" obteve a média "+ media + " e esta em reculperação.");
		}else {
			System.out.println("O(A) aluno(a) "+ p.getNome() +" obteve a média "+ media + " e foi reprovado.");
		}
		
		entrada.close();
		
	}
}
