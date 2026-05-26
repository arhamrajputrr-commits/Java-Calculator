public class index3{
    public static void main(String[] args) {
        
        //i try to make a pattern with nested loop like:

        // 12345
        // 1234
        // 123
        // 12
        // 1

        // LETS MAKE !

        int n = 5;

        // for (int i = n; i>=1; i--){
        //     for (int j=1; j <= n -i +1; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        for (int i = 0 ; i <= n; i++){
            for (int j = 0 ; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
    }
}
}