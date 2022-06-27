import java.util.*;

public class movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of movies: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] movie = new String[n];
        String[] type = new String[n];
        String[] hero = new String[n];
        String[] heroine = new String[n];
        int[] budget = new int[n];
        int[] copy = new int[n];
        int[] len = new int[n];
        int i = 0, j = 0;
        for (i = 0; i < n; i++) {
            System.out.print("Enter the name of the movie: ");
            movie[i] = sc.nextLine();
            System.out.print("Enter the type of the movie: ");
            type[i] = sc.nextLine();
            System.out.print("Enter the hero of the movie: ");
            hero[i] = sc.nextLine();
            System.out.print("Enter the heroine of the movie: ");
            heroine[i] = sc.nextLine();
            System.out.print("Enter the budget of the movie: ");
            budget[i] = sc.nextInt();
            sc.nextLine();
            copy[i] = budget[i];
            len[i] = movie[i].length();
            System.out.println(" ");
        }
        Arrays.sort(copy);
        Arrays.sort(len);
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (copy[i] == budget[j])
                    System.out.printf("Name: %s\nType: %s\nHero: %s\nHeroine: %s\nBudget: %d\n\n", movie[j], type[j],
                            hero[j], heroine[j], budget[j]);
            }
        }
        System.out.println("Movies which start with A or S:");
        for (i = 0; i < n; i++) {
            if (movie[i].startsWith("S") || movie[i].startsWith("A"))
                System.out.printf("Name: %s\nType: %s\nHero: %s\nHeroine: %s\nBudget: %d\n\n", movie[i], type[i],
                        hero[i], heroine[i], budget[i]);
        }
        System.out.println("Movie whose name is the longest:");
        for (i = 0; i < n; i++) {
            if (len[n - 1] == movie[i].length())
                System.out.printf("Name: %s\nType: %s\nHero: %s\nHeroine: %s\nBudget: %d\n\n", movie[i], type[i],
                        hero[i], heroine[i], budget[i]);
        }
    }
}