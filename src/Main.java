import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.random;

public class Main {
    public static void main (String[] args) {

        int arrZeroOne[] = new int[10];
        for (int i = 0; i < arrZeroOne.length; i++) {
            arrZeroOne[i] = (int) (Math.random() * 2);

        }
        System.out.println(Arrays.toString(arrZeroOne));

        for (int i = 0; i < arrZeroOne.length; i++) {
            if (arrZeroOne[i] == 1) {
                arrZeroOne[i] = 0;
            } else {
                arrZeroOne[i] = 1;
            }

        }
        System.out.println(Arrays.toString(arrZeroOne));

        int arrJumpThreeNum[] = new int[8];
        for (int i = 0; i < arrJumpThreeNum.length; i++) {
            arrJumpThreeNum[i] = i * 3;
        }
        System.out.println(Arrays.toString(arrJumpThreeNum));

        int[] arrMultiplyTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i <arrMultiplyTwo.length ; i++) {
            if (arrMultiplyTwo[i] < 6){
                arrMultiplyTwo[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arrMultiplyTwo));

        int arrDiagonal [] [] =  new int [5] [5];
        for (int i = 0; i <arrDiagonal.length ; i++) {
            for (int j = 0, j2 = arrDiagonal[i].length; j < arrDiagonal[i].length; j++, j2--) {
                if (i < j) {
                    arrDiagonal[i][j] = 0;
                } else if (i > j) {
                    arrDiagonal[i][j] = 0;
                } else if  (j == i || i == ( j2 - 1)) {
                    arrDiagonal[i][j] = 1;
                } else {
                    arrDiagonal[i][j] = 1 ;
                }
                System.out.print(arrDiagonal[i][j] + " ");
            }
            System.out.println();

            }
        int min,max;
        int arrMinMax [] = new int [15];
        for (int i = 0; i < arrMinMax.length ; i++) {
            arrMinMax[i] = (int) (Math.random() * 150);
        }
        System.out.println(Arrays.toString(arrMinMax));
        min = max = arrMinMax[0];
        for (int i = 0; i < arrMinMax.length ; i++) {
            if(arrMinMax[i] < min) min = arrMinMax[i];
            if(arrMinMax[i] > max) max = arrMinMax[i];
        }
        System.out.println("min and max: " + min + " " + max);
        }



    }




