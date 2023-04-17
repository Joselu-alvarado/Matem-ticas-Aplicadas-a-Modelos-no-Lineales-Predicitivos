public class Calculos {
    public float sumX(float x[]){
        float totalX = 0;

        for(int i = 0; i < x.length; i++)
            totalX = totalX + x[i];
        return totalX;
    }

    public float sumY(float y[]){
        float totalY = 0;
        for(int i = 0; i < y.length; i++)
            totalY = totalY + y[i];
        return totalY;
    }

    public float cuadraX(float x[]){
        float totalX = 0;
        for(int i = 0; i < x.length; i++)
            totalX = totalX + ((int)Math.pow(x[i],2));
        return totalX;
    }

    public float sumXY(float x[], float y[]){

        float totalXY = 0;
        for (int i = 0; i < x.length; i++)
            totalXY = totalXY + (x[i] * y[i]);

        return totalXY;

    }
    public float beta (float x[], float y[]){
        float bet,mult,div;
        mult=(9*sumXY(x,y))-(mult(x,y));
        div=9*cuadraX(x)-(sumX(x)*sumX(x));
        bet=mult/div;
        return bet;
    }
    public float beta0 (float x[], float y[]){
        float bet;
        bet=(sumY(y)-beta(x,y)*sumX(x))/9;
        return bet;
    }
    public float mult(float x[], float y[]){
        float mult;
        mult=sumX(x) * sumY(y);
        return mult;
    }
    public float xcuay(float x[],float y[ ]){
        float totalX = 0, totaly =0;
        for(int i = 0; i < x.length; i++){
            for ( i=0; i < y.length; i++)
                totalX = totalX + ((int)Math.pow(x[i],2)*(y[i]));
        }
        return totalX;
    }
    public float terciX(float x[]){
        float totalX = 0;
        for(int i = 0; i < x.length; i++)
            totalX = totalX + ((int)Math.pow(x[i],3));
        return totalX;
    }
    public float cuartX(float x[]){
        float totalX = 0;
        for(int i = 0; i < x.length; i++)
            totalX = totalX + ((int)Math.pow(x[i],4));
        return totalX;
    }
    public static double[][] gaussJordan(double[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {

            int max = i;
            for (int j = i+1; j < n; j++) {
                if (Math.abs(matrix[j][i]) > Math.abs(matrix[max][i])) {
                    max = j;
                }
            }
            double[] temp = matrix[i];
            matrix[i] = matrix[max];
            matrix[max] = temp;


            double pivot = matrix[i][i];
            for (int j = i; j < m; j++) {
                matrix[i][j] /= pivot;
            }


            for (int j = i+1; j < n; j++) {
                double factor = matrix[j][i];
                for (int k = i; k < m; k++) {
                    matrix[j][k] -= factor * matrix[i][k];
                }
            }
        }


        for (int i = n-1; i > 0; i--) {
            for (int j = i-1; j >= 0; j--) {
                double factor = matrix[j][i];
                for (int k = i; k < m; k++) {
                    matrix[j][k] -= factor * matrix[i][k];
                }
            }
        }

        return matrix;
    }

}
