package designPatterns.observer;

public class TrafficController implements Observer {

    Observable observable;

    TrafficController(Observable observable) {
        this.observable = observable;
        observable.registerObserver(this);
    }


    @Override
    public void update(Observable observable) {
        if (observable instanceof TraficSignal) {
            TraficSignal signal = (TraficSignal) observable;
            System.out.println( signal.getSignalName() + " Signal Color is:" + signal.getSignalColor());

        }
    }


}
