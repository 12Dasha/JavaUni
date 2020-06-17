package Stones;

import java.util.Random;

public class CreateStone {
    public static Stone createStone(){
        Random random = new Random();
        switch (random.nextInt(2)){
            case 0:
                return new PreciousStone(
                                        random.nextDouble() * 10 + 0.1,
                                        random.nextDouble() * 1000,
                        PreciousType.values()[(new Random().nextInt(PreciousType.values().length))],
                        Transperancy.values()[(new Random().nextInt(Transperancy.values().length))]
                                );
            case 1:
                return new SemipreciousStone(
                                        random.nextDouble() * 10 + 0.1,
                                        random.nextDouble() * 1000,
                        SemipreciousType.values()[(new Random().nextInt(SemipreciousType.values().length))],
                        Transperancy.values()[(new Random().nextInt(Transperancy.values().length))]
                                );

            default:
                throw new IllegalArgumentException();
        }
    }
}
