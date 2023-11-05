public class firsttenprime {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;

        System.out.println("First 10 prime numbers:");

        while(count < 10) {
            boolean isPrime = true;

            for (int i = 2 ; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " ");
                count++;
            }
            num++;
        }
    }
}