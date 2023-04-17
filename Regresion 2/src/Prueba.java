import java.util.Scanner;
public class Prueba {
    public static void main(String[] nousan) {
        double y;
        Scanner lec = new Scanner(System.in);
        DataSet dataSet = new DataSet();
        Calculos discreteMaths = new Calculos();

        SLR slr = new SLR(dataSet, discreteMaths);
        int x;
        System.out.println("introdusca un valor de x");
        x=lec.nextInt();
        slr.calculateIntersection();
        double[][] matrix = {{7,0,28,35}, {0,28,0,28}, {28,0,196,233}};
        matrix = Calculos.gaussJordan(matrix);
        for (int i = 0; i < matrix.length; i++) {
        }
        y=matrix[0][matrix.length]+(matrix[1][matrix.length]*x)+(matrix[2][matrix.length]*x*x);
        System.out.println("y = " + matrix[0][matrix.length] + " + " + matrix[1][matrix.length] + "x + " + matrix[2][matrix.length] + "x^2");
        System.out.println("y es igual a "+" "+ y);;
    }
}
