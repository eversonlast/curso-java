package classe;


public class Equals 
{
	public static void main(String[] args) 
	{
		Usuarios u1 = new Usuarios();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com.br";
		
		Usuarios u2 = new Usuarios();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com.br";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		//System.out.println(u2.equals(new Date()));
	}
}
