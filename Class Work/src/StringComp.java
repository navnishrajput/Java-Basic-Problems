public class StringComp {
    public static void main(String arg[]) {
        String s1 = "hello";
        String s2 = "Hello";
        String str = new String("Hello");
        String str5 = new String("Hello");
        StringBuffer st = new StringBuffer(str5);
        System.out.println(st);
        //st.lastIndexOf(st);
        st.append("   hi");
        System.out.println(st);




//
//        if (str == str5) {
//            System.out.println("yes equal");
//        } else {
//            System.out.println("not equal");
//        }
//
//        if (str.equals(str5)) {
//            System.out.println("equal");
//        } else {
//            System.out.println("not equal");
//        }
  }
}