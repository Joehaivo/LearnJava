package haivo.PokerGame;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Game类：两人抽牌选择手中的较大牌比大小
 * Created by haivo on 2016/4/18.
 */
public class Game {
    Poker mPoker = new Poker();
    Poker dealedPoker = new Poker();
    Scanner scanner = new Scanner(System.in);
    int surplusCards = 51;  //剩余牌数
    int dealCardCount; //将要抽取的手牌数量
    Player player1, player2;


    public static void main(String[] args) {
        Game g = new Game();
        System.out.println("创建了一副扑克牌: ");
        g.mPoker.printPokerCard();
        g.creatPlayer();
        System.out.println("请输入玩家要抽取多少张牌：(不超过25张)");
        g.dealCardCount = g.scanner.nextInt();
        g.pullAndShuffleCard(); //抽牌和洗牌
        g.compareMaxCard(); //两玩家的最大牌做比较，决出胜负
    }

    /**
     * 创建玩家
     */
    public void creatPlayer() {
        System.out.print("请输入第一名玩家ID： ");
        int inputId = scanner.nextInt();
        System.out.print("请输入第一名玩家昵称： ");
        String inputName = scanner.next();
        player1 = new Player(inputId, inputName);
        System.out.print("请输入第二名玩家ID： ");
        inputId = scanner.nextInt();
        System.out.print("请输入第二名玩家昵称： ");
        inputName = scanner.next();
        player2 = new Player(inputId, inputName);
    }

    /**
     * 抽取手牌和洗牌，采用comparator规则排序
     */
    public void pullAndShuffleCard(){
        player1.playerCard.addAll(dealCard(dealCardCount));
        System.out.println("玩家一抽取手牌是：");
        for (Card c: player1.playerCard) {
            System.out.print(c.toString()+" ");
        }
        Collections.sort(player1.playerCard,Card.comparator);
        System.out.println("\n玩家一洗牌后的手牌是：");
        for (Card c: player1.playerCard) {
            System.out.print(c.toString()+" ");
        }
        player2.playerCard.addAll(dealCard(dealCardCount));
        System.out.println("\n玩家二抽取的手牌是：");
        for (Card c: player2.playerCard) {
            System.out.print(c.toString()+" ");
        }
        Collections.sort(player2.playerCard,Card.comparator);
        System.out.println("\n玩家二洗牌后的手牌是：");
        for (Card c: player2.playerCard) {
            System.out.print(c.toString()+" ");
        }
    }

    /**
     * 玩家连续随机抽取多张手牌
     * @param dealCount 将要抽取的手牌数量
     * @return 玩家随机抽取后的手牌
     */
    public List<Card> dealCard(int dealCount){
        Random random = new Random();
        List<Card> playCard = new ArrayList<>();
        do {
            Card card = dealedPoker.pokerList.get(random.nextInt(surplusCards--));
            playCard.add(card);
            dealCount--;
            dealedPoker.pokerList.remove(card);
        }while(dealCount>0);
        return playCard;
    }
    /**
     * 两玩家的最大牌做比较，决出胜负,采用comparator规则排序
     */
    public void compareMaxCard(){
        List<Card> biggerPlayerCard = new ArrayList<>(2);
        biggerPlayerCard.add(player1.playerCard.get(player1.playerCard.size()-1));
        biggerPlayerCard.add(player2.playerCard.get(player2.playerCard.size()-1));
        Collections.sort(biggerPlayerCard,Card.comparator);
        if(player1.playerCard.contains(biggerPlayerCard)){
            System.out.println("\n  所以，ID："+player1.toString()+"获胜。");
        }else{
            System.out.println("\n  所以，ID："+player2.toString()+"获胜。");
        }
    }
}
