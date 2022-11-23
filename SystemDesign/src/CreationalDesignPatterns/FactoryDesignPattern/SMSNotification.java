package CreationalDesignPatterns.FactoryDesignPattern;

public class SMSNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Sending SMS");
    }
}
