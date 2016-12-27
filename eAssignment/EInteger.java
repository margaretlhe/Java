public class EInteger extends Element implements Comparable<EInteger>{
    private static int count = 0;
    protected int value;
    public EInteger(int v){
        value = v;
        count++;
    }
    
    public String toString() {
        return String.valueOf(value);
    }
    
    public int hash() {
        return Math.abs(value) % 17;
    }
    public static int getCount() {
        return count;
    }

    @Override
    public int compareTo(EInteger o) {
        return this.value - o.value;
    }
}
