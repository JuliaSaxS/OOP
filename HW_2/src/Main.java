import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromoClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviour;

public class Main {
    public static void main(String[] args) throws Exception {
        Market market = new Market();
        iActorBehaviour client1 = new OrdinaryClient("Olga");
        iActorBehaviour client2 = new OrdinaryClient("Igor");
        iActorBehaviour client3 = new SpecialClient("Mr.White"+" VIP", 1);
        iActorBehaviour client4 = new PromoClient("John"+" участвующий в акции", 12);

        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(new TaxService());
        market.acceptToMarket(client4);

        market.update();
    }
}
