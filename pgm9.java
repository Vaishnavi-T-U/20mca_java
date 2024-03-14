class CPU {
    double price;

    // Inner class Processor
    class Processor {
        int numberOfCores;
        String manufacturer;

        Processor(int numberOfCores, String manufacturer) {
            this.numberOfCores = numberOfCores;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("Processor Information:");
            System.out.println("Number of Cores: " + numberOfCores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    // Static nested class RAM
    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("\nRAM Information:");
            System.out.println("Memory: " + memory + " GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    // Constructor for CPU
    CPU(double price) {
        this.price = price;
    }

    void display() {
        System.out.println("CPU Price: $" + price);
    }
}

public class pgm9{
    public static void main(String[] args) {
        // Creating an object of CPU
        CPU cpu = new CPU(250.0);

        // Creating objects of inner classes
        CPU.Processor processor = cpu.new Processor(8, "Intel");
        CPU.RAM ram = new CPU.RAM(16, "Kingston");

        // Displaying CPU information
        cpu.display();

        // Displaying Processor information
        processor.display();

        // Displaying RAM information
        ram.display();
    }
}
