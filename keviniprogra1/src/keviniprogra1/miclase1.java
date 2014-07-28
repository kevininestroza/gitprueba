package keviniprogra1;
import java.util.Scanner;

public class miclase1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("ingrese un numero: ");
		int numero = scanner.nextInt();
		System.out.print("ingrese otro numero");
		int numero2 = scanner.nextInt();
		if(numero==numero2)
		{
			System.out.print("son iguales");
		}else if(numero > numero2)
		{
			System.out.print("numero1 es mayor que numero 2");
		}else 
		{
			System.out.print("numero2 es mayor que numero1");
		}
	 }


}


