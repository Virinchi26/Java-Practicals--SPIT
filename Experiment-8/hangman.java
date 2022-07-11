import java.util.Scanner;
interface randword{
    void InitDictionary();
    String ChooseRandomWord();
}
class working implements randword{
    static String[] words = new String[10];
    public void InitDictionary()
    {
        words[0] = "COMPUTER";
        words[1] = "JOEY";
        words[2] = "DEVELOPMENT";
        words[3] = "GOLDY";
        words[4] = "DOG";
        words[5] = "FLOWER";
        words[6] = "CHEMISTRY";
        words[7] = "VICTUS";
        words[8] = "LABORATORY";
        words[9] = "MORTAL";
    }
    public String ChooseRandomWord()
    {
        int randomNumber = (int)(Math.random()*9);
        return words[randomNumber];
    }
}
public class hangman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        working obj = new working();
        obj.InitDictionary();
        String hangmanWord = obj.ChooseRandomWord();
        int guesses = 8;
        System.out.println("Welcome to Hangman!");
        System.out.println("I will guess a secret word. On each turn, you guess a letter. If the letter is in the secret word, I will show you where it appears; if not, a part of your body gets strung up on the scaffold. The objective is to guess the random word before you are hung.");
        char answer[] = new char[hangmanWord.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i]='-';
        }
        for(;;)
        {
            int flag = 0;
            char guess;
            System.out.print("The word now looks like: ");
            for (int j = 0; j < answer.length; j++) {
                System.out.print(answer[j]);
            }
            System.out.println("\nYou have now "+guesses+" guesses left.");
            System.out.print("Guess letter:");
            guess = sc.next().charAt(0);

            for (int j = 0; j < hangmanWord.length(); j++) {
                if (hangmanWord.charAt(j)==guess) {
                    answer[j] = guess;
                    flag++;
                }
            }
            if (flag==0) {
                guesses--;
            }
            int flag1 = 0;
            for (int j = 0; j < answer.length; j++) {
                if(answer[j]==hangmanWord.charAt(j))
                {
                    flag1++;
                }
            }
            if (flag1==hangmanWord.length()) {
                System.out.println("That guess is correct.");
                System.out.println("You guessed the word: "+ hangmanWord);
                System.out.println("You win.");
                break;
            }
            if (guesses==0) {
                System.out.println("You died!");
                System.out.println("Word was "+hangmanWord);
                break;
            }
        }        
    }
}