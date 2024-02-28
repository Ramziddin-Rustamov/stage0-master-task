package OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String furDescription = hasFur ? "a" : "no";
        String pawsDescription = (numberOfPaws == 1) ? "paw" : "paws";

        return "This animal is mostly " + color + ". It has " + numberOfPaws +
                " " + pawsDescription + " and " + furDescription + " fur.";
    }

    public boolean hasFur(){
        return this.hasFur ? true : false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color=color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws=numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur=hasFur;
    }
}
