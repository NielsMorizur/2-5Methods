import java.util.Scanner;

class Question7 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n =  0;
        int sides = 0;
        
        int a = 0;
        while (a != -1){
        int roll = 0;
        System.out.println("How many D6's do you want to roll?");
            n = input.nextInt();
        System.out.println("How many sides do these dice have?");
            sides = input.nextInt();
        
        System.out.print("You rolled:");
        int i = 0;
        int t = 0;
        while (i < n) {
            roll = rollDie(sides);
            System.out.print(" " +roll+ " ");
            t = t + roll;
            i++;
        }
        System.out.println("");
        System.out.println("Total: " + t);
        System.out.println("Again? [yes/no]");
        String ans = input.next();
        if (ans.equals("yes")) {
            a++;
        }else {
            a = -1;
        }
    }
    System.out.println("Good-bye!");
    }
    
    public static int rollDie (int sides) {
        return (int) (Math.random()*sides) + 1;
    }
}