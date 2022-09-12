public class MainProgram {
    public static void main (String[] args) {
<<<<<<< HEAD
        Employee y = new Employee ("Max", "Mustermann", "01.01.2000", 'm', "Has cancer", 22, 65.5);
        System.out.println(y.getName());
        Employee y2 = y;
        y2.changeName ("Alex", "Something");
        System.out.println (y.getName());
        
=======
        Employee y = new Employee ();
        y.changeName ("Max");
        System.out.println(y.getName());
        Employee y2 = y;
        y2.changeName ("Alex");
        System.out.println (y.getName());
>>>>>>> e45e4f2 (Homework to the 13th of September)
    }
}
