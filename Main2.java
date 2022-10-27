package javaHelloWorld;

public class Main2 {

	public static void main(String[] args) {

		//12.video
		//FOR DONGUSU
		for(int i=1; i<10; i++) {
			System.out.println(i);
		}
		System.out.println("for döngüsü bitti 1");
		
		for(int i=1; i<10; i+=2) {
			System.out.println(i);
		}
		System.out.println("for döngüsü bitti 2");
		
		//13.video
		//WHILE DONGUSU
		int i = 1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("while döngüsü bitti 1");
		
		//14.video
		//DO-WHILE DONGUSU 
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("do-while döngüsü bitti 1");
		//(sart saglanmasa bile program calýsýr)
		int y=100;
		do {
			System.out.println(y);
			y+=2;
		}while(y<10);
		System.out.println("do-while döngüsü bitti 2");
			
	}

	}
