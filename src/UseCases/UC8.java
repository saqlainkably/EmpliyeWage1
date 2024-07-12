package UseCases;

public class UC8 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public static int computeWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsInMonth) {

        int empHours = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                default:
                    empHours = 0;
            }
            totalEmpHrs += empHours;
            System.out.println("Day#: " + totalWorkingDays + "Emp Hr: " + empHours);
        }
        int totalEmpWage = totalEmpHrs * empRatePerHr;
        System.out.println("Toatl Emp Wage for " + company + " is: " + totalEmpWage);
        return  totalEmpWage;
    }

    public static void main(String[] args) {
        computeWage("DMart",20,2,10);
        computeWage("Reliance",10,4,20);
    }
}
