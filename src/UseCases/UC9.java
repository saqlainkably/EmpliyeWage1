package UseCases;

public class UC9 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int empRatePerHr;
    private final int numOfWorkingDays;
    private final int maxHrsInMonth;
    private int totalEmpWage;

    public UC9 (String company, int empRatePerHr, int numOfWorkingDays, int
                maxHrsInMonth){
        this.company=company;
        this.empRatePerHr=empRatePerHr;
        this.numOfWorkingDays=numOfWorkingDays;
        this.maxHrsInMonth=maxHrsInMonth;
    }

    public void computeWage() {

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
    }
    public String toString(){
        return "Total Emp Wage for Company: " + company + " is: " + totalEmpWage;
    }

    public static void main(String[] args) {
        UC9 dMart = new UC9("DMart",20,2,10);
        UC9 reliance = new UC9("Reliance",10,4,20);
        dMart.computeWage();
        System.out.println(dMart);
        reliance.computeWage();
        System.out.println(reliance);
    }
}
