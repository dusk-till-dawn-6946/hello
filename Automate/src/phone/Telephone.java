package phone;

public class Telephone {
    int mobile_id;
    public int available_quantity;
    String model_name;

    public Telephone() {
        this.mobile_id = 12345;
        this.available_quantity = 5;
        this.model_name = "Samsung";
    }

    public void display() {
        System.out.println("Mobile Id is:\t"+ mobile_id);
        System.out.println("Model Name is:\t"+ model_name);
    }
}

