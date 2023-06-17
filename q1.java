
/**
 * Write a description of class q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q1
{
    public static void main(String[] args) {
        int num = 730;

        System.out.println(sumPower3(num, 0, 0));
    }

    public static boolean sumPower3(int num, int sum, int p){
        sum = sum + (int)Math.pow(3, p);
        if (sum > num) {
            return false;
        }

        if (sum == num) {
            return true;
        }

        boolean step1 = sumPower3(num, sum, p+1);
        boolean step2 = sumPower3(num, sum, p+2);
        boolean step3 = sumPower3(num, sum, p);
        
        return (step1 || step2|| step3);
    }
}
