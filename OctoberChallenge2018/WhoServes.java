

import java.util.*;

class WhoServes{

    private static final Scanner scanner = new Scanner(System.in);
    
    static String nextServe(int p1, int p2, int k){
        int totalPoints = p1 + p2;
        //Its even then its CHEF
        if((totalPoints / k) % 2 == 0 ){
            return "CHEF";
        }else{
            return "COOK";
        } 
    }


    public static void main(String args[]){

        //Number of test cases
        int T = scanner.nextInt();
        String[] results = new String[T];
        for(int i =0; i<T; i++){
            int P1 = scanner.nextInt();
            int P2 = scanner.nextInt();
            int K = scanner.nextInt();
            results[i] = nextServe(P1, P2, K);
        }

        for(int i=0; i<T; i++){
            System.out.println(results[i]);
        }
    }
}