public class Plus { 
    public static Element plus(Element a, Element b) {
        if(a instanceof EInteger && b instanceof EInteger) {
            EInteger A = (EInteger) a;
            EInteger B = (EInteger) b;
            return new EInteger(A.value + B.value);
        }

        if(a instanceof EInteger && b instanceof EBoolean) {
            EInteger A = (EInteger) a;
            EBoolean B = (EBoolean) b;
            return new EInteger(B.value? A.value+1 : A.value);
        }

        if(a instanceof EInteger && b instanceof EString) {
            EInteger A = (EInteger) a;
            EString B = (EString) b;
            return new EString(A.toString() + B);
        }

        if(a instanceof EBoolean && b instanceof EBoolean) {
            EBoolean A = (EBoolean) a;
            EBoolean B = (EBoolean) b;
            return new EBoolean(A.value || B.value? 1 : 0);
        }

        if(a instanceof EBoolean && b instanceof EInteger) {
            EBoolean A = (EBoolean) a;
            EInteger B = (EInteger) b;
            return new EInteger(A.value? B.value+1 : B.value);
        }

        if(a instanceof EBoolean && b instanceof EString) {
            EBoolean A = (EBoolean) a;
            EString B = (EString) b;
            return new EString(A.toString() + B);
        }

        if(a instanceof EString && b instanceof EBoolean) {
            EString A = (EString) a;
            EBoolean B = (EBoolean) b;
            return new EString(A + B.toString());
        }

        if(a instanceof EString && b instanceof EInteger) {
            EString A = (EString) a;
            EInteger B = (EInteger) b;
            return new EString(A + B.toString());
        }

        if(a instanceof EString && b instanceof EString) {
            EString A = (EString) a;
            EString B = (EString) b;
            return new EString(A + B.toString());
        }
        return null;
    }
}