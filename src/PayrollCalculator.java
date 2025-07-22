public class PayrollCalculator extends UserInfo {

    String employeeType;
    double hoursWorked;
    double hourlyRate;

    public static void main(String[] args ){
        double emp1 = calculateWeeklyPay("FULL_TIME",45,10);
        System.out.println(emp1);
    }

    public PayrollCalculator(String name, int age, String email, boolean isActive, String employeeType, double hoursWorked, double hourlyRate) {
        super(name, age, email, isActive);
        this.employeeType = employeeType;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;

    }

    public static double calculateWeeklyPay(String employeeType, double hoursWorked, double hourlyRate) {

        if (hoursWorked < 0 || hourlyRate < 0) {
            System.out.println("Invalid input: negative values");
            return 0;
        }

        switch (employeeType) {

            case "FULL_TIME":
                if (hoursWorked < 40) {
                    return hoursWorked * hourlyRate;
                } else {
                    double regularPay = 40 * hourlyRate;
                    double overtime = (hoursWorked - 40) * (hourlyRate * 1.5);
                    return regularPay + overtime;
                }
            case "PART_TIME":
                if (hoursWorked > 25){
                    System.out.println("Max hours for overtime is 25");
                    hoursWorked = 25;
                }
                return hoursWorked * hourlyRate;
            case "CONTRACTOR":
                return hoursWorked * hourlyRate;
            case "INTERN":
                if (hoursWorked > 20){
                    System.out.println("Max hours for overtime is 20");
                    hoursWorked = 20;
                }
                    return hoursWorked * (hourlyRate * 0.8);


        }
        return 0;
    }
}