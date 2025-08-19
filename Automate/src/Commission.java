import java.util.Scanner;

class Calculate{
    float sales;

    public Calculate(float sales) {
        if (sales < 0) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        this.sales = sales;
    }

    public float commission() {
        return (sales * 10) / 100;
    }
}

public class Commission {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Rajib Kuri, Roll No: 42");
        System.out.print("Enter The Sale:\t");
        System.out.println("The Commission is:\t" + new Calculate(scan.nextFloat()).commission());
    }
}


