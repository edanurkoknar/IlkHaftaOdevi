package javaHelloWorld;

public class MiniProje5 {

	public static void main(String[] args) {
		int [] sayilar = new int [] {1,2,5,7,9,0};
		int atanacak = 5;
		boolean varM� = false;
		
		for(int sayi : sayilar) {
			if(sayi == atanacak) {
				varM� = true;
				break;
			}
		}
		
		if (varM�) {
			System.out.println("say� mevccuttur");
		}else {
			System.out.println("say� mevcut de�ildir");
		}
		

	}

}
