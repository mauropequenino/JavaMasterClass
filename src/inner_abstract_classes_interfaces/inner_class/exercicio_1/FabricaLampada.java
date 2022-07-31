package inner_abstract_classes_interfaces.inner_class.exercicio_1;

public class FabricaLampada {

    public class Incadescente implements Lampada {
        public Incadescente() {
        }

        @Override
        public void turnOn() {
            System.out.println("Incadescente turning on");
        }

        @Override
        public Incadescente turnOff() {
            System.out.println("Incadescente turning off");
            return null;
        }
    }

    public class Florescente implements Lampada {
        @Override
        public void turnOn() {
            System.out.println("FLorescente turning on");
        }

        @Override
        public Incadescente turnOff() {
            System.out.println("Florescente turning off");
            return null;
        }
    }
}
