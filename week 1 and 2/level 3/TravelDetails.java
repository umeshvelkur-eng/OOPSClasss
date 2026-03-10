import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter From City: ");
        String fromCity = sc.next();

        System.out.print("Enter Via City: ");
        String viaCity = sc.next();

        System.out.print("Enter To City: ");
        String toCity = sc.next();

        System.out.print("Enter Distance From City to Via City (km): ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter Distance Via City to Final City (km): ");
        double viaToFinalCity = sc.nextDouble();

        System.out.print("Enter Time From City to Via City (minutes): ");
        int timeFromToVia = sc.nextInt();

        System.out.print("Enter Time Via City to Final City (minutes): ");
        int timeViaToFinalCity = sc.nextInt();

        double totalDistance = fromToVia + viaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name +
                " from " + fromCity +
                " to " + toCity +
                " via " + viaCity +
                " is " + totalDistance +
                " km and the Total Time taken is " + totalTime + " minutes");
    }
}