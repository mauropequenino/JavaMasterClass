package poo.challenge47;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagePrinted());
        int pagesPrinted = printer.printPages(100);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = "
                + printer.getPagePrinted());
    }
}



