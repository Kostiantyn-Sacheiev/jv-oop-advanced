package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random index = new Random();

    public String getRandomColor() {
        return Colors.values()[index.nextInt(Colors.values().length)].getTitle();
    }
}
