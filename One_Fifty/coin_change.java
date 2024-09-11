import java.util.Arrays;

public class coin_change {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        Arrays.sort(coins);
        int max = coins.length-1;
        int sum = 0;
        int count=0;
        while(sum !=amount  ) {
                sum += coins[max];
                if(sum>amount){
                    sum = sum-coins[max];
                    max--;
                    count++;
                }

        }
        System.out.println(count+1);
    }
}
