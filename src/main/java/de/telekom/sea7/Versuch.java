package de.telekom.sea7;

public class Versuch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bitte gib eine Zahl 1 ein");
		String zahl1 = System.console().readLine();
		int ver1 = Integer.parseInt(zahl1);

		System.out.println("Bitte gib eine Zahl 2 ein");
		String zahl2 = System.console().readLine();
		int ver2 = Integer.parseInt(zahl2);

		if (ver1 < ver2) {
			System.out.println("Die Zahl" + " " + ver1 + " " + "ist kleiner als die Zahl" + " " + ver2);
		} 
		//else {
		//}
		if (ver1 == ver2) {
			System.out.println("Die Zahl" + " " + ver1 + " " + "und" + " " + ver2 + " " + "sind gleich");
		} 
		//else {
		//}
		if (ver1 > ver2) {
			System.out.println("Die Zahl" + " " + ver1 + " " + "ist groesser als die Zahl" + " " + ver2);
		} 
		//else {
		//}

	}
}
