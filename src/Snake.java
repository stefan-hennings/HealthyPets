public class Snake extends Animal {
    public Snake(String name, int weight) {
        super(name, weight, Enums.SNAKEPELLETS);
    }
    
    @Override
    public String calculateFood() {
        return super.calculateFood() + " ska äta 20 gram";
    }
}
