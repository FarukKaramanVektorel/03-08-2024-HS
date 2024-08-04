
import java.util.Arrays;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] product = { { "Laptop", "Kasa", "Tablet" }, { "Fare", "Klavye", "Ekran" },
				{ "Cola", "Islak Medil", "Kolonya" } };
		double[][] price = { { 35000, 30000, 15000 }, { 1000, 1500, 3200 }, { 30, 20, 50 } };
		// buying[] ürün ve adet
		String[][] buying = new String[2][product.length * product[0].length];
		int alim = 0;
		while (true) {
			System.out.println("İşlem seçiniz:\n1-Alışveriş\n2-Çıkış");
			int islem = input.nextInt();
			if (islem == 1) {
				System.out.println("Kategori Seçiniz\n0-Bilsiyayar\n1-OEM\n2-diğer");
				int cat = input.nextInt();
				if (cat == 0) {
					for (int i = 0; i < price[0].length; i++) {
						System.out.println(
								"Ürün adı: " + product[0][i] + " Fiyatı: " + price[0][i] + " Ne kadar Alıyorsun?");
						int adet = input.nextInt();
						if (adet > 0) {
							buying[0][alim] = "0-" + i;
							buying[1][alim] = String.valueOf(adet);

							alim++;
						}

					}
				} else if (cat == 1) {
					for (int i = 0; i < price[1].length; i++) {

						System.out.println(
								"Ürün adı: " + product[1][i] + " Fiyatı: " + price[1][i] + " Ne kadar Alıyorsun?");
						int adet = input.nextInt();
						if (adet > 0) {
							buying[0][alim] = "1-" + i;
							buying[1][alim] = String.valueOf(adet);

							alim++;
						}
					}
				} else if (cat == 2) {
					for (int i = 0; i < price[2].length; i++) {
						System.out.println(
								"Ürün adı: " + product[2][i] + " Fiyatı: " + price[2][i] + " Ne kadar Alıyorsun?");
						int adet = input.nextInt();
						if (adet > 0) {
							buying[0][alim] = "2-" + i;
							buying[1][alim] = String.valueOf(adet);

							alim++;
						}
					}
				}
			} else {
				break;
			}

		}
double toplamOdenecek=0;
		for (int j = 0; j < buying[0].length; j++) {
			if (buying[0][j] != null) {
				
				String temp=buying[0][j];				
				String[] koordinat = temp.split("-");			
				int cat = Integer.valueOf(koordinat[0]);
				int price1 = Integer.valueOf(koordinat[1]);
				int alimAdedi = Integer.valueOf(buying[1][j]);
				toplamOdenecek+=alimAdedi * price[cat][price1];
				System.out.print(" Ürün : " + product[cat][price1]);
				System.out.print(" Alım Adedi: " + buying[1][j]);
				System.out.print(" Toplam Fiyat: " + alimAdedi * price[cat][price1]);

			}
			System.out.println();

		}
		System.out.println("Toplam Ödenecek Miktar : "+toplamOdenecek+"TL");

	}

}