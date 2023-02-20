import java.util.Random;

public class RandomPractice {


    public static void main(String[] args) {

    String [] niz = {"Pera", "Mika", "Zika", "Laza", "John"};

        for (int i = 0; i < niz.length; i++) {
            Random random = new Random();
            int rand = random.nextInt(niz.length);
            System.out.println(niz[rand]);
        }




    }







}
