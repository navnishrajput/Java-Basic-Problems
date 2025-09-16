//public class Method {
////    public  int add(int a , int b){
////        return a+ b;
////    }
//    int a;
//    int b;
//    public  int addition(){
//        int c =a+b;
//        System.out.println(c);
//        return  c;
//    }
//
//
//
//    public static void main(String[] args) {
//
//        Method obj = new Method();
//        //obj.add(1,3);
//         obj.a = 2;
//         obj.b = 4;
//        obj.addition();
//       // System.out.println(obj.addition());
//
//    }
//}

class Fibo {
    public static void main(String[] args) {
        int n = 10; 
        int[] fibSeries = new int[n];

        fibSeries[0] = 0;
        if (n > 1) {
            fibSeries[1] = 1;
            for (int i = 2; i < n; i++) {
                fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
            }
        }

        System.out.println("Fibonacci Series (Array):");
        for (int num : fibSeries) {
            System.out.print(num + " ");
        }
    }
}