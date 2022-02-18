package config;

public class Refactorizar {


	private static final int ITERATION_LARGE = 20;
	private static final int ITERATION_SORT = 10;

	public static void main(String[] args) {
		
		int length = args.length;
		paintPoints(length);

		paintPoints(ITERATION_SORT);

		paintPoints(ITERATION_LARGE);

		paintPoints(ITERATION_LARGE);


	}

	private static void paintPoints(int iterations) {
		for (int i = 0; i < iterations; i++) {
		    System.out.print(".");
		}
		System.out.println();
	}

}

/**
public static void main(String[] args) {
	
	for (int i = 0; i < args.length; i++) {
	    System.out.print(".");
	}
	System.out.println();

	for (int i = 0; i < 10; i++) {
	    System.out.print(".");
	}
	System.out.println();

	for (int i = 0; i < 20; i++) {
	    System.out.print(".");
	}
	System.out.println();

	for (int i = 0; i < 20; i++) {
	    System.out.print(".");
	}
	System.out.println();

}
*/

/**

private static final int ITERATION_LARGE = 20;
private static final int ITERATION_SORT = 10;

public static void main(String[] args) {
	
	int length = args.length;
	paintPoints(length);

	int iteracionCorta = ITERATION_SORT;
	paintPoints(iteracionCorta);

	int iteracionLarga = Refactorizar.ITERATION_LARGE;
	paintPoints(iteracionLarga);

	int iteracioLarga = Refactorizar.ITERATION_LARGE;
	paintPoints(iteracioLarga);

}

private static void paintPoints(int iterations) {
	for (int i = 0; i < iterations; i++) {
	    System.out.print(".");
	}
	System.out.println();
}
*/