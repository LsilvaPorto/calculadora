package Logic;

public class Logica {

	public static int num1;
	public static int num2;
	
	public void salvaNum1(String texto) {
		String x = texto.replace("+", "");
		int num = Integer.parseInt(x);
		num1 = num;
		System.out.println(num1);
	}

}
