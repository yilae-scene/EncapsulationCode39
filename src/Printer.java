public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(){
        this.tonerLevel = 100;
        this.pagesPrinted = 0;
        this.duplex = true;
    }
    public Printer (int tonerLevel, boolean duplex){
        this.tonerLevel = (tonerLevel > 100 || tonerLevel < 0)? -1 : tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner (int tonerAmount){
        int toAddAmount = (tonerAmount < 1 || tonerAmount > 100) ? -1 : tonerAmount;

        if(toAddAmount == -1){
            return -1;
        } else {
            int totalAmount = tonerLevel += toAddAmount;
            return (totalAmount) > 100  ? -1 : totalAmount;
        }
    }

    public int printPages (int pages){
        int pagesDone  = (duplex) ? (pages / 2 + pages % 2 ): pages;
        pagesPrinted += pagesDone;
        return pagesDone;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }
}
