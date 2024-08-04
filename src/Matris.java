import java.util.Scanner;

public class Matris {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[][] senKardeslerApartmani=new String[2][4];
		
		System.out.println(senKardeslerApartmani.length);
		System.out.println(senKardeslerApartmani[0].length);
		for (int i = 0; i < senKardeslerApartmani.length; i++) {
			for (int j = 0; j < senKardeslerApartmani[i].length; j++) {
				
				System.out.println((i+1)+". Kat "+(j+1)+". Dairede oturan kişiyi yazınız");
				senKardeslerApartmani[i][j]=input.nextLine();
			}
		}
		
		for (int i = 0; i < senKardeslerApartmani.length; i++) {
			for (int j = 0; j < senKardeslerApartmani[i].length; j++) {
				
				System.out.println((i+1)+". Kat "+(j+1)
						+". Dairede oturan: "+senKardeslerApartmani[i][j]);
				
			}
		}
		
		

	}

}
