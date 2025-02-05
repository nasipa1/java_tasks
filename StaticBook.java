public class StaticBook {
    String title;
    String author;
    int numberOfPages;
    static String owner;

    public StaticBook(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public StaticBook(){}

    public static void setOwner(String owner) {
        StaticBook.owner = owner;
    }

    public static String getOwner() {
        return owner;
    }

    public String toString() {
        return this.title + " " + this.author + " " + this.numberOfPages + " " + this.getOwner();
    }

    public static void resetOwner(){
        owner = "";
    }

    public static void main(String[] args) {
        StaticBook b1 = new StaticBook();
        StaticBook b2 = new StaticBook("Harry Potter", "J.K. Rowling", 700);
        System.out.println(b1);
        System.out.println(b2.toString());
        b1.setOwner("AIT");
        StaticBook.owner = "Salma";
        System.out.println(b1);
        System.out.println(b2.toString());
        StaticBook.resetOwner();
        System.out.println(b2);
//        статичный метод можно вызвать только через класс
    }
}



