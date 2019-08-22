package FloatsLoopsArrays;

public class Ex5 {
    public static void main(String[] args) {
        int size = 11;
        //trikampis
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //trikampis 2
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == (size - 1) || (j == 0 || j == i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Rectangle with diagonals");

        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                if (i==0 || (i==(size -1))){
                    System.out.print("*");
                }
                else if (j==0 || (j==(size-1)) || (i==j) || (j== (size-1-i))) {
                System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        drawPyramid(5, 13); //metodas braizo piramide
        drawPyramid(7, 13);
        drawPyramid(11, 13);
    }
    public static void  drawPyramid (int size, int width){
        for (int i=0; i<size; i++){
            if (i<(size/2)){
                continue;
            }
            //padding
            for (int k=0; k<(width-size)/2; k++){
                System.out.print(" ");
            }
            for (int j = 0; j<size; j++){
                if (i == (size-1)){
                    System.out.print("*");
                }
                else  if (i==j || (j==(size-1-i))){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
