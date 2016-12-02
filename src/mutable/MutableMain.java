package mutable;

public class MutableMain {
	public static void main(String[] args) {
		MutablePikachu mp = new MutablePikachu("FCU");

		System.out.println(mp.getName());

		mp.setName("IECS");

		System.out.println(mp.getName());

	}

}
