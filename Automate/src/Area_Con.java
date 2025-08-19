class Area{
    public double haha(int r){
        return Math.PI * r * r;
    }
    public float haha(int b, int h){
        return b * h;
    }
    public double haha(int a, int b, int c){
        float s = (a + b + c) / 2.0F;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}

public class Area_Con {
    public static void main(String[] args) {
        Area a = new Area();
        System.out.println(a.haha(3));
        System.out.println(a.haha(2, 4));
        System.out.println(a.haha(2, 2));
        System.out.println(a.haha(10, 30, 25));
    }
}
