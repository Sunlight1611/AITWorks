package classwork29;
//Внешний класс
public class Transport {
    private String model;
    private String goal;
    private Engine engine;
    public void go(){
        System.out.println("Transport is going");
        this.engine.turnOn();
    }
    public void stop(){
        System.out.println("Transport stopped");
        this.engine.turnOff();
    }

    public void handleanimalOnWay(){
        System.out.println("Animal is on the way");
        this.engine.turnOff();

    }

    class Engine {
        private boolean isEnabled = false;
        private double volume;
        public void turnOn() {
            if (this.isEnabled) {
                this.isEnabled = true;
                System.out.println("The enegine is turned on");
            }
        }
        public void turnOff(){
            if (!this.isEnabled){
                this.isEnabled = true;
                System.out.println("The engine is turned on");
            }
        }
        public void criticalTurnOff(){
            System.out.println("Critical sitiation");
            this.isEnabled = false;
            Transport.this.stop();
        }
        private Engine(double volume) {
            this.volume = volume;

        }

        @Override
        public String toString() {
            return "Engine{" +
                    "isEnabled=" + isEnabled +
                    ", volume=" + volume +
                    '}';
        }
    }

    public Transport(String model, String goal) {
        this.model = model;
        this.goal = goal;
        this.engine = this.new Engine(4);
    }
        @Override
        public String toString () {
            return "Transport{" +
                    "model='" + model + '\'' +
                    ", goal='" + goal + '\'' +
                    ", engine=" + engine +
                    '}';
        }
    }

