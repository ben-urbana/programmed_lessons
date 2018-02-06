import java.util.Scanner;

class PanagramDetector
{

  public static void main ( String[] args )
  {
    System.out.println("Enter a sentence you would like to check : ");
    Scanner scan = new Scanner(System.in);
    String string = scan.nextLine();
    String[] letters = string.split("");
    boolean pan;
    

    for (int index = 0; index < letters.length; index++) {
      char letter = letters.charAt(index);
      for(char ch = 'a'; ch < 'z'; ch++) {
        if (letter == ch) {
          pan = true;
        }
      }
    }
    pan = false;
   
    

  }
} 