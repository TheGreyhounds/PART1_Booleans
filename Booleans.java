public class Booleans {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a: " + a + " b: " + b);
        
        // The next section deals with boolean logical operators.
        // Pay close attention to the code, as boolean logic can
        // be a bit tricky to grasp at first.
        
        // The short-circuit AND operator: &&
        
        a = true;
        b = true;
        System.out.print("true && true results in: ");
        System.out.println((a && b));
        
        a = false;
        b = true;
        System.out.print("false && true results in: ");
        System.out.println((a && b));
        
        a = true;
        b = false;
        System.out.print("true && false results in: ");
        System.out.println((a && b));
        
        a = false;
        b = false;
        System.out.print("false && false results in: ");
        System.out.println((a && b));
        
        // The short-circuit OR operator
        
        a = true;
        b = true;
        System.out.print("true || true results in: ");
        System.out.println((a || b));
        
        a = true;
        b = false;
        System.out.print("true || false results in: ");
        System.out.println((a || b));
        
        a = false;
        b = true;
        System.out.print("false || true results in: ");
        System.out.println((a || b));
        
        a = false;
        b = false;
        System.out.print("false || false results in: ");
        System.out.println((a || b));
        
        // The Equals-to operator
        
        boolean bool1 = true;
        boolean bool2 = false;
        
        System.out.println("true==false:" + (bool1 == bool2));
        bool2 = true;
        System.out.println("true==true:" + (bool1 == bool2));
        System.out.println("true!=true:" + (bool1!=bool2));
        
        // The Unary NOT operator
        
        System.out.println("!true:" + !bool1);
        
        // Notice we didn't use a comparative operator here,
        // we used an assignment operator, and in the middle
        // of a statement no less!
        System.out.println("!false:" + !(bool2=false));
    }
}