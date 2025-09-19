public class MatrixReverse {
    public static void main(String[] args) {

        int [][]arr = {{1,2,3},{4,5,6},{9,7,5}};
        int rows=3,columns=3;

        System.out.println("Original arrays"
        );
        System.out.println();
        //System.out.println(arr.length);
        System.out.println();
        for(int i = 0; i <arr.length ; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");

            }
        }
        System.out.println();
        System.out.println();

        for(int j=0;j<columns;j++){
            for(int i=0,k=rows-1;i<k;i++,k--){
                int temp=arr[i][j];
                arr[i][j]=arr[k][j];
                arr[k][j]=temp;

            }
        }
        System.out.println("Reverse array,");
        for(int i=0;i<rows;i++){
            System.out.println();
            for(int j=0;j<columns;j++)
                System.out.print(arr[i][j]+" ");
            }
        System.out.println();
        }






        }




