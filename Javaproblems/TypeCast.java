package Javaproblems;

public class TypeCast {

    public static void main(String[] args){

//        Helps in problems like:
//        shifting characters
//        string manipulation
//        Caesar cipher

        char ch = 'a';
        System.out.println(ch + 1); // 98
        System.out.println((char)(ch + 1)); // 'b'

//      TypeCasting to ASCII values!
        System.out.println((int) 'a'); // 97
        System.out.println((int) 'A'); // 65
        System.out.println((int) 'z'); // 122
        System.out.println((int) 'Z'); // 90
        System.out.println((int) '1'); // 49

//        '90' and '100' are NOT valid characters → ❌ Compile-time error
//        System.out.println((int) '90');
//        System.out.println((int) '100');
    }
}
