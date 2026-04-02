package DSA.Arrays.Medium;

import java.util.Scanner;

public class RepeatedStringmatching {
    public static int matching (String a, String b){
        int count =0;
        StringBuilder sb = new StringBuilder();

        while (sb.length()< b.length()){
            sb.append(a);
            count++;
        }
        if (sb.indexOf(a)!= -1 ){
            return count;
        }
        sb.append(a);
        count++;
        if (sb.indexOf(a)!= -1){
            return count;
        }
        return -1;
    }

    static void main(String[] args) {
        System.out.println("Welcome to String Matching Program\n");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The First String: ");
        String b = x.next();
        System.out.print("Enter the Second String: ");
        String a = x.next();
        System.out.println("How Many Times String a Matching to the String b: "+matching(a,b));

    }
}
