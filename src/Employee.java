public class Employee {
    private String forename;
    private String surname;
    private String birthdate;
    private char gender;
    private String takeNoticeOf;
    private int age;
    private double weight;
    private double salary;
    private String department;
    private int yearsInService;

    public Employee (String forename, String surname, String birthdate, char gender, String takeNoticeOf, int age, double weight) {
        this.forename = forename;
        this.surname = surname;
        this.birthdate = birthdate;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.takeNoticeOf = takeNoticeOf;
        this.salary = 1500;
        this.department = "A38";
        this.yearsInService = 0;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName () { return forename + " " + surname; }
    public double getSalary() { return salary; }
    public String getForename() { return forename; }
    public String getSurname() { return surname; }
    public String getBirthdate() { return birthdate; }
    public char getGender() { return gender; }
    public String getTakeNoticeOf() { return takeNoticeOf; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }
    public String getDepartment() { return department; }
    public int getYearsInService() { return yearsInService; }

    public void changeName (String forename, String surname) {
        this.forename = forename;
        this.surname = surname;
    }
}