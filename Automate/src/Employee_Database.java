class Staff {
    String code, name;

    public Staff(String code, String name) {
        this.code = code;
        this.name = name;
    }
}

class Teacher extends Staff {
    String subject, publication;

    public Teacher(String subject, String publication) {
        super("TeacherCode", "TeacherName");
        this.subject = subject;
        this.publication = publication;
    }
    void display() {
        System.out.println("Code:\t"+code);
        System.out.println("Name:\t"+name);
        System.out.println("Subject:\t"+subject);
        System.out.println("Publication:\t"+publication);
    }
}

class Officer extends Staff {
    String grade;

    public Officer(String grade) {
        super("OfficerCode", "OfficerName");
        this.grade = grade;
    }

    void display() {
        System.out.println("Code:\t"+code);
        System.out.println("Name:\t"+name);
        System.out.println("Grade:\t"+grade);
    }
}

class Typist extends Staff {
    int speed;

    public Typist(int speed) {
        super("TypistCode", "TypistName");
        this.speed = speed;
    }
}

class RegularTypist extends Typist {
    int remuneration;

    public RegularTypist(int speed, int remuneration) {
        super(speed);
        this.remuneration = remuneration;
    }

    void display() {
        System.out.println("Speed:\t"+speed);
        System.out.println("Remuneration:\t"+remuneration);
    }
}

class CasualTypist extends Typist {
    int daily_wages;

    public CasualTypist(int speed, int daily_wages) {
        super(speed);
        this.daily_wages = daily_wages;
    }

    void display() {
        System.out.println("Speed:\t"+speed);
        System.out.println("Daily Wages:\t"+daily_wages);
    }
}

public class Employee_Database {
    public static void main(String[] args) {
        System.out.println("Rajib Kuri, Roll No: 42");
        Teacher t = new Teacher("Biology", "Roy and Martin");
        t.display();
        Officer o = new Officer("A");
        o.display();
        RegularTypist r = new RegularTypist(90, 1200);
        r.display();
        CasualTypist c = new CasualTypist(60, 800);
        c.display();
    }
}

