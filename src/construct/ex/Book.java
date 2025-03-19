package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    //ToDo
    Book(){
        this("","",0);
    }
    Book(String title, String author){
        this(title,author,0);
    }
    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
        System.out.println("Constructor: "+this.title + " " + this.author + " " + this.page);
    }

    void displayInfo(){
//        System.out.println("Title: "+this.title + " Author: "+this.author + " Page: "+this.page);
    }
}
