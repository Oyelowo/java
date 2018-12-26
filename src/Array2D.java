
public class Array2D {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        int b[] = { 2, 4, 6, 8 };
        int c[] = { 5, 6, 7, 8 };

        // *jagged array: unequal columns
        int d[][] = { 
                        { 1, 2, 3, 4, 78 }, 
                        { 2, 4, 6, 8 }, 
                        { 5, 6, 7, 8 ,34} };

        
            for (int eachRow[] : d ){
                for (int eachCol : eachRow) {
                    System.out.print(eachCol + " ");
                }
    
                System.out.println();
            }


   /*          //Alternative
            for (int i = 0; i < d.length; i++) {
                int row[] = d[i];
                for (int eachCol : row) {
                    System.out.print(eachCol + " ");
                }
    
                System.out.println();
                
            } */
    }

}