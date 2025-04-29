package products;

public class Notebook extends Product {
    private int pageCount;
    private boolean isHardCover;
    private static int counter = 1;

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }


    public Notebook(String title, double price, int pageCount, boolean isHardCover) {
        super(title , price);
        setPageCount(pageCount);
        setHardCover(isHardCover);
    }

    @Override
    public String toString() {
        String baseString = super.toString();
        return baseString + " ,PageCount=" + getPageCount() + " ,isHardCover=" + isHardCover();
    }

    @Override
    protected String generateId() {
        if (counter > 999)
            throw new IllegalStateException("NoteBook ID limit reached");
        return "2" + String.format("%03d", counter++);
    }
}
