package Module3;

public class Divisible {

	public static void main(String[] args) {
		System.out.println("Numbers Divisible by 3, 5, and 15: ");
		for (int i=1; i<=100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\nNumbers Divisible by 3: ");
		for (int i=1; i<=100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\nNumbers Divisible by 5: ");
		for (int i=1; i<=100; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}