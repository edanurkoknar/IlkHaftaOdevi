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
		String mesaj = "Öðrenci sayýsý : ";
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
			System.out.println("Sayý 20'den küçüktür.");
		}
		else if (sayi2 == 20){
			System.out.println("Sayý 20'ye eþittir.");
		}
		else {
			System.out.println("Sayý 20'den büyüktür");
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
		System.out.println("En büyük = "+enBuyuk);
		
		//11.video
		char grade = 'A';
		switch(grade) {
		case 'A':
			System.out.println("mükemmel : geçtiniz");
			break;
		case 'B':
			System.out.println("çok güzel : geçtiniz");
			break;
		case 'C':
			System.out.println("iyi : geçtiniz");
			break;
		case 'D':
			System.out.println("fena deðil : geçtiniz");
			break;
		case 'F':
			System.out.println("malesef : kaldýnýz");
			break;
			default:
				System.out.println("geçersiz not girdiniz");
		
		}
		

	}

}
