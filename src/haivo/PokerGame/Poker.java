package haivo.PokerGame;

import java.util.ArrayList;
import java.util.List;

/**
 * 扑克类：采用List泛型分别定义花色和点数
 * Created by haivo on 2016/4/18.
 */
public class Poker {
    public List<String> color = new ArrayList<>(); //花色共4种
    public List<String> point = new ArrayList<>(); //点数3.4.5····2共13种
    public List<Card> pokerList = new ArrayList<>(); //扑克中的扑克牌共52张，没有王牌

    public Poker() {
        color.add("♤");
        color.add("♡");
        color.add("♣");
        color.add("◆");
        point.add("3");
        point.add("4");
        point.add("5");
        point.add("6");
        point.add("7");
        point.add("8");
        point.add("9");
        point.add("10");
        point.add("J");
        point.add("Q");
        point.add("K");
        point.add("A");
        point.add("2");

        for (int color = 0; color < 4; color++) {
            for (int point = 0; point < 13; point++) {
                Card mCard = new Card(this.color.get(color),this.point.get(point));
                pokerList.add(mCard);
            }
        }
    }

    /**
     *打印手牌
     */
    public void printPokerCard(){
        for (int i = 0; i < this.pokerList.size(); i++) {
            System.out.print(this.pokerList.get(i).toString()+" ");
        }
        System.out.println("");
    }
}
