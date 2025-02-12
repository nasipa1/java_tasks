public class Book {
    private String title;
    private String author;
    private int year;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;



    }
    public String getBookInfo() {
        return "Title: " + title + "\nAuthor: " + author + "\nYear: " + year;
    }

    public void printBookDetails(){
        System.out.println(getBookInfo());
    }
}
class PrintedBookClass extends Book {
    private int numOfPages;;
    private String publisher;
    private int price;

    public PrintedBookClass(String title, String author, int year, int numOfPages, String publisher) {
        super(title, author, year);
        this.numOfPages = numOfPages;
        this.publisher = publisher;
        price = numOfPages * 2;
    }

    public PrintedBookClass(String title, String author, int year, int numOfPages, String publisher, int price) {
        super(title, author, year);
        this.numOfPages = numOfPages;
        this.publisher = publisher;
        if (numOfPages > 300){
            this.price = 700;
        } else {
            this.price = 300;
        }
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getBookInfo() {
        return "Title:" + getTitle() + "\nAuthor:" + getAuthor() + "\nYear:" + getYear() + "\nNum of pages: " + numOfPages + "\nPublisher: " + publisher + "\nPrice: " + price;
    }
    public void printBookDetails(){
        System.out.println(getBookInfo());
    }

    public void bookType(){
        System.out.println("this is a printed book");
    }

    public void printBook(){
        System.out.println("printing a book.......");
    }
}

class EBook extends Book{
    private double fileSizeMB;
    private String fileFormat;
    private double price;
    public EBook(String title, String author, int year, double fileSizeMB, String fileFormat) {
        super(title, author, year);
        this.fileSizeMB = fileSizeMB;
        this.fileFormat = fileFormat;
        price = fileSizeMB + 500;
    }

    public EBook(String title, String author, int year, double fileSizeMB, String fileFormat, double price) {
        super(title, author, year);
        this.fileSizeMB = fileSizeMB;
        this.fileFormat = fileFormat;
        this.price = price;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public String getBookInfo() {
        return "Title:" + getTitle() + "\nAuthor:" + getAuthor() + "\nYear:" + getYear() + "\nFile size: " + fileSizeMB + "MB\nFile format: " + fileFormat + "\nPrice: " + price;
    }
    public void printBookDetails(){
        System.out.println(getBookInfo());
    }
    public void bookType(){
        System.out.println("this is an EBook");
    }


}

class BookClass{
    public static void main(String[] args) {
        System.out.println("Printed book info:\n");
        System.out.println("Printed Book 1:\n");
        PrintedBookClass b1 = new PrintedBookClass("1984", "George Orwell", 1949, 328,"Secker & Warburg");
        b1.printBook();
        b1.printBookDetails();
        b1.bookType();


        System.out.println("\nPrinted Book 2:\n");
        PrintedBookClass b2 = new PrintedBookClass("Things Fall Apart", "Chinua Achebe", 1958, 224, "Penguin Books", 0);
        b2.printBook();
        System.out.println(b2.getBookInfo());
        b2.bookType();

        System.out.println("\nEBook Details:\n");
        System.out.println("EBook 1:\n");
        EBook b3 = new EBook("The Trial", "Franz Kafka", 1925, 75, "PDF" );
        b3.printBookDetails();
        b3.bookType();

        System.out.println("\nEBook 2:\n");
        EBook b4 = new EBook("Notre Dame De Paris", "Victor Hugo", 1831, 100, "PDF", 700);
        System.out.println(b4.getBookInfo());
        b4.bookType();
    }
}
