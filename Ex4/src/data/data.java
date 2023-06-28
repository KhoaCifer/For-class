package data;

public class data {
    private String bookName;
    private String author;
    private int price;
    private int day;
    private int month;
    private int year;
    private int quantity;

    public data(String bookName, String author, int price, int day, int month, int year, int quantity) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.day = day;
        this.month = month;
        this.year = year;
        this.quantity = quantity;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "data{" + "bookName=" + bookName + ", author=" + author + ", price=" + price + ", day=" + day + ", month=" + month + ", year=" + year + ", quantity=" + quantity + '}';
    }

    public void showInformation() {
        System.out.println("Book name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Release date:");
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
        System.out.println("Quantity: " + quantity);
    }
}
