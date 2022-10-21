package all.about.lambda;

interface Lambd1 {
	public void dis();
}

public class LambdaExp1 {
	
	public static void main(String[] args) {
		Lambd1 ob = () -> System.out.println("Hello");
		ob.dis();
	}

}
