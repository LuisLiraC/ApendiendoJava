
public class Matriz3 {
	
	public static void main(String[] args) {
		
		int [] aleatorio = new int[150];
		
		for (int i=0; i < aleatorio.length; i++) {
			aleatorio[i]=(int)Math.round(Math.random()*100);
		}
		
		for (int elemento:aleatorio) {
			System.out.print(elemento + " ");
		}
	}
}