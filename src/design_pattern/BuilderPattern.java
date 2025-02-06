package src.design_pattern;

 class Computer {
     private String CPU;
     private int RAM;
     private int storage;
                            
     private Computer(Builder builder) {
                                    this.CPU = builder.CPU;
                                    this.RAM = builder.RAM;
                                    this.storage = builder.storage;
                                }

                                public void showConfig() {
                                    System.out.println("CPU: " + CPU + ", RAM: " + RAM + "GB, Storage: " + storage + "GB");
                                }
                            
                                public static class Builder {
                                    private String CPU;
                                    private int RAM;
                                    private int storage;
                            
                                    public Builder setCPU(String CPU) {
                                        this.CPU = CPU;
                                        return this;
                                    }
                            
                                    public Builder setRAM(int RAM) {
                                        this.RAM = RAM;
                                        return this;
                                    }
                            
                                    public Builder setStorage(int storage) {
                                        this.storage = storage;
                                        return this;
                                    }
                            
                                    public Computer build() {
                                        return new Computer(this);
                                    }
                                }
                            }
                            
                            public class BuilderPattern {
                                public static void main(String[] args) {
                                    Computer myPC = new Computer.Builder()
                                            .setCPU("Intel i7")
                                            .setRAM(16)
                                            .setStorage(512)
                                            .build();
                            
                                    myPC.showConfig();
                                }
                            }


