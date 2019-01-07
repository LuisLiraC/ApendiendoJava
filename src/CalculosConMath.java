
public class CalculosConMath {

	public static void main(String[] args) {
		
		double raiz=Math.sqrt(11);		
		System.out.println(raiz);
		// 3.316624...	
		
		double exponencial=Math.pow(3,3);
		System.out.println(exponencial);
		// 27.0
		
		double sin=Math.sin(10);
		System.out.println(sin);
		// -0.5440...
		
		double round=Math.round(85.59);
		System.out.println(round);
		// 86.0
		
		double pi=Math.PI * 5;
		System.out.println(pi);
		// 15.7079...
		
		// Refundición (Convertir un tipo de dato a otro)
		double num1=5.85;
		int num2=(int)Math.round(num1);
		System.out.println(num2);
	}

}
