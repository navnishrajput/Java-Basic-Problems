import java.util.Scanner;

public class Ques9 {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("check whether it is a vowel or consonant ");
        char ch = sc.next().charAt(0);
        char lowerCh = Character.toLowerCase(ch);
        switch (lowerCh){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(" "+lowerCh+ " is vowel");
                break;
            default:
                System.out.println(""+lowerCh+" is consonant");
        }
        




    }
}
