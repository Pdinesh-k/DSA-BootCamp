import java.util.ArrayList;
class Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        ArrayList<Integer> List = new ArrayList<>();
        for(int i = 0 ; i < accounts.length ; i++){
            int sum = 0;
            for(int j = 0 ; j < accounts[i].length ; j++){
                sum += accounts[i][j];
            }
            List.add(sum);
        }
        int max = List.get(0);
        for(int k = 0 ; k < List.size() ; k++){
            int current = List.get(k);
            if(current>max){
                max = current;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[][] accounts = {{1,2,3,4}};
        int Result = maximumWealth(accounts);
        System.out.println(Result);
    }
}
