
// bruutforce aproch 
public class bruutforce {
    public static void searchkey(int matrix[][],int key){
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("key is found " + "(" + i + "," + j + ")" );
                }
            }
        }
       
    }
    public static void main(String[] args) {
        int matrix[][]= { {10,20,30,40},
                           {15,25,35,45},
                           {27,29,37,48},
                           {32,33,39,50}
                        };
     int key = 33;
     searchkey(matrix,key);
    }
}
