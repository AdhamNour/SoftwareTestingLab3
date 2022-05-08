public class Multiply extends  Add {
    public static  int Multiply (int x, int y){
        return R_Multiply(x,y);
    }
    private static int S_Multiply(int x, int y){
        //Left to the students to implement

        return -1;
    }
    private  static  int R_Multiply (int x,int y){
        int sum = 0;
        for (int i = 0; i <y ; i++) {
            sum = add(sum,x);
        }
        return sum;
    }
}
