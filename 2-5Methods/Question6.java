import java.util.Scanner;

class Question6 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        int y = 0;
        System.out.println("How wide do you want your box?");
        x = input.nextInt();
        System.out.println("How high do you want your box?");
        y = input.nextInt();
        displayBox(x,y);
    }
    
    public static void displayBox(int width, int height){
        int i = 0;
        while (i < height) {
            int k = 0;
            while (k < width) {
             System.out.print("$");
             k++;
            }
            System.out.println("");
            i++;
        }
    }
}