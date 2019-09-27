import java.util.Scanner;

public class interset {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        money = input.nextDouble();
        System.out.print("Enter number of month: ");
        month = input.nextInt();
        System.out.print("Enter number of interset rate: ");
        interset_rate = input.nextDouble();

        double total_interset = 0;
        for (int i = 0; i < month; i++){
            total_interset = money * (interset_rate/100)/12 * month;
        }
        System.out.print("Total interset : " + total_interset);
    }
}
