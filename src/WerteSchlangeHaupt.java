import java.util.Scanner;

public class WerteSchlangeHaupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wert temp;
		Scanner in = new Scanner(System.in);
		int aktion = 5;
		MeineSchlange schlange = new MeineSchlange();

		while (aktion != 0) {
			System.out.println("Aktion:  1 == Wert einlesen || 2 == Wert ausgeben || 0 == Beenden");
			aktion = in.nextInt();

			switch (aktion) {
			case 1:
				System.out.print("Wert eingeben: ");
				temp = new Wert();
				temp.d = in.nextDouble();
				schlange.rein(temp);
				temp = null;
				System.out.println(" ");
				break;
			case 2:
				System.out.print("Folgender Wert wird weggenommen: ");
			}
		}
	}

}
