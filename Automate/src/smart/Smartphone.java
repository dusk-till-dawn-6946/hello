package smart;


import phone.Telephone;

public class Smartphone extends Telephone {
    boolean enabled_5g;
    boolean foladable;
    boolean dual_screen;

    public Smartphone() {
        super();
        this.enabled_5g = true;
        this.foladable = true;
        this.dual_screen = true;
    }

    public void purchase(){
        super.available_quantity--;
    }

    public void display() {
        super.display();
        System.out.println("Enabled 5g:\t" + enabled_5g);
        System.out.println("Foldable:\t" + foladable);
        System.out.println("Dual Screen:\t" + dual_screen);
        System.out.println("Available Quantity:\t" + super.available_quantity + " Pcs");
    }
}
