package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    //ToDo
    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
        System.out.println("Constructor: "+this.title + " " + this.author + " " + this.page);
    }
}
