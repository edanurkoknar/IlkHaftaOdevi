package javaHelloWorld;

public class Main {

	public static void main(String[] args) {

		// 6.video
		System.out.println("Merhaba Java");
		System.out.println("Merhaba Java 2");

		// 7.video
		// caseSensetive
		// reusability
		int ogrenciSayisi = 10;
		String mesaj = "��renci say�s� : ";
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println(mesaj + ogrenciSayisi);

		// 8.video
		byte sayi = 12;
		double sayi1 = 12.5;
		sayi1 = -12;
		char karakter = 'e';
		String sehir = "TOKAT";
		boolean dogruMu = false;

		// 9.video
		int sayi2 =16;
		if(sayi2 < 20) {
			System.out.println("Say� 20'den k���kt�r.");
		}
		else if (sayi2 == 20){
			System.out.println("Say� 20'ye e�ittir.");
		}
		else {
			System.out.println("Say� 20'den b�y�kt�r");
		}
		
		//10.video
		int sayi3 = 66 ;
		int sayi4 = 25;
		int sayi5 = 62;
		int enBuyuk = sayi3;
		
		if(enBuyuk < sayi4) {
			enBuyuk = sayi4;
		}
		if(enBuyuk < sayi5) {
			enBuyuk = sayi5;
		}
		System.out.println("En b�y�k = "+enBuyuk);
		
		//11.video
		char grade = 'A';
		switch(grade) {
		case 'A':
			System.out.println("m�kemmel : ge�tiniz");
			break;
		case 'B':
			System.out.println("�ok g�zel : ge�tiniz");
			break;
		case 'C':
			System.out.println("iyi : ge�tiniz");
			break;
		case 'D':
			System.out.println("fena de�il : ge�tiniz");
			break;
		case 'F':
			System.out.println("malesef : kald�n�z");
			break;
			default:
				System.out.println("ge�ersiz not girdiniz");
		
		}
		

	}

}
