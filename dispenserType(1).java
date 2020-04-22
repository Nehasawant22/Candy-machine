package candy;
class dispenserType {

    private int numberOfItems, cost;

    public dispenserType() {
        numberOfItems = 50;
        cost = 50;
    }

    public dispenserType(int x, int y) {
        numberOfItems = x;
        cost = y;
    }

    public void set(int x, int y) {
        numberOfItems = x;
        cost = y;
    }

    public int getNoOfItems() {
        return numberOfItems;
    }

    public int getCost() {
        return cost;
    }

    public void makeSale(int x) {
        numberOfItems = numberOfItems - x;
    }
}