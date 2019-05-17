import java.util.Scanner;

public class tools{
    /**Change a to 5
     * but this method don't wor
     * *@param a
     */
    public static void modify(int a){
        a = 5;
    }
    public static int change(int a){//return a new value
        return a - 5;
    }






    //method 1 lines
    public static void printLine(int num, String str){
        for (int i =0; i < num; i++){
            System.out.print(str);
        }
        System.out.println();
    }
    //method 2 square
    public static void  printSquare(int num, String str){
        for(int i = 0;i <=num; i++){
           printLine(num,str);
        }
    }
    //method 3
    public static void printRectangle(int num, int width, String str){
        for(int i = 0; i < width; i++){
            printLine(num, str);
        }
    }

    


    //get an integer from user input
public static int getInt(String str){
    System.out.println(str);
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    return num;
}


public static int add(int a, int b){
        return a - b;
        
    }
}

public String numTran(int n){
    String tmp = "";
    for (int i = 0; i < n; i++){
        tmp
    }
}