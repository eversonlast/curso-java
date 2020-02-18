package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Por favor digite a quantidade de notas: ");
		int quantidade = s.nextInt();
		
		double [] notas = new double[quantidade];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Por favor digite a nota " + (i+1) + ": ");
			notas[i] = s.nextDouble();
		}
		System.out.println(Arrays.toString(notas));
		
		double total = 0;
		for(double nota: notas){
			total += nota;
		}
		double media = total / notas.length;
		System.out.println("A média do aluno é: " + media);
		s.close();
	}
}
