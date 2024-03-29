class Vehicle{
    private String make;
    private String model;
    private int year;
    private String color;

    public Vehicle(String model, String make, int year, String color){
        this.model = model;
        this.make = make;
        this.year = year;
        this.color = color;
    }

    // Getters
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }

    // Setters
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return getColor()+" "+getMake()+" "+getModel()+" "+getYear();
    }
}