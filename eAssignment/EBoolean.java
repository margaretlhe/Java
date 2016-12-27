public class EBoolean extends Element implements Comparable<EBoolean>{
    private static int count = 0;
    protected boolean value;
    public EBoolean(int v) {
        value = v != 0;
        count++;
    }
    
    public String toString() {
        return "$"+String.valueOf(value)+"$";
    }
    
    public int hash() {
        return value ? 1 : 0;
    }
    
    public static int getCount() {
        return count;
    }

    @Override
    public int compareTo(EBoolean o) {
        int a = this.value? 1 : 0;
        int b = o.value? 1: 0;
        return a - b;
    }
}
