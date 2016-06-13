package examples.from.daniel;

class NumberOfProcessors {
    public static void main(String[] args) {
	/* Prints 4 on computer with Intel® Core™ i5-2520M CPU @ 2.50GHz × 4. */
	System.out.printf("Number of processors on this system: %d.%n",
			  Runtime.getRuntime().availableProcessors());
    }
}
