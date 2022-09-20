public class MainProgram {
    public static void main (String[] args) {
        Employee e1 = new Employee ("Max", "Mustermann", "01.01.2000", 'm', "", 0, 65.5);
        Employee e2 = new Employee ("Maya", "Musterfrau", "24.10.1976", 'f', "", 0, 65.5);
        Employee e3 = new Employee ("Any", "Name", "06.05.2003", 'd', "", 0, 65.5);
        Employee e4 = e1;
        e1.setDepartment("C64");
        e2.setDepartment("C64");

        System.out.println (e1.getDepartment());
        System.out.println (e2.getDepartment());
        System.out.println (e3.getDepartment());
        System.out.println (e4.getDepartment());
    }
}