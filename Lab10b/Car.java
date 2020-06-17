package Lab10b;

import java.util.Objects;

public class Car {
    private double model;
    private int number;
    private Color colour;

    public Car(double model, int number, Color colour) {
        this.model = model;
        this.number = number;
        this.colour = colour;
    }

    public double getModel() {
        return model;
    }

    public double getNumber() {
        return number;
    }

    public Color getColour() {
        return colour;
    }

    public void setModel(double model) {
        this.model = model;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) &&
                Objects.equals(number, car.number) &&
                Objects.equals(colour, car.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, number, colour);
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "model='" + model + '\n' +
                "number='" + number + '\n' +
                "colour='" + colour + '\n' +
                '}' +"\n";

    }
}
