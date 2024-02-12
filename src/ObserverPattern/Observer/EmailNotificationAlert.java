package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class EmailNotificationAlert implements NotificationAlertObserver {

    String emailId;
    StocksObservable stocksObservable;

    public EmailNotificationAlert(String emailId, StocksObservable stocksObservable) {
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendMail(emailId);
    }

    private void sendMail(String emailId) {
        System.out.println("Email Sent to "+emailId);
    }
    
}
