package designPatterns.observer;

public class TrafficDemoMain {
    public static void main(String[] args) {

        TraficSignal mgroad = new TraficSignal("MG Road");
        TrafficController trafficController1 = new TrafficController(mgroad);

        TraficSignal akshayNagar = new TraficSignal("Akshay Nagar");
        TrafficController akshayNagartrafficController1 = new TrafficController(akshayNagar);

        mgroad.setSignalColor("RED");
        akshayNagar.setSignalColor("GREEN");




    }
}
