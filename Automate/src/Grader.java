import java.util.Scanner;

class Grade{
    float score;

    public Grade(float score) {
        if (!(score < 0 || score > 100))
            this.score = score;
        else {
            System.out.println("Score is not Valid. System Terminating.");
            System.exit(0);
        }
    }

    char letterGrade() {
        if (score <= 20)
            return 'F';
        else if (score > 20 && score <= 40)
            return 'C';
        else if (score > 40 && score <= 60)
            return 'B';
        else if (score > 60 && score <= 80)
            return 'A';
        else if (score > 80 && score <= 90)
            return 'E';
        else
            return 'O';

    }
}

public class Grader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Rajib Kuri, Roll No: 42");
        System.out.print("Enter The Score:\t");
        System.out.println("The Grade is:\t" + new Grade(scan.nextFloat()).letterGrade());
    }
}

