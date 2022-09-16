import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        Shopee();
     

    }

    static void Shopee() {
        System.out.println("Welcome to Shopee");

        System.out.print("Enter your first item: ");
        String item1 = scan.nextLine();
        System.out.print("Enter Price: ");
        Double price1 = scan.nextDouble();

        scan.nextLine();

        System.out.print("Enter your second item: ");
        String item2 = scan.nextLine();
        System.out.print("Enter Price: ");
        Double price2 = scan.nextDouble();

        scan.nextLine();

        System.out.print("Enter your third item: ");
        String item3 = scan.nextLine();
        System.out.print("Enter Price: ");
        Double price3 = scan.nextDouble();
        
        scan.nextLine();

        System.out.print("Enter your fourth item: ");
        String item4 = scan.nextLine();
        System.out.print("Enter Price: ");
        Double price4 = scan.nextDouble();

        scan.nextLine();

        System.out.print("Enter your fifth item: ");
        String item5 = scan.nextLine();
        System.out.print("Enter Price: ");
        Double price5 = scan.nextDouble();

        scan.nextLine();

        Double totalPrice = (price1 + price2 + price3 + price4 + price5);

        System.out.println("Your Items are: " + item1 + " " + item2 + " " + item3 + " " + item4 + " " + item5);
        System.out.println("Your total price is: " + totalPrice);





    }
}
