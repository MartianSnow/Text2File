public class Main {
        public static void main(String[] args) {
            int number = 8;
            Factorial fc = new Factorial();
            int result = fc.factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        }
}