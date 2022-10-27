package javaHelloWorld;

public class MiniProje5 {

	public static void main(String[] args) {
		int [] sayilar = new int [] {1,2,5,7,9,0};
		int atanacak = 5;
		boolean varMý = false;
		
		for(int sayi : sayilar) {
			if(sayi == atanacak) {
				varMý = true;
				break;
			}
		}
		
		if (varMý) {
			System.out.println("sayý mevccuttur");
		}else {
			System.out.println("sayý mevcut deðildir");
		}
		

	}

}
