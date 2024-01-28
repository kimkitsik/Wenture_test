/*
Kim Kitsik
25.01.2024

Main class to test the work of the code.

 */
package observer;

public class Main {
    public static void main(String[] args) {
        Subject subject=new Subject();
        ConcreteObserver observer=new ConcreteObserver(subject);
        ConcreteObserver observer2=new ConcreteObserver(subject);

        subject.addObserver(observer);
        subject.addObserver(observer2);
        subject.setUpdate("update!!!");
        subject.removeObserver(observer);
        subject.setUpdate("new update!!!");
    }
}
