public class EListIt {
    int index = 0;
    EList eList;
    public boolean hasNext() {
        return index!=eList.size();
    }
    
    public Element next() throws UsingIteratorPastEndException{
        if(!hasNext()) {
            throw new UsingIteratorPastEndException("caught UsingIteratorPastEndException from EListIt");
        }
        else {
            return eList.list[index++];
        }
    }
    
    public EListIt(EList eList) {
        this.eList = eList;
    }
    
    
}