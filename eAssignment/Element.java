// the Element base class



public abstract class Element {
    private static int count = 0;
    public Element() {
        count++;
    }
    public abstract int hash();
    public static int getCount() {
        return count;
    }
}