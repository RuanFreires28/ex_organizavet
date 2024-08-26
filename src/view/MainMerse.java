package view;

import br.edu.fateczl.calc.merse.operations;

public class MainMerse 
{
	public static void main(String[] args) 
	{
		operations c = new operations();
		
		int[] vet = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		
		int inicio = 0;
		int fim = (vet.length - 1);
		
		vet = c.MergeSort(vet, inicio, fim);
		
		int cont = 1;
		
		for (int i:vet)
		{
			if (cont == (vet.length))
			{
				System.out.print(i);
			}
			else
			{
				System.out.print(i + ", ");
				cont++;
			}
		}	
	}
}
