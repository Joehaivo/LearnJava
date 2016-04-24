package haivo.PokerGame;

import java.util.ArrayList;
import java.util.List;

/**
 * 玩家类
 * Created by haivo on 2016/4/18.
 */
public class Player {
    public int id;
    public String name;
    public List<Card> playerCard; //玩家手牌

    public Player(int id,String name) {
        this.id = id;
        this.name = name;
        this.playerCard = new ArrayList<>();
    }

    @Override
    public String toString() {
        return this.id + ":"+this.name;
    }
}
