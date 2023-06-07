public class arrayDemo {
        public static void main(String[] args) {
                int[] a1;//declaration
                int[] a2 = {1, 2, 3, 4};//initialization
                int[] a3 = new int[2];//declaration wit fixed size
                int[] a4 = new int[]{1, 2, 3}; //declaration with fixed size otherwise known as array literals
                int[][] a5 = new int[2][3];// 2 d arrays dec
                int[][] a6 = {{1,2,3},{4,5,6},{7,8,9}};// 2d array

                 //how to print an array
                System.out.println(a4);
                for (int i =0; i < a4.length;  i++){
                        System.out.println(a4[i]);
                }
                //just like commands
                for (int j : a4){
                        System.out.println(j);
                }

                //for 2d array
                for (int i = 0 ; i <3 ; i++){
                        for( int j = 0 ; j <3 ; j++ ){
                                System.out.print(a6[i][j]);
                        }
                        System.out.println();
                }
                //for  each 2d array
                for(int[] j : a6){
                        for (int k : j){
                                System.out.print(k);
                        };
                        System.out.println();
                }//errors here
                //custom conditions cant be applied
                //for each doesn't use any logic to iterate so bugs are eliminated

        }
}

// Basic is complete

//address or hashvalue question for later
//assignments

// write a code to input 10 elements in an array and find the 2nd biggest number // assignment// multiple ways to complete // searching or sorting
// write programme to print star patterns-practice this will improve your 2d array understanding