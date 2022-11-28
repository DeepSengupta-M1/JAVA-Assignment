import java.util.Random;
public class Assig4Q9
{
    public static void main(final String[] args) {
        final Random randint = new Random();
        final int a = randint.nextInt(12);
        switch (a) {
            case 0: {
                System.out.println("Randomly generated number is " + (a + 1) + "which corresponds to January.");
                break;
            }
            case 1: {
                System.out.println("Randomly generated number is " + (a + 1) + "which corresponds to February.");
                break;
            }
            case 2: {
                System.out.println("Randomly generated number is " + (a + 1) + " which corresponds to March.");
                break;
            }
            case 3: {
                System.out.println("Randomly generated number is " + (a + 1) + " which corresponds to April.");
                break;
            }
            case 4: {
                System.out.println("Randomly generated number is " + (a + 1) + " which corresponds to May.");
                break;
            }
            case 5: {
                System.out.println("Randomly generated number is " + (a + 1) + " which corresponds to June.");
                break;
            }
            case 6: {
                System.out.println("Randomly generated number is " + (a + 1) + " which corresponds to July.");
                break;
            }
            case 7: {
                System.out.println("Randomly generated number is " + (a + 1) + " which corresponds to August.");
                break;
            }
            case 8: {
                System.out.println("Randomly generated number is " + (a + 1) + " which corresponds to September.");
                break;
            }
            case 9: {
                System.out.println("Randomly generated number is " + (a + 1) + " which corresponds to October.");
                break;
            }
            case 10: {
                System.out.println("Randomly generated number is " + (a + 1) + " which corresponds to November.");
                break;
            }
            case 11: {
                System.out.println("Randomly generated number is " + (a + 1) + " which corresponds to December.");
                break;
            }
        }
    }
}