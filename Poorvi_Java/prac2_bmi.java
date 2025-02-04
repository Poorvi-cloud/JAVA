import java.util.Scanner;
public class prac2_bmi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight in pound:");
        double w=sc.nextDouble();
        System.out.println("Enter the height in inches:");
        double h=sc.nextDouble();
        sc.close();
        double kg=(w*.45359237);
        double m=(h*.0245);
        double bmi=(kg/(m*m));
        System.out.println("BMI="+bmi);

    }
}
