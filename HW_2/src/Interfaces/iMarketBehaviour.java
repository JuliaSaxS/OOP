/**
 * интерфейс магазина
 */
package Interfaces;

import java.util.List;
import Classes.Actor;

public interface iMarketBehaviour {
    /**
     * @param actor вошёл в магазин.
     */
    void acceptToMarket(iActorBehaviour actor);

    /**
     * @param actors покинул магазин.
     */
    void releaseFromMarket(List<Actor> actors);

    void update();
}