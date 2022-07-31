package poo.challenge47;

public class Printer {
    private int tonerLevel;
    private int pagePrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        if(tonerLevel >-1 && tonerLevel <= 400){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.pagePrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerLevel > 0 && tonerLevel <= 400){
            if(this.tonerLevel + tonerAmount >= 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return  this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pageToPrint = pages;
        if(this.duplex){
            pageToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagePrinted += pageToPrint;
        return pageToPrint;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }
}
