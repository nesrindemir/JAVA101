
public class HarmonikSeris {
    public static void main(String[] args) {

        int [] list={2,4,8,6,3,7};
        double result =0.0;
        double harmonik_result=0.0;
        for(int i =1 ;i<=list.length;i++){

            harmonik_result+=1.0/i;

        }
        result=list.length/harmonik_result;
        System.out.println(result);
    }
}
