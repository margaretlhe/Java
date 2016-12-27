public class EString extends Element implements Comparable<EString>{
    private static int count = 0;
    protected String value;
    public EString(String v) {
        value = v;
        if(value.length()>24) {
            value = value.substring(0, 24);
        }
        count++;
    }
    
    public String toString() {
        return value;
    }
    
    public int hash() {
        return value.length() % 17;
    }
    public static int getCount() {
        return count;
    }

    @Override
    public int compareTo(EString o) {
        return this.value.compareTo(o.value);
    }
}
