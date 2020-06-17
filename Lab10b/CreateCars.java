package Lab10b;


import java.util.Random;

public class CreateCars {
    public static Car createCar() {
        Random random = new Random();
                return new Car(
                        random.nextDouble() * 10 + 1,
                        random.nextInt() * 10,
                        Color.values()[(new Random().nextInt(Color.values().length))]
                );
        }
    }

