package jingtaidaili;

public class Proxy implements Action {

    private Action realObject;

    public Proxy(Action realObject)
    {
        this.realObject = realObject;
    }

    @Override
    public void doSomething() {
        System.out.println("Proxy Do!!!");
    }

    public static void main(String[] args)
    {
        //静态代理
        Proxy proxy = new Proxy(new RealObject());
        proxy.doSomething();
    }
}
