public class Fermat {
    public static boolean theory(int a, int b, int c, int n)
    {
        if(n >= 2)
        {
            if(Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)){
                System.out.println("Holy Smokes Fermat was wrong!");
                return true;
            }
            else {
                System.out.println("No, that doesnt Work");
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args){
        theory(5, 12, 13, 2);
    }
}
