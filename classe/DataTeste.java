package classe;

public class DataTeste
{
	public static void main(String[] args) 
	{
		Data d1 = new Data(13, 03, 1986);
				
		var d2 = new Data(29, 12, 1984);
		
		Data d3 = new Data(); 
		
		String dataformatada1 = d1.obterDataFormatada();
	
		
		System.out.println("A data digitada é " + dataformatada1);
		System.out.println("A outra data digitada é " + d2.obterDataFormatada());
		System.out.println("A terceira data digitada é "+ d3.obterDataFormatada());
		
		d1.imprimirDataFormatada();
	}
}
