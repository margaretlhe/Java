public class EList {
    Element [] list = new Element[2];
    int count = 0;
    
    public EListIt iterator() {
        return new EListIt(this);
    }
    public void add(Element e){
        if(count==capacity()) {
            Element [] tmpList = new Element[capacity()*2];
            System.arraycopy(list, 0, tmpList, 0, capacity());
            list = tmpList;         
        }
        
        list[count++] = e;
        
    }
    
    public String toString() {
        String str="";
        for(Element e : list) {
            if(e == null)
                break;
            str+=e.toString()+"\n";
        }
        return "++++\n" + str + "----"; 
    }
    
    public int size(){
        return count;
    }
    public int capacity(){
        return list.length;
    }
}