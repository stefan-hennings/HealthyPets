public enum Enums {
    CAT_FOOD("kattfoder"),
    DOG_FOOD("hundfoder"),
    SNAKE_PELLETS("ormpellets");
    
    private final String value;
    
    Enums(String value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return value;
    }
}
