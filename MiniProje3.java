package javaHelloWorld;

public class MiniProje3 {

	public static void main(String[] args) {
		//m�kemmel say�lar
		//6 ... 1,2,3 (1+2+3=6)
		//28... 1,2,4,7,14 (1+2+4+7+14=28)
		int number = 28;
		int total =0;
		
		for(int i=1; i<number; i++) {
			if(number % i == 0) {
				total = total + i;
			}
		}
		
		if(total == number) {
			System.out.println("m�kemmel say�");
		}
		else {
			System.out.println("m�kemmel say� de�ildir");
		}

	}

}
