public class EListUser {
    public static int size1(EList k){
        EListIt iterator = k.iterator();
        int count = 0;
        try {
            while(iterator.hasNext()) {
                iterator.next();
                count++;
            }
        } catch (UsingIteratorPastEndException e) {
            e.printStackTrace();
        }
        return count;
    }
    
    public static int size2(EList k) {
        EListIt iterator = k.iterator();
        int count = 0;
        try {
            while(true) {
                iterator.next();
                count++;
            }
        } catch(UsingIteratorPastEndException e){
            return count;
        }
    }
    
    public static boolean isBalanced(EList k){
        int N = size1(k);
        EListIt iterator = k.iterator();
        int firstHalfCount = 0;
        int secondHalfCount = 0;
        Element tmpElement;
        try {
            for(int i = 0 ; i < N ; i++){
                tmpElement = iterator.next();
                if(tmpElement instanceof EInteger)
                    if(i < N/2) 
                        firstHalfCount++;
                    else if (i >= N - N/2) 
                        secondHalfCount++;
            }
        } catch (UsingIteratorPastEndException e) {
            e.printStackTrace();
        }
        return firstHalfCount == secondHalfCount;
    }
}