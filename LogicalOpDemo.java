public class LogicalOpDemo {
    public static void main(String[] args) {
        boolean bool1 = true;
        boolean bool2 = true;
        boolean bool3 = false;
        boolean bool4 = true;
        boolean bool5 = true;
        
        System.out.println("bool1 && !bool2 = " + (bool1 && !bool2));
        System.out.println("bool2 || bool4 = " + (bool2 || bool4));
        System.out.println("!(bool2 ^ bool4) = " + (!(bool2 ^ bool4)));
        System.out.println("bool5 || !(bool2 && bool3) = " + (bool5 || !(bool2 && bool3)));
        System.out.println("bool1 && (bool4^bool2) || bool2 && bool3 = " + (bool1 && (bool4^bool2) || bool2 && bool3));
    }
    
}
