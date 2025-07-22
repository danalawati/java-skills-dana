public class PayrollCalculator extends UserInfo {

    String employeeType;
    double hoursWorked;
    double hourlyRate;
    double grossPay;
    boolean hasHealthInsurance;

    public static void main(String[] args ){
        double emp1 = calculateWeeklyPay("FULL_TIME",45,10);
        System.out.println(emp1);
    }

    public PayrollCalculator(String name, int age, String email, boolean isActive, String employeeType, double hoursWorked,
                             double hourlyRate, double grossPay, boolean hasHealthInsurance) {
        super(name, age, email, isActive);
        this.employeeType = employeeType;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.grossPay = grossPay;
        this.hasHealthInsurance = hasHealthInsurance;

    }

    public static double calculateWeeklyPay(String employeeType, double hoursWorked, double hourlyRate) {

        if (hoursWorked < 0 || hourlyRate < 0) {
            System.out.println("Invalid input: negative values");
            return 0;
        }

        switch (employeeType) {

            case "FULL_TIME":
                if (hoursWorked < 40) {
                    double grossPay = hoursWorked * hourlyRate;
                    return grossPay;

                } else {
                    double regularPay = 40 * hourlyRate;
                    double overtime = (hoursWorked - 40) * (hourlyRate * 1.5);
                    double grossPay = regularPay + overtime;
                    return grossPay;
                }
            case "PART_TIME":
                if (hoursWorked > 25) {
                    System.out.println("Max hours for overtime is 25");
                    hoursWorked = 25;
                }
                double grossPay = hoursWorked * hourlyRate;
                return grossPay;

            case "CONTRACTOR":
                grossPay =  hoursWorked * hourlyRate;
                return grossPay;

            case "INTERN":
                if (hoursWorked > 20){
                    System.out.println("Max hours for overtime is 20");
                    hoursWorked = 20;
                }
                grossPay = hoursWorked * (hourlyRate * 0.8);
                return grossPay;


        }
        return 0;
    }

    public static double calculateTaxDeduction(double grossPay, boolean hasHealthInsurance) {
        double tax = 0;
        if (grossPay <= 500) {
            tax = grossPay * 0.1;
        } else if (500 < grossPay && grossPay <= 1000) {
            tax = grossPay * 0.15;
        } else if (1000 < grossPay && grossPay <= 2000) {
            tax = grossPay * 0.2;
        } else {
            tax = grossPay * 0.25;
        }
        if (hasHealthInsurance){
            tax -= 50;
        }
        return tax;

    }
}