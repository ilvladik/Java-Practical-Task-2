package exercise_4;

public class Computer {
    private String modelName;

    public Computer(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
