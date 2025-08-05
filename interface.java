class Outer {
    interface NestedInterface {
        void greet();
    }
}

class Demo implements Outer.NestedInterface {
    public void greet() {
        System.out.println("Hello from Nested Interface!");
    }

    public static void main(String[] args) {
        Outer.NestedInterface obj = new Demo();
        obj.greet();
    }
}



    
    



