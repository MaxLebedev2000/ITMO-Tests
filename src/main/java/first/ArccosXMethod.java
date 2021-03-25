package first;

import static java.lang.Math.pow;

public class ArccosXMethod {


    public double arccosXCalculate(double x) {
        double arcsinX;
        double arccosX;
//        if ((x < -1) || (x > 1)) {
//            return -100;
//        }
////        else if ((x == 1) || (x == -1)) {
////            return 100;
////        }
//
//        else {
//            arcsinX = x + (1 / 2) * (pow(x, 3) / 3) + (3 / 8) * (pow(x, 5) / 5) + (15 / 48) * (pow(x, 7) / 7);
//            arccosX = (Math.PI) / 2 - arcsinX;
//            return arccosX;
//        }

        arcsinX = x + (1 / 2) * (pow(x, 3) / 3) + (3 / 8) * (pow(x, 5) / 5) + (15 / 48) * (pow(x, 7) / 7);
        arccosX = (Math.PI) / 2 - arcsinX;
        return arccosX;
    }

}
