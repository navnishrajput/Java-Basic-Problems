public class Const {


    String name;
    int sd;
//    Const(String name , int id){
//
//        this.name = name;
//        this.sd = id;
//
//    }
//    void Show(){
//        System.out.println("Name: "+name);
//        System.out.println("id :"+sd);
//    }

        Const(String name , int id){

        this.name = name;
        this.sd = id;

            System.out.println("Name: "+name);
       System.out.println("id :"+sd);

    }
    Const(Const ref){
            name = ref.name;
            sd= ref.sd;
        System.out.println("Name: "+name);
        System.out.println("id :"+sd);
    }


    public static void main(String[] args) {
        Const a1 = new Const("nav",0);
        //a1.Const("nav",9);
       // a1.Show();
    }
}
