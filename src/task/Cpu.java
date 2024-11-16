package task;

public class Cpu {

    private void cp() {
        System.out.println("Cpu ruleaza");
    }

    class Processor {
        void pr() {
            System.out.println("Procesorul e in stare excelenta");
        }
    }

    class Motherboard {
        void mot() {
            System.out.println("Sistema BIOS necesita actualizare");
        }
    }

    public static void main(String[] args) {
        Cpu cpu = new Cpu();
        Processor pru = cpu.new Processor();
        Motherboard motu = cpu.new Motherboard();

        cpu.cp();
        pru.pr();
        motu.mot();

    }
}
