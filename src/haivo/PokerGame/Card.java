package haivo.PokerGame;

import java.util.Comparator;

/**
 * Card类，定义扑克牌，以及扑克牌的比大小规则
 * Created by haivo on 2016/4/18.
 */
public class Card {
    public String color; //花色
    public String point; //点数
    public Card(String color,String point){
        this.color = color;
        this.point = point;
    }

    /**
     * 单张扑克的点数及花色
     */
    @Override
    public String toString() {
        return color+point;
    }

    /**
     * 扑克牌比较规则，采用Comparator实现，用于洗牌后的排序
     */
    public static Comparator<Card> comparator = new Comparator<Card>() {
        @Override
        public int compare(Card o1, Card o2) {
            Poker comparePokerTemp = new Poker();
            if(o1==null || o2==null)
                return 0;
            int bigger = comparePokerTemp.point.indexOf(o1.point) - comparePokerTemp.point.indexOf(o2.point);
            if(bigger==0){
                bigger = comparePokerTemp.color.indexOf(o1.color) - comparePokerTemp.color.indexOf(o2.color);
            }
            return bigger;
        }
    };
}
