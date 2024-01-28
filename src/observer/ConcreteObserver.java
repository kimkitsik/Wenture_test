/*
Kim Kitsik
25.01.2024

This class has a constructor to make the class usable for creating an observer. It also implements the
Observer interface and prints a message if one is received.

 */

package observer;

public class ConcreteObserver implements Observer{
    private Subject subject;

    public ConcreteObserver(Subject subject){
        this.subject=subject;
    }

    @Override
    public void update(String message) {
        System.out.println("Message: "+subject.getUpdate());
    }

}
