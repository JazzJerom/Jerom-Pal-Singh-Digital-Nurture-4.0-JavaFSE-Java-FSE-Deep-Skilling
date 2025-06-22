public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder("Intel i3", "4GB")
                .build();

        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .setStorage("2TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setOperatingSystem("Windows 11")
                .build();

        Computer officeComputer = new Computer.Builder("Intel i5", "8GB")
                .setStorage("512GB SSD")
                .setOperatingSystem("Windows 10 Pro")
                .build();

        System.out.println(basicComputer);
        System.out.println(gamingComputer);
        System.out.println(officeComputer);
    }
}
