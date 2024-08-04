import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// boolean
		// byte
		// short
		// float
		// char
		int sayi = 7895;
		String ad = "Elif Eylül";
		int[] numbers = new int[5];
		System.out.println(numbers.length);

		System.out.println(ad.length());

		System.out.println(ad.charAt(0));
		System.out.println(ad.substring(5));
		System.out.println(ad.substring(2, 5));
		System.out.println(ad.toLowerCase());
		System.out.println(ad.toUpperCase());
		String[] iller = { "Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Aksaray", "Amasya", "Ankara", "Antalya",
				"Artvin", "Aydın", "Balıkesir", "Bartın", "Batman", "Bayburt", "Bilecik", "Bingöl", "Bitlis", "Bolu",
				"Burdur", "Bursa" };
		int[] plakalar = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
//		System.out.println("İl adını giriniz");
//		Scanner in=new Scanner(System.in);
//		String il=in.next();
//		int plaka=0;
//		for (int i = 0; i < iller.length; i++) {
//			if(iller[i].toLowerCase().equals(il.toLowerCase())) {
//				plaka=i+1;
//				break;
//			}
//		}
//		System.out.println("Girmiş olduğunuz "+il+" ilinin plakası = "+(plaka));
		String name="Polat";
		String lastName="Alemdar";
		System.out.println(name.concat(" "+lastName));
		String message="    bu    gün    böyle işte     ";
		System.out.println(message.trim());
		System.out.println(name.startsWith("Po"));
//		for (int i = 0; i < iller.length; i++) {
//			if(iller[i].startsWith("An")) {
//				System.out.println("AN ile başlayanlar=> "+iller[i]);
//			}
//			if(iller[i].endsWith("n")) {
//				System.out.println("N ile bitenler=> "+iller[i]);
//			}
//		}
		
		String sehir="Adıyaman";
		String sehir2="adıyaman";
		if(sehir.contains(sehir2)) {
			System.out.println("Doğru");
		}
		
		String metin="Milli İstihbarat Teşkilatı (MİT) tarafından koordine edilen operasyon, "
				+ "İkinci Dünya Savaşı sonrası yapılan en büyük takas olarak tarihe geçti. "
				+ "Ankara'da gerçekleşen takas operasyonu kapsamında, ABD'den 2, Almanya, Polonya, Slovenya, "
				+ "Norveç ve Rusya'dan birer olmak üzere 7 uçak ile 26 kişi Türkiye'ye nakledildi. "
				+ "Operasyon kapsamında, 2'si çocuk 10 rehinenin Rusya'ya, 13 rehinenin Almanya'ya, 3 rehinenin "
				+ "de ABD'ye nakli sağlandı. "
				+ "İşte takas edilen önemli isimlerden bazıları...";
		metin=metin.toLowerCase();
		metin=metin.replace(' ', '-');
		metin=metin.replace('ş', 's').replace('ö', 'o').replace('ü', 'u')
				.replace('ı', 'i')
				.replace(".", "");
		metin=metin.replace("(", "").replace(")", "").replace(",", "")
				.replace("'", "");
		
		//metin=metin.substring(0, 99);
		System.out.println(metin);
		String[] kelime=metin.split("s");
		System.out.println(kelime.length);
//		for (int i = 0; i < kelime.length; i++) {
//			System.out.println(kelime[i]);
//		}
		//12345678912
		//12*******12
		String ilce="Kızılcahamam";
		String ilce2="KIZILÇAHAMAM";
		System.out.println(ilce.indexOf("ı"));
		System.out.println(ilce.lastIndexOf("ı"));
		System.out.println(ilce.equalsIgnoreCase(ilce2));
		
	}

}
