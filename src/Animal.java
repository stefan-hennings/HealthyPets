public abstract class Animal {
    private final String name;
    private final int weight;
    private final Enums foodType;
    
    public Animal(String name, int weight, Enums foodType) {
        this.name = name;
        this.weight = weight;
        this.foodType = foodType;
    }
    
    public String getName() {
        return name;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public Enums getFoodType() {
        return foodType;
    }
    
    //Completed by the subclasses calling this and then adding the food amount and type at the end
    public String calculateFood() {
        return name + " ska äta ";
    }
}
