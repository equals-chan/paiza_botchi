import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        boolean num = false,word = false,len = false,thr = false;
        char[] password = line.toCharArray();
        for(int i = 0 ; i < password.length ; i++){
            if(Character.isLetter(password[i])) {
                password[i] = Character.toLowerCase(password[i]);
                word = true;
            }
            if(Character.isDigit(password[i])) num = true;
        } 
        if(password.length >= 6) len = true;
        for(int i = 0 ; i < password.length-2 ; i++){
            if(password[i] == password[i+1] && password[i] == password[i+2]) thr = true;
        }
        if(num == true && word == true && len == true && thr == false)  System.out.println("Valid");
        else{
            System.out.println("Invalid");
        }
    }
}