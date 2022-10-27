package javaHelloWorld;

public class Main3 {

	public static void main(String[] args) {
		// 15.video
		String ogrenci1 = "engin";
		String ogrenci2 = "derin";
		String ogrenci3 = "ahmet";

		String[] ogrenciler = new String[3];
		ogrenciler[0] = ogrenci1;
		ogrenciler[1] = ogrenci2;
		ogrenciler[2] = ogrenci3;

		for (int k = 0; k < ogrenciler.length; k++) {
			System.out.println(ogrenciler[k]);
		}

		System.out.println("--------");

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

		// 16.video
		double[] myList = { 1.2, 1.3, 4.3, 5.6 };
		double total = 0;
		double max = myList[0];

		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}

		System.out.println("toplam = " + total);
		System.out.println("en büyük = " + max);

		System.out.println("--------");

		// 17.video
		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "istanbul";
		sehirler[0][1] = "bursa";
		sehirler[0][2] = "bilecik";
		sehirler[1][0] = "ankara";
		sehirler[1][1] = "konya";
		sehirler[1][2] = "kayseri";
		sehirler[2][0] = "diyarbakýr";
		sehirler[2][1] = "urfa";
		sehirler[2][2] = "antep";

		for (int i = 0; i < 2; i++) {
			System.out.println("****");
			for (int j = 0; j <= 2; j++) {
				System.out.println(sehirler[i][j]);
			}
		}
		System.out.println("&&&&");

		// 18.video
		String mesaj = "bugün hava çok güzel.";
		System.out.println(mesaj);

		System.out.println("eleman sayýsý: " + mesaj.length());
		System.out.println("5.eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" yaþasýn!"));
		System.out.println(mesaj.startsWith("b"));
		System.out.println(mesaj.endsWith("?"));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.lastIndexOf('a'));

		System.out.println("%%%%%");
		// 19.video
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2)); // 2den itibaren parçala
		System.out.println(mesaj.substring(2, 9));

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());

		String newMessage = "     bugün hava çok güzel ";
		System.out.println(newMessage.trim());

	}

}
