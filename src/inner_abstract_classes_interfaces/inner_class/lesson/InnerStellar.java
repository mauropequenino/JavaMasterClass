package inner_abstract_classes_interfaces.inner_class.lesson;
class OutSide {
     int a = 0;

    class InnerSide {
        int b = 5;
    }

}


public class InnerStellar {
    public static void main(String[] args) {
        OutSide out = new OutSide();
        //Acessar uma class dentro de outro classe
        OutSide.InnerSide in = out. new InnerSide();
        System.out.println(out.a + " " + in.b);

    }
}
