import java.lang.Math;
public class MainProgram {
        public static void main (String[] args) {
                // homework, task 2a)
                Employee e1 = new Employee(
                        "Max", "Mustermann", "01.01.1982",
                        'm', "Day off on every Monday", 40, 65.5
                );
                Employee e3 = new Employee(
                        "Kiyan", "Jannati", "01.01.2008",
                        'f', "Promotion in January", 14, 50
                );
                Employee e4 = new Employee(
                        "Jasmina", "Gerhardt", "23.07.2007",
                        'f', "Nothing of importance", 15, 55
                );
                Employee e5 = new Employee(
                        "Maridiat", "Musterfrau", "09.10.2007",
                        'm', "Gets raise soon", 15, 55
                );
                Employee e6 = new Employee(
                        "Mattea", "Rukic", "14.04.2006",
                        'f', "Slacking off a bit", 16, 55
                );
                Employee e2 = new Employee(
                        "Kay", "Herchenröder", "24.10.1970",
                        'd', "Nothing of importance", 52, 55
                );
                // homework, task 2b)
                Employee[] employees = {e1, e2, e3, e4, e5, e6};
                for (int i = 0; i < 6; i++) {
                        employees[i].getInfo();
                }
                //homework task 2c)
                for (int i = 0; i < 6; i++) {
                        // homework task 2c.i)
                        if (employees[i].getAge() >= 40) {
                                employees[i].setSalary(3000);
                        }
                        // homework task 2c.ii)
                        if (employees[i].getAge() >= 50) {
                                employees[i].setSalary(4000 + (Math.random()) * 5000);
                        }
                        // homework task 2c.iii)
                        if (employees[i].getAge() >= 60) {
                                employees[i].setSalary(employees[i].getSalary() + 500);
                        }
                }
        }
}