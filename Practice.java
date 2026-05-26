import java.util.*;

public class Practice{
    public static void func(Double average){
        System.out.println("Average is = " + average);
        return;
}
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 int b = sc.nextInt();
 int c = sc.nextInt();
 
 double average = (a + b + c) / 3.0;

    func(average);
}
}


// import java.util.*;

// public class Practice {
//     public static void PrintMyName(String name){
//         System.out.println(name);
//         return;
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         PrintMyName(name);
    
//     }
// }