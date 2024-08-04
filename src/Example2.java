import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("ŞEN KARDEŞLER MANAVINA HOŞ GELDİNİZ!!!");

		String[][] products = { { "Elma", "Kiraz", "Kayısı", "Şeftali", "Armut", "Kavun" },
				{ "Maydanoz", "Tere", "Roka", "Marul", "Dereotu", "Kabak" } };
		double[][] price = { { 24.99, 34.99, 39.99, 29.99, 39.99,40 }, { 14.99, 14.99, 14.99, 24.99, 14.99, 26.99 } };

		double[][] buying = new double[products.length][products[0].length];

		while (true) {
			System.out.println("Ne Almak İstersiniz\n1-Alış Veriş\n0-Çıkış");
			int islem = in.nextInt();
			if (islem == 1) {
				for (int i = 0; i < products.length; i++) {
					for (int j = 0; j < products[i].length; j++) {
						System.out.println(
								"Ürün: " + products[i][j] + " Fiyat: " + price[i][j] + " Nekadar almak İstiyorsun");
						double buy = in.nextDouble();
						buying[i][j] = buy;
					}

				}
			} else {
				break;
			}
		}

		double toplamOdeme = 0;
		for (int i = 0; i < products.length; i++) {
			for (int j = 0; j < products[i].length; j++) {
				if(buying[i][j]>0) {
					double miktar=price[i][j] * buying[i][j];
				System.out.println(
						"Ürün: " + products[i][j] + " Fiyat: " + price[i][j] 
								+ " Aldığın Miktar: " + buying[i][j]+" Toplam Fiyatı: "+miktar);
				toplamOdeme += miktar;
				}
			}

		}
		System.out.println("Toplam Ödemen Gereken Miktar: "+toplamOdeme);

	}

}