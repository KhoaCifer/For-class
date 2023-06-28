package ex4;

import data.data;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        data bookLib[];
        bookLib = inputBookInformation();
        System.out.println("Before sorted:");
        outputBookInformation(bookLib);
        //inputBookInformationV2();
        sortBookInformation(bookLib);
        System.out.println("After sorted");
        outputBookInformation(bookLib);
    }

    public static data[] inputBookInformation() {
        data arr[];
        String bookName, author;
        int price, day, month, year, quantity;
        //Input different type of books
        int totalBooks;
        System.out.print("Input different type of books: ");
        Scanner sc = new Scanner(System.in);
        totalBooks = Integer.parseInt(sc.nextLine());
        arr = new data[totalBooks];
        for (int i = 0; i < totalBooks; i++) {
            System.out.println("Input book #" + (i + 1));
            
            System.out.print("Input Book name: ");
            bookName = sc.nextLine();
            
            System.out.print("Input author: ");
            author = sc.nextLine();
            
            System.out.print("Input price: ");
            price = Integer.parseInt(sc.nextLine());
            
            System.out.println("Input release date:");
            System.out.print("Day: ");
            day = Integer.parseInt(sc.nextLine());
            System.out.print("Month: ");
            month = Integer.parseInt(sc.nextLine());
            System.out.print("Year: ");
            year = Integer.parseInt(sc.nextLine());
            
            System.out.print("Input quantity: ");
            quantity = Integer.parseInt(sc.nextLine());
            arr[i] = new data(bookName, author, price, day, month, year, quantity);
        }
        return arr;       
    }

    public static void inputBookInformationV2() {
        data arr[];
        String bookName, author;
        int price, day, month, year, quantity, count = 0;
        //Input different type of books
        int totalBooks;
        System.out.print("Input total books: ");
        Scanner sc = new Scanner(System.in);
        totalBooks = Integer.parseInt(sc.nextLine());
        arr = new data[totalBooks];
        while(totalBooks > 0){
            System.out.println("Input book #" + (count + 1));
            System.out.print("Input Book name: ");
            bookName = sc.nextLine();
            System.out.print("Input author: ");
            author = sc.nextLine();
            System.out.print("Input price: ");
            price = Integer.parseInt(sc.nextLine());
            System.out.println("Input release date:");
            System.out.print("Day: ");
            day = Integer.parseInt(sc.nextLine());
            System.out.print("Month: ");
            month = Integer.parseInt(sc.nextLine());
            System.out.print("Year: ");
            year = Integer.parseInt(sc.nextLine());
            System.out.print("Input quantity: ");
            quantity = Integer.parseInt(sc.nextLine());
            arr[count] = new data(bookName, author, price, day, month, year, quantity);
            count++;
            totalBooks = totalBooks - quantity;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i].showInformation();
        }
    }
    
    public static data[] sortBookInformation(data arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getPrice() > arr[j].getPrice()) {
                    data temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void outputBookInformation(data arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].showInformation();
        }
    }
}
