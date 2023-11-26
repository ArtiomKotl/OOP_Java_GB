package principlesOOP2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour{
    List<Actor> queue = new ArrayList<> ();
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println (actor.getName () + " зашол в магазин");
        takeInQueue ( actor );

    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors){
            queue.remove ( actor );
            System.out.println (actor.getName () + " вышел из магазина");
        }
    }

    @Override
    public void update() {
        makeOrders ();
        takeOrders ();
        releaseFromQueue ();

    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println (actor.getName () + " встал в очередь.");
        queue.add ( actor );

    }

    @Override
    public void makeOrders() {
        for (Actor actor : queue){
            if (!actor.isMakeOrder ()){
                actor.setMakeOrder ( true );
                System.out.println (actor.getName () + " сделал заказ");
            }
        }

    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue){
            if (actor.isMakeOrder ()){
                actor.setTakeOrder ( true );
                System.out.println (actor.getName () + " получил заказ");
            }
        }

    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasesActor = new ArrayList<> ();
        for (Actor actor : queue){
            if (actor.isTakeOrder){
                releasesActor.add ( actor );
                System.out.println (actor.getName () + " вышел из очереди");
            }
        }
        releaseFromMarket ( releasesActor );

    }
}
