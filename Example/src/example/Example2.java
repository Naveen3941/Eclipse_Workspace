package example;

public class Example2 {
	
	public static void main(String[] args) {
        double a = 2, b = 4, c = 2;
        double root1, root2;
        double determinant = b * b - 4 * a * c;
        double gh=3234;
       // String h=String.parseString(gh);
        String num="3456";
        int length=num.length();
        System.out.println(num.length());
        System.out.println(determinant);
        // condition for real and different roots
        if(determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.format("1root1 = %.2f and root2 = %.2f", root1 , root2);
        }
        // Condition for real and equal roots
        else if(determinant == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.format("2root1 = root2 = %.2f;", root1);
        }
        // If roots are not real
        else {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
            System.out.format("3"
            		+ ""
            		+ "root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
        }
    }
}