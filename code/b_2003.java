import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        int[] point = new int[]{0,0};
        for(int i = 0 ; i< Integer.parseInt(lines[2]) ; i++){
            String order = sc.nextLine();
            switch (order){
                case "U" :
                    point[1] += 1;
                    break;
                case "D" :
                    point[1] -= 1;
                    break;
                case "L" :
                    point[0] -= 1;
                    break;
                case "R" :
                    point[0] += 1;
                    break;
                default:
                    break;
            }
            
        }
        if(point[0]>=0 && point[0] <= Integer.parseInt(lines[1])-1 && point[1] >= 0 && point[1] <= Integer.parseInt(lines[0])-1 ){
                System.out.println("valid");
            
            }else{
                System.out.println("invalid");
            }
    }
}