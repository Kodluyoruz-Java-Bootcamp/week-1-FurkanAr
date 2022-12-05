package org.stars;

public class Star {
    public static void main(String[] args) {
        drawLeft();
        drawRight();

    }
    private static void drawRight() {
        for(int k=0; k<5; k++){
            for (int m=k; m<5; m++){
                System.out.print(" ");
            }
            for (int n=0; n <=k; n++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    private static void drawLeft() {
        for(int i=1; i<=5; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
