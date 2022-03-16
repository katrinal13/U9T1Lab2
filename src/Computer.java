public class Computer
{
    private int screenSize; // in inches
    private int memory; // in gigabytes (GB)

    public Computer(int screenSize, int memory)
    {
        this.screenSize = screenSize;
        this.memory = memory;
    }

    public void installOperatingSystem()
    {
        System.out.println("installing OS...");
    }
}
