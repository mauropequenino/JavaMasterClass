package inner_abstract_classes_interfaces.inner_class.lesson_2;

public class Main {
    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        Gearbox.Gear first = mcLaren.new Gear(1,12.3);
        System.out.println(first.driveSpeed(1000));
    }
}
