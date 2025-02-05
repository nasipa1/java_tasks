public class Book {
    private String title;
    private String[] author;
    private int numberOfPages;

    public Book(){


    }
    public Book(String title, String author, int numberOfPages) {
        this.title = title;
//        this.author = author;
        this.author = new String[2];
        this.author[0] = author;
        this.numberOfPages = numberOfPages;


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getAuthor() {
        return author[0];
    }

    public void setAuthor(String author1, String author2) {
        this.author[0] = author1;
        this.author[1] = author2;
    }

    public String[] setAuthor() {
        return this.author;
    }


    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int newNumberOfPages) {
        this.numberOfPages = newNumberOfPages;
    }

    public boolean equals(Book book) {
        return getAuthor()==book.getAuthor() &&
                getTitle()==(book.getTitle()) &&
                getNumberOfPages() == book.getNumberOfPages();
    }


}


class MainBook {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Harry Potter", "J.K. Rowling", 700);
        Book b3 = new Book("Harry Potter", "J.K. Rowling", 700);
//        System.out.println("Info about b1:"+b1.getTitle() + " "+b1.getAuthor());
//        System.out.println("Info about b2:"+b2.getTitle() + " "+b2.getAuthor());
//
        if (b2.equals(b3)) {
            System.out.println("The book is the same");
        } else {
            System.out.println("The book is not the same");
        }

        if (b2 == b3) {
            System.out.println("The book is the same");
        } else {
            System.out.println("The book is not the same");
        }

    }
}


class Calculator{
    public Calculator(){

    }
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void add(int c, double d){
        System.out.println(c+d);
    }
    public static void add(double e, double f){
        System.out.println(e+f);
    }
}

class DemoCalculator{
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(42,35);
        cal.add(21,2.3);
        cal.add(32.1, 32.4);
    }
}


