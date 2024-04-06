package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class TraficSignal implements Observable {

    private List<Observer> observerList;
    private String signalColor;

    public String getSignalName() {
        return signalName;
    }

    public void setSignalName(String signalName) {
        this.signalName = signalName;
    }

    private  String signalName;





    public TraficSignal(String name) {
        observerList = new ArrayList<>();
        this.signalName = name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }


    public String getSignalColor() {
        return signalColor;
    }

    public void setSignalColor(String signalColor) {
        this.signalColor = signalColor;
        notifyObservers();
    }


}
