import java.util.Scanner;

public class AmpsToWattsConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of amps: ");
        double amps = sc.nextDouble();

        System.out.println("Enter the voltage: ");
        double voltage = sc.nextDouble();

        double watts = amps * voltage;

        System.out.println("The power consumption in watts" +
                " is: " + watts);

    }

}
