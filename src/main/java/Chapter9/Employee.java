package Chapter9;

public class Employee extends Person {
    private String employeed;
    private String title;
    public Employee(){
        super("Ryan");
        System.out.println("In Employee default constructor");
    }

    public String getEmployeed() {
        return employeed;
    }

    public void setEmployeed(String employeed) {
        this.employeed = employeed;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
