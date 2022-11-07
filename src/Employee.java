public class Employee {
    // all attributes
    private String forename;
    private String surname;
    private String birthdate;
    private char gender;
    private String special;
    private int age;
    private double weight;
    private double salary;
    private String department;
    private int yearsInService;

    // constructor
    public Employee (String forename, String surname, String birthdate, char gender, String special, int age, double weight) {
        this.forename = forename;
        this.surname = surname;
        this.birthdate = birthdate;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.special = special;
        this.salary = 1500;
        this.department = "A38";
        this.yearsInService = 0;
    }

    // All getters
    public String getName () { return forename + " " + surname; }
    public double getSalary() { return salary; }
    public String getForename() { return forename; }
    public String getSurname() { return surname; }
    public String getBirthdate() { return birthdate; }
    public char getGender() { return gender; }
    public String special() { return special; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }
    public String getDepartment() { return department; }
    public int getYearsInService() { return yearsInService; }

    // all Setters
    public void setForename(String forename) { this.forename = forename; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setBirthdate(String birthdate) { this.birthdate = birthdate; }
    public void setGender(char gender) { this.gender = gender; }
    public void setTakeNoticeOf(String special) { this.special = special; }
    public void setAge(int age) { this.age = age; }
    public void setWeight(double weight) { this.weight = weight; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setYearsInService(int yearsInService) { this.yearsInService = yearsInService; }
    public void setDepartment(String department) { this.department = department; }
    public void setName (String forename, String surname) { this.forename = forename; this.surname = surname; }

    //get all the needed info
    public void getInfo () {
        System.out.println (
                "Surname: " + this.getSurname() +
                ", Age: " + this.getAge() +
                ", Gender: " + this.getGender() +
                ", Salary: " + this.getSalary() +
                ", Weight: " + this.getWeight()
        );
    }
}
