package view;

import br.edu.fateczl.calc.bubble.operations;

public class MainBubble 
{
	
	public static void main(String[] args) 
	{
		operations c = new operations();
		
		int[] vet = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		
		vet = c.bublesort(vet);
		
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
