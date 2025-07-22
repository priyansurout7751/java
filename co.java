class a{

}
class c extends a{

}
class co {

    public a m1() {
        System.out.println("hello");
        return null;
    }

}

class b extends co {

  String name;

    public  b m1(String s) {
        this.name=s;
System.out.println(this.name);
        return null;
    }

    public static void main(String[] args) {
        b c = new b();
        System.out.println(c.m1("priyansu"));

    }
}
