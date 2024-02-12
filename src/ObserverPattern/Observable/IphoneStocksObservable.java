package ObserverPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import ObserverPattern.Observer.NotificationAlertObserver;

public class IphoneStocksObservable implements StocksObservable {

    List<NotificationAlertObserver> notificationAlertObserver = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver observer) {
        notificationAlertObserver.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        notificationAlertObserver.remove(observer);
    }

    @Override
    public void notifySubs() {
        for(NotificationAlertObserver observer : notificationAlertObserver) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockUpdated) {
        if(stockCount == 0) {
            notifySubs();
        }
        stockCount +=newStockUpdated;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
    
}
