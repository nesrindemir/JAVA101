public class BwithStars {
    public static void main(String[] args) {
        String [][] letters=new String[8][4];

        for(int i=0; i< letters.length; i++){
            for(int j=0; j<letters[i].length ; j++){
              if(i==0 ||i==3 || i==7){
              letters[i][j]=" * ";
              }  else if (j==0 || j==3) {
                  letters[i][j]=" * ";
              } else{
                  letters[i][j]="   ";
              }
            }
        }
    for(String[] row :letters){
        for(String col :row){
            System.out.print(col);
        }
        System.out.println();
      }
    }
}
