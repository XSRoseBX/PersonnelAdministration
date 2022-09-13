public class MainProgram {
    public static void main (String[] args) {
        Employee y = new Employee ("Max", "Mustermann", "01.01.2000", 'm', "Has cancer", 22, 65.5);
        System.out.println(y.getName());
        Employee y2 = y;
        y2.changeName ("Alex", "Something");
        System.out.println (y.getName());
        
    }
}
