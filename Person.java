import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private Date dob;

    public Person(String name, String dob) throws ParseException {
        this.name = name;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        if (dob.contains("-")) {
            this.dob = dateFormat.parse(dob);
        } else {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            this.dob = dateFormat.parse(dob);
        }
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge() {
        Date currentDate = new Date();
        long ageInMillis = currentDate.getTime() - dob.getTime();
        long years = ageInMillis / 1000 / 60 / 60 / 24 / 365;
        System.out.println("Age: " + years + " years");
    }
}
