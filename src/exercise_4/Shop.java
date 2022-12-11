package exercise_4;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    @Override
    public String toString() {
        return computers.toString();
    }

    public void addComputer(String modelName) {
        Computer comp = new Computer(modelName);
        computers.add(comp);
    }

    public void delComputer(String modelName) {
        computers.removeIf(computer -> (computer.getModelName().equals(modelName)));
    }

    public Computer find(String modelName) {
        for (Computer computer : computers) {
            if (computer.getModelName().equals(modelName)) {
                return computer;
            }
        }
        return null;
    }
}
