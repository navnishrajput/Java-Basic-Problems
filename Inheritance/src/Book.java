public class Book {

    String title;
    int PublicationYear;
    Book(String title, int publicationYear){
        this.title = title;
        this.PublicationYear = publicationYear;
    }
    void displayInfo(){
        System.out.println("Title: "+title);
        System.out.println("Publication year: "+PublicationYear);
    }

}
class Author extends  Book{
    String Name;
    String bio;
    Author(String Name, String bio, String title, int PublicationYear){
        super(title, PublicationYear);
        this.Name = Name;
        this.bio = bio;
    }
    void Display(){
        System.out.println("Name : "+Name);
        System.out.println("Bio : "+bio);
       // System.out.println("Title : "+title);
        //System.out.println("Year : "+PublicationYear);
    }



}



class Run{
    public static void main(String[] args) {
        Author author = new Author("Nav","HEllo World", "KNow Me", 2025);
        author.Display();
        author.displayInfo();

    }


}
