
public class Example {
	public static void main(String[] args) {
		//Bir tane String dizi tanımlayıp içerisine 10 tane isim ekleyip
		// ekranda ismin ilk iki harfi ve geri kalanları * olacak
		String[] names= {"Abdulmuttalip","Ece","Alaaddin","Ahmet","Elif","Şeyma",
			"Burak","Mesut","Musa","Talha"};
		String[] tcs= {"12345678912","22345678913","32345678914","42345678915","52345678916","18445678912","17345678012","10375678912","92345698912","39345678912"};
		String[][] yNames=new String[names.length][2];
		
	
		for (int i = 0; i < names.length; i++) {
			String tempName=names[i].substring(0,2);
			for (int j = 0; j < names[i].length()-2; j++) {
				tempName+="*";
			}			
			yNames[i][0]=tcs[i].substring(0,2)+"******"+tcs[i].substring(9,11);
			yNames[i][1]=tempName;
		}
		
		for (int i = 0; i < yNames.length; i++) {
			String read=(i)+". Kişi\t";
			for (int j = 0; j < yNames[i].length; j++) {
				if(j==0) {
					read+="TC Kimlik No:\t"+yNames[i][j]+"\t";
				}else {
					read+="İsim:\t"+yNames[i][j];
				}
			}
			System.out.println(read);
		}
		
		
	}

}
