import HelloApp.HelloPOA;
class HelloImpl extends HelloPOA {
    public String sayHello() {
        return "\nHello world !!\n";
    }
    public boolean isEven(int value) {
        return (value % 2 == 0);
    }
}