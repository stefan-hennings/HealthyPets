public class Cat extends Animal {
    public Cat(String name, int weight) {
        super(name, weight, Enums.CATFOOD);
    }
    
    @Override
    public String calculateFood() {
        return super.calculateFood() + getWeight() / 150 + " gram";
    }
}
