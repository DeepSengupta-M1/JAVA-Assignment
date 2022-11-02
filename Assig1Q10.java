public class Assig1Q10 {
    public static void main(String[] args){
        int num1 = 0, num2 = 1, total = num1+num2;
        System.out.println("Fibonacci series: " +num1+ "," +num2+ ",");
        for (int i=0; i<10; i++)
        {
           total = num1 + num2;
           num1 = num2;
           num2 = total;
           System.out.println(total + ",");
        }
    }
}
