public class prac23 {
    private double radius;
    public prac23(double radius) {
    this.radius = radius;
    }
    public prac23(int radius) {
    this.radius = (double) radius; 
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
       prac23 circle1 = new prac23(5.0); 
      prac23 circle2 = new prac23(3);   
       System.out.println("Area of circle1 with radius 5.0: " + circle1.calculateArea());
       System.out.println("Area of circle2 with radius 3: " + circle2.calculateArea());
    }
}
