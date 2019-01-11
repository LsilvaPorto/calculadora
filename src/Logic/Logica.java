package Logic;

public class Logica {

	private float num1;
	private float num2;
	public static int idOperacao = 0;
	public static float resultado;
	
	public void clearNuns() {
		num1 = 0;
		num2 = 0;
		idOperacao = 0;
	}
	
	public float getNum1() {
		return num1;
	}

	public float soma(float x, float y) {
		num1 = x;
		num2 = y;
		return (num1 + num2);

	}

	public float sub(float x, float y) {
		num1 = x;
		num2 = y;
		return (num1 - num2);
	}

	public float multi(float x, float y) {
		num1 = x;
		num2 = y;
		return (num1 * num2);
	}

	public float div(float x, float y) {
		num1 = x;
		num2 = y;
		return (num1 / num2);
	}

	public void salvaNum1(String texto) {
		if (idOperacao == 0) {
			float num = Float.parseFloat(texto);
			num1 = num;
		}
	}

		public float percent(float x) {
			return x/100;
		}

	public void salvaNum2(String texto) {
		float num = Float.parseFloat(texto);
		num2 = num;
	}

	public void checkOperacao() {
		
		if (idOperacao == 1) {
			soma(num1, num2);
			resultado = soma(num1, num2);
		} else if (idOperacao == 2) {
			sub(num1, num2);
			resultado = sub(num1, num2);
		} else if (idOperacao == 3) {
			multi(num1, num2);
			resultado = multi(num1, num2);
		} else if (idOperacao == 4) {
			div(num1, num2);
			resultado = div(num1, num2);
		}
	}
}
