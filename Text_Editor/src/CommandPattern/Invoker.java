package CommandPattern;

public class Invoker {
    Command command;
    public Invoker()
    {
    }

    public void commandBelirle(Command command)
    {
        this.command=command;
    }

    public void uygula()
    {
        command.calistir();
    }

}
