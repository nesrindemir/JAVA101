import java.util.Arrays;
public class Dublicate {
    static boolean isCift( int [] arr,int value){
        for(int i :arr){
            if(value % 2 == 0){
                return  true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int [] list={2,2,5,6,8,8,4,56,4,9,9,8};
        int[] dublicate=new int[list.length];

        int startindex=0;
        for(int i=0;i< list.length; i++){
            for (int j=0; j< list.length; j++){
                if((i!=j) && (list[i]==list[j])) {//i!=j şartıyla  dizi içerindeki elemanları dolanrken kendisini pas geçip dizinin diğer elemanlarına bakacak
                    if (isCift(dublicate, list[i])) {
                        dublicate[startindex++] = list[i];
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(dublicate));

    }
}
