public class Computer {

    private String CPU;
    private String RAM;

    private String storage;
    private String graphicsCard;
    private String operatingSystem;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }

    public static class Builder {

        private String CPU;
        private String RAM;

        private String storage;
        private String graphicsCard;
        private String operatingSystem;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer {" +"CPU='" + CPU + '\'' +", RAM='" + RAM + '\'' +", Storage='" + storage + '\'' +", Graphics Card='" + graphicsCard + '\'' +", Operating System='" + operatingSystem + '\'' +'}';
    }
}
