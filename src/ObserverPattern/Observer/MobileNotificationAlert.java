package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileNotificationAlert implements NotificationAlertObserver {

    String mobileNo;
    StocksObservable stocksObservable;

    public MobileNotificationAlert(String mobileNo, StocksObservable stocksObservable) {
        this.mobileNo = mobileNo;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendMsg(mobileNo);
    }

    private void sendMsg(String mobileNo) {
        System.out.println("Msg Sent to "+mobileNo);
    }
    
}
