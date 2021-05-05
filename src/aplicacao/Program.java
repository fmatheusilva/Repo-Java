package aplicacao;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho da matriz: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				System.out.println("Digite um valor para a posição: " + i + ", " + j);
				mat[i][j] = sc.nextInt();
				
			}
		}
		
		
		System.out.println("===========================");
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + "\t");
				if(j == 2) {
					
					System.out.println("");
					
				}
			}
		}
			System.out.println("===========================");
			System.out.println("Diagonal principa: ");
			
			for(int i = 0; i < mat.length; i++) {
				for(int j = 0; j < mat.length; j++) {
					if(i == j ) {
					
						System.out.print(mat[i][j] + " ");
					}
				}
			}
			System.out.println("");
			System.out.println("===========================");
			int sum=0;
			for(int i = 0; i < mat.length; i++) {
				for(int j = 0; j < mat.length; j++) {
					if(mat[i][j] < 0 ) {
						sum++;
					}
				}
			}
			
			System.out.println("Número negativos: " + sum);
			
			
			
			sc.close();
		}
	}
		
		