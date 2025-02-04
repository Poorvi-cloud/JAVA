import java.util.Scanner;
class prac3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Value in Meters :");
    double meter=sc.nextDouble();
    double feet = meter * 3.28084;
    System.out.print(meter + " Meters = " + feet + " Feets");
  }
}