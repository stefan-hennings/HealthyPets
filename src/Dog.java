public class Dog extends Animal {
    public Dog(String name, int weight) {
        super(name, weight, Enums.DOGFOOD);
    }
    
    @Override
    public String calculateFood() {
        return super.calculateFood() + getWeight() / 100 + " gram";
    }
}
