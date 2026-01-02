// Demonstrates Interface
interface Printer {
    void print();
}

class LaserPrinter implements Printer {
    public void print() {
        System.out.println("Printing document...");
    }
}

public class PrinterTest {
    public static void main(String[] args) {
        Printer p = new LaserPrinter();
        p.print();
    }
}
