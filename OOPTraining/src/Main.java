public class Main {
    public static void main(String[] args) {
        Employee hoang = new Employee(001, "Manager", 2000, "Home");
        hoang.setEmployeeSalary(3000);
        hoang.getInfo();
        Car porsche = new Car();
        Car holden = new Car();
        Car kia = new Car();
        porsche.setModel("Carrera");
        kia.setModel("Holden");
        System.out.println(kia.getModel());
        System.out.println(porsche.getModel());
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtrat= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("division= " + calculator.getDivisionResult());
    }
}
