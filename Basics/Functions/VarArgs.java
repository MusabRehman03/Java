package Functions;

public class VarArgs {
    public static void main(String[] args) {
    int result = sum(1,2,3,4,5,6,7,8,9);
    }
    public static int sum(int ...a){
        int sum=0;
        for (int num : a) {
            sum += num;
        }
        return sum;
    }
    public static int multipleArgs(int b, int c, int ...a){
        int sum=0;
        sum+=b;
        sum+=c;
        for (int num : a) {
            sum += num;
        }
        return sum;
    }

}
