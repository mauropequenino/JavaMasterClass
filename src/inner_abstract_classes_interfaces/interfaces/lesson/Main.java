package inner_abstract_classes_interfaces.interfaces.lesson;

public class Main {
    public static void main(String[] args) {
        ITelephone thisPhone = new DeskPhone(456545);
        thisPhone.callPhone(456545);
        thisPhone.dial(12345);

        MobilePhone mp = new MobilePhone(123456);
//        mp.powerOn();
        mp.dial(32123);
        mp.callPhone(12345);
    }
}
