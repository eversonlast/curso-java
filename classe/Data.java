package classe;

public class Data 
{
	int dia;
	int mes;
	int ano;
	
	Data()
	{
	//	dia = 01;
	//	mes = 01;
	//	ano = 1970;
		this(1, 1, 1970);
	// byte, short, int, long -> 0
	// float, double -> 0.0
	// char -> '\u0000'
	//String, Objetos -> null 
	// Variáveis locais não é inicializada por padrão, obrigatoriamente tem que inicializá-la.
	// Constante tem que ser inicializada, podendo ser no momento da criação ou no construtor.
	}
	
	Data (int dia, int mes, int anoAtual)
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = anoAtual;
	}
	
	String obterDataFormatada()
	{
		//return  dia + "/" + mes + "/" + ano;
		String formato = "%d/%d/%d";//Variáveis locais, que estão nos métodos o seu valor só fica no método, assim quando o método para de funcionar o seu valor também é destruído
		return String.format(formato, this.dia, mes, ano);
	}
	
	void imprimirDataFormatada() 
	{
		System.out.println(obterDataFormatada());
	}
}
