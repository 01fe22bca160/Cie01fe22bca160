import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Person {
    private String name;
    private Date dob;

    public Person(String name, String dob) {
        this.name = name;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            this.dob = sdf.parse(dob);
        } catch (ParseException e) {
            System.out.println("Invalid date format.");
        }
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayAge() {
        if (dob != null) {
            Date currentDate = new Date();
            long diffInMillies = Math.abs(currentDate.getTime() - dob.getTime());
            long ageInMillies = diffInMillies / (24 * 60 * 60 * 1000 * 365L);
            System.out.println("Age: " + ageInMillies);
        } else {
            System.out.println("Date of birth not provided.");
        }
    }
}

