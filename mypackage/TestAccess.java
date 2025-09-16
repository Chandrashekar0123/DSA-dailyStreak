public class TestAccess {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();

        // Access public variable
        System.out.println(obj.publicVar);

        // Access private variable → directly not allowed
        // System.out.println(obj.privateVar); // ❌ Error
        System.out.println(obj.getPrivateVar()); // ✅ Access via public method

        // Access protected variable
        System.out.println(obj.protectedVar);

        // Access default variable
        System.out.println(obj.defaultVar);
    }
}

// Non-public class in the same file
class AccessDemo {
    // 1. Public: accessible from anywhere
    public String publicVar = "I am public";

    // 2. Private: accessible only within this class
    private String privateVar = "I am private";

    // 3. Protected: accessible within package and subclasses
    protected String protectedVar = "I am protected";

    // 4. Default (no modifier): accessible within package only
    String defaultVar = "I am default";

    // Method to access private variable
    public String getPrivateVar() {
        return privateVar;
    }
}


/*

I am public
I am private
I am protected
I am default
/*

