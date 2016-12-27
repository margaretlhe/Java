// this skeleton is so you can translate and run previous subparts
// before you work on this subpart.

import java.util.Comparator;

public class ElementComparator implements Comparator<Element> {

    public int compare(Element e1, Element e2) {
    	if(e1 instanceof EBoolean && e2 instanceof EBoolean)
    	    return ((EBoolean)e1).compareTo((EBoolean)e2);
    	if(e1 instanceof EInteger && e2 instanceof EInteger)
    	    return ((EInteger)e1).compareTo((EInteger)e2);
    	if(e1 instanceof EString && e2 instanceof EString)
    	    return ((EString)e1).compareTo((EString)e2);
    	
    	if (e1 instanceof EBoolean)
    	    return -1;
    	if (e2 instanceof EBoolean)
    	    return 1;
    	if (e1 instanceof EInteger)
    	    return -1;
    	if (e2 instanceof EInteger)
    	    return 1;
    	
    	return 0;
        	
        
    }

}
