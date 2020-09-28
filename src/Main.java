import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Animal> animals = new ArrayList<>();
    
    public static void main(String[] args) {
        //Create the "database" of animals
        animals.add(new Dog("Sixten", 5_000));
        animals.add(new Dog("Dogge", 10_000));
        animals.add(new Cat("Venus", 5_000));
        animals.add(new Cat("Ove", 3_000));
        animals.add(new Snake("Hypno", 1_000));
        
        //Run until user quits
        while (true) {
            feed();
        }
    }
    
    public static void feed() {
        String animalToFeed = JOptionPane.showInputDialog("Vem vill du mata?");
        if (animalToFeed == null) {
            System.exit(0);
        } else if (animalToFeed.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mata in ett namn! ");
        } else {
            boolean isFound = false;
            for (Animal animal : animals) {
                if (animal.getName().equalsIgnoreCase(animalToFeed.trim())) {
                    //Polymorphism
                    JOptionPane.showMessageDialog(null, animal.calculateFood() + " " +
                                    //Enums and more polymorphism
                                    animal.getFoodType()
                            /*
                            switch (animal.getFoodType()) {
                                //Enums
                                case CAT_FOOD -> " kattfoder.";
                                case DOG_FOOD -> " hundfoder.";
                                case SNAKE_PELLETS -> " ormpellets.";
                            }
                            */
                    );
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                JOptionPane.showMessageDialog(null, animalToFeed + " bor inte på hotellet. ");
            }
            /*
            animals.forEach(animal -> {
                if (animal.getName().equals(animalToFeed)) {
                    JOptionPane.showMessageDialog(null, animal.calculateFood());
                    System.out.println("Found!");
                    break;
                    return;
                } else {
                    System.out.println("continued!");
                }
            });*/
        }
    }
}
