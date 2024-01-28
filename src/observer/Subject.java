/*
Kim Kitsik
25.01.2024

This class allows adding and removing observers, it also sends notifications to all observers.

 */

package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject{
    private List<Observer> observers = new ArrayList<>();   //list containing all observers
    private String message;

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void setUpdate(String message) {
        this.message = message;
        for (Observer observer : this.observers) {
            observer.update(this.message);
        }
    }
    public String getUpdate(){
        return message;
    }
}
