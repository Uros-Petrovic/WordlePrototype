import java.util.Scanner;
class Main {
      public static void main(String[] args) {
    
            Board b = new Board();

            while (true) {

                System.out.print("Guess: ");
                String in = new Scanner(System.in).nextLine();

                if (in.length() > 6 || in.length() < 6) continue;
                
                if (in.equals(b.word)) {
                    System.out.println("You win!");
                    break;
                }

                b.match(in);
                
            }
          
      }
}