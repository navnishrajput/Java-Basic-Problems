public class Ques15 {
    public static void main(String[] args){
          for (int num = 2; num <= 50; num++) {
            boolean isPrime = true;

                for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}


