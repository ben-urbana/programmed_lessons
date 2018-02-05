import java.util.Scanner;

class PanagramDetector
{

  public static void main ( String[] args )
  {
    System.out.println("Enter a sentence you would like to check : ");
    Scanner scan = new Scanner(System.in);
    String string = scan.nextLine();
    String[] letters = string.split("");
    

    for (int i = 0; i < letters.length; i++) {
      System.out.println(letters[i]);
    }
    
   
    

  }
} 