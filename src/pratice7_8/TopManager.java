package pratice7_8;

    public class TopManager extends Employee implements EmployeePosition  {

        public TopManager(String name, String surname) {
            super(name, surname);
        }
        public double calcTopManagerSalary(double fullIncome, double baseSalary) {
            if (fullIncome > 10000000) {
                return baseSalary + 1.5 * baseSalary;
            } else return baseSalary;

        }
        @Override
        public int getIncome() {
            return 0;
        }

        @Override
        public String getJobTitle() {
            return "topManager";
        }

        @Override
        public double calcSalary(double fullIncome, double baseSalary) {
            return calcTopManagerSalary(fullIncome, baseSalary);
}
