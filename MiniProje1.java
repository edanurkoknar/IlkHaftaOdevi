package javaHelloWorld;

public class MiniProje1 {

	public static void main(String[] args) {
		int number = -1;
		int remainder = number % 2;
		//System.out.println(remainder);
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Sayý asal deðildir");
			return;
		}
		
		if(number<1) {
			System.out.println("geçersiz sayý");
			return;
		}
		
		for (int i=2 ; i<number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("sayý asaldýr");
		}
		else {
			System.out.println("sayý asal deðildir");
		}
	}

}
