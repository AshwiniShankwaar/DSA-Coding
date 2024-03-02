package extra;

import java.util.ArrayList;
import java.util.List;

public class CoinArrange {
    public static void main(String[] args) {
        List<Long> coinList = new ArrayList<Long>();
        coinList.add((long)2);
        coinList.add((long)5);
        coinList.add((long)8);
        coinList.add((long)3);
        arrangeCoins(coinList);
    }
    public static void arrangeCoins(List<Long> coins){

        for(Long l:coins){
            long step = 0;
            long last =0;
            while(last<l){
                step++;
                last+=1;
                l= l-last;
            }
            System.out.println(step);
        }
    }
}
