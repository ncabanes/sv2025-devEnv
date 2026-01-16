void main() {
    Scanner sc = new Scanner(System.in);
    int attempt;
    int numberOfAttempts = 0;

    Random generator = new Random();
    int randomNumber = generator.nextInt(50) + 1;

    do {
        numberOfAttempts ++;
        System.out.println("Attempt: " +  numberOfAttempts);
        System.out.print("Enter a number: ");
        attempt = sc.nextInt();

        if (attempt > randomNumber) {
            System.out.println("Too high");
        }
        if (attempt < randomNumber) {
            System.out.println("Too low");
        }

    } while ((attempt != randomNumber) && (numberOfAttempts < 5));

    if (attempt == randomNumber) {
        System.out.println("Congratulations");
    } else {
        System.out.println("Sorry, it was " + randomNumber);
    }

}
