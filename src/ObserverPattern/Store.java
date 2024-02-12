package ObserverPattern;

import ObserverPattern.Observable.IphoneStocksObservable;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailNotificationAlert;
import ObserverPattern.Observer.MobileNotificationAlert;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iPhonObservable = new IphoneStocksObservable();

        NotificationAlertObserver notificationAlertObserver1 = new EmailNotificationAlert("test", iPhonObservable);
        NotificationAlertObserver notificationAlertObserver2 = new EmailNotificationAlert("test1", iPhonObservable);
        NotificationAlertObserver notificationAlertObserver3 = new MobileNotificationAlert("test2", iPhonObservable);


        iPhonObservable.add(notificationAlertObserver1);
        iPhonObservable.add(notificationAlertObserver2);
        iPhonObservable.add(notificationAlertObserver3);

        iPhonObservable.setStockCount(10);
    }
}
