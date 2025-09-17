public class Course {
    String courseName;
    int duration;
    int price;
    static  String Institutename = "CHitkara";


    Course(String courseName, int duration, int price){
this.courseName = courseName;
this.duration = duration;
this.price = price;

    }

   static void UpdateInstitute(String newName){
        Institutename = newName;
        System.out.println();
        System.out.println("institute name: "+Institutename);

    }

    void Display(){
        System.out.println("Details of course: ");
        System.out.println("Course name: "+courseName);
        System.out.println("Course duration: "+duration);
        System.out.println("Course price: "+price);
        System.out.println("institute name: "+Institutename);

    }

    public static void main(String[] args) {
        Course c = new Course("Java", 4,1400);
        c.Display();

        Course.UpdateInstitute("Chitkara University");
        c.Display();
    }
}
