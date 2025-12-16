

public class scenario6
{
    public static void main(String[] args) {

        String[] categories = {"Fiction", "Nepali"};

        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];

        titles[0][0] = "Asahamati - 5";
        prices[0][0] = 750.0;

        titles[1][0] = "Palpasa Cafe";
        prices[1][0] = 650.0;

        for (int i = 0; i < categories.length; i++) {
            System.out.println("Category: " + categories[i]);
            System.out.println("Title: " + titles[i][0]);
            System.out.printf("Price: %.2f\n", prices[i][0]);
            System.out.println();
        }
    }
}