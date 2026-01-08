import java.util.Scanner;

public class NewsCategory {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the news text:");
        String news = sc.nextLine().toLowerCase();

        if (news.contains("government") || news.contains("election") || news.contains("minister")) {
            System.out.println("Category: Politics");

        } else if (news.contains("match") || news.contains("cricket") || news.contains("football")) {
            System.out.println("Category: Sports");

        } else if (news.contains("technology") || news.contains("computer") || news.contains("software")) {
            System.out.println("Category: Technology");

        } else if (news.contains("business") || news.contains("market") || news.contains("company")) {
            System.out.println("Category: Business");

        } else {
            System.out.println("Category: Unknown");
        }

        sc.close();
    }
}
