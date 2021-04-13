package questions;

public class summationQuestion {
    public static int summationArithmeticSequenceFunction (int a_1, int d, int a_nLessThan) {
        /*find the last term*/
        int n = (((a_nLessThan-2)/3)+1);
        int a_n = a_1 + d*(n-1);

        /*calculate the summation*/
        return  (n*(a_1+a_n))/2;
    }
}