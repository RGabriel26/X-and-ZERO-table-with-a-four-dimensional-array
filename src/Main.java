public class Main {

    static int switchNumber(int temp10Number) {
        if (temp10Number <= 9) {
            switch (temp10Number) {
                case 1:
                    temp10Number = 10;
                    break;
                case 2:
                    temp10Number = 20;
                    break;
                case 3:
                    temp10Number = 30;
                    break;
                case 4:
                    temp10Number = 40;
                    break;
                case 5:
                    temp10Number = 50;
                    break;
                case 6:
                    temp10Number = 60;
                    break;
                case 7:
                    temp10Number = 70;
                    break;
                case 8:
                    temp10Number = 80;
                    break;
                case 9:
                    temp10Number = 90;
                    break;
            }
        }
        return temp10Number;
    }

    public static void main(String[] args) {

//        System.out.println("ONE DIMENSION ARRAYS");
//        //1D Array
//        //declaration of 5 elements arrays
//
//        int[] oneDimArray = new int[5];
//        for (int i = 0; i < 5; i++)
//            oneDimArray[i] = i + 1;
//        for (int e : oneDimArray) {
//            System.out.print(" " + e);
//        }
//
//        System.out.println("\nTOW DIMENSION ARRAYS");
//        //2D Array into array
//        int dimL = 3;
//        int dimC = 3;
//        int number = 0;
//        int[][] towDimArray = new int[dimL][dimC];
//        for (int i = 0; i < dimL; i++) {
//            for (int j = 0; j < dimC; j++) {
//                towDimArray[i][j] = number;
//                number++;
//            }
//        }
//
//        for (int i = 0; i < dimL; i++) {
//            for (int j = 0; j < dimC; j++) {
//                System.out.print(towDimArray[i][j] + "  ");
//            }
//            System.out.println();
//        }
//
        System.out.println("\nFOUR DIMENSION ARRAYS");
        System.out.println("First method:");

        //4D Array
        //one array of array
        //On this case I will make one array of
        //3x3 elements into array of 3x3 elements

        int number = 1;
        int temp10Number;

        //for number:
//        int[][][][] fourDimArray = new int[3][3][3][3];

        //for star:
        char[][][][] fourDimArray = new char[3][3][3][3];

        //first create arrays and fill them with *
        for (int i1 = 0; i1 < 3; i1++) {
            for (int i2 = 0; i2 < 3; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    for (int i4 = 0; i4 < 3; i4++) {

                        //for star:
                        fourDimArray[i1][i2][i3][i4] = '*';

                        //for number:
                        //changing values from 1 in 10 to 9 in 90
                        //to better highlight positions in the console
/****************************************************************************/

//                        if(number < 10) {
//                            temp10Number = number;
//                            fourDimArray[i1][i2][i3][i4] = switchNumber(temp10Number);
//                        }else fourDimArray[i1][i2][i3][i4] = number;
//                        number++;

/*************************************************************************/
                    }
                }
            }
        }

        //this is an example whit control of position in a four dimension array:
        fourDimArray[1][1][1][1] = ' ';
        //show the four dimension array and spacing it
        int pas = 0; // use for columns spacing
        for (int i1 = 0; i1 < 3; i1++) {
            for (int i2 = 0; i2 < 3; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    for (int i4 = 0; i4 < 3; i4++) {
                        //this is an example whit control of position in a four dimension array
                        System.out.print(fourDimArray[i1][i2][i3][i4] + "  ");
                        pas++;
                    }
                    if (pas == 3) {
                        System.out.print(" ");
                        pas = 0;
                    }
                }

                //for lines spacing
                System.out.println();
            }
            //for rows spacing
            System.out.println();
        }

        /******LINEAR METHOD TO CREATE A TABLE FOR X&O ******/

        System.out.println("\nLinear method:");
        char[] elem = new char[81];
        int line1 = 1;
        int line2 = 1;
        int columns = 1;
        //assignment of star to array
        for (int i = 0; i < 81; i++) elem[i] = '*';
        //position 40 well have 'space'
        elem[40] = ' ';
        //display my array
        for (int i = 0; i < 81; i++) {
            System.out.print(elem[i] + "  ");
            if (line1 == 3) {
                System.out.print(" ");
                line1 = 0;
            }
            if (line2 == 9) {
                System.out.println();
                line2 = 0;
            }
            if (columns == 27) {
                System.out.println();
                columns = 0;
            }
            line1++;
            line2++;
            columns++;
        }
    }

}