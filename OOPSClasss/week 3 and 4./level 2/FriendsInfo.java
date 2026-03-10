import java.util.Scanner;

class FriendsInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amar age: ");
        int amarAge = input.nextInt();

        System.out.print("Enter Akbar age: ");
        int akbarAge = input.nextInt();

        System.out.print("Enter Anthony age: ");
        int anthonyAge = input.nextInt();

        System.out.print("Enter Amar height: ");
        int amarHeight = input.nextInt();

        System.out.print("Enter Akbar height: ");
        int akbarHeight = input.nextInt();

        System.out.print("Enter Anthony height: ");
        int anthonyHeight = input.nextInt();

        // Youngest
        if(amarAge < akbarAge && amarAge < anthonyAge)
            System.out.println("Youngest: Amar");
        else if(akbarAge < anthonyAge)
            System.out.println("Youngest: Akbar");
        else
            System.out.println("Youngest: Anthony");

        // Tallest
        if(amarHeight > akbarHeight && amarHeight > anthonyHeight)
            System.out.println("Tallest: Amar");
        else if(akbarHeight > anthonyHeight)
            System.out.println("Tallest: Akbar");
        else
            System.out.println("Tallest: Anthony");

        input.close();
    }
}