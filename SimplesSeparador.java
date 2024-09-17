package Primeiro;

import java.io.*; 
import java.util.*;

public class SimplesSeparador {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    // Write your code here.
    scan.close();

    StringTokenizer st = new StringTokenizer(s,"[ !,?._'@]+");//using pattern regular expressions
    System.out.println(st.countTokens());

    while (st.hasMoreTokens())
    {
        System.out.println(st.nextToken());
    }

}
}