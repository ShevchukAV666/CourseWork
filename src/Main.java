public class Main {
    public static void main(String[] args) {
        System.out.println();

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Шевчук Артем Викторович", 100013, 1);
        employees[1] = new Employee("Старикова Астасия Андреевна", 99000, 2);
        employees[2] = new Employee("Иваненко Никита Романович", 88000, 3);
        employees[3] = new Employee("Миронова Полина Васильевна", 77000, 4);
        employees[4] = new Employee("Бортников Глеб Михайлович", 66000, 5);
        employees[5] = new Employee("Молодых Егор Андреевич", 55000, 5);
        employees[6] = new Employee("Малых Александр Андреевич", 44000, 4);
        employees[7] = new Employee("Орлов Максим Алексеевич", 33000, 3);
        employees[8] = new Employee("Бабушкина Марина Сергеевна", 22000, 2);
        employees[9] = new Employee("Бутузова Анастасия Андреевна", 111000, 1);

        employees[0].setSalaryEmployee(222_000); //изменение зарплаты сотрудника
        employees[0].setDepartmentEmployee(4);//изменение отдела сотрудника

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

        System.out.println("Сумма затрат на зарплаты в месяц - " + sumSalaries(employees) + " рублей");
        System.out.println("Максималная зарплата составляет " + maxSalary(employees) + " рублей");
        System.out.println("Минимальная зарплата составляет " + minSalary(employees) + " рублей");
        System.out.println("Средняя зарплата сосставляет - " + averageSalary(employees) + " рублей");
        allNameEmployees(employees);
    }


    public static int sumSalaries(Employee[] employees) {
        System.out.println();
        int sumSalaries = 0;
        for (int i = 0; i < employees.length; i++) {
            sumSalaries = sumSalaries + employees[i].getSalaryEmployee();
        }
        return sumSalaries;
    }

    public static int maxSalary(Employee[] employees) {
        System.out.println();
        int maxSalary = 1;
        int minSalary = 200000;

        for (int i = 0; i < employees.length; i++) { //рассчет минимальной и максимальной зарплат
            if (employees[i].getSalaryEmployee() > maxSalary)
                maxSalary = employees[i].getSalaryEmployee();
        }
        return maxSalary;
    }
    public static int minSalary(Employee[] employees) {
        System.out.println();
        int maxSalary = 1;
        int minSalary = 200000;

        for (int i = 0; i < employees.length; i++) {
           if (employees[i].getSalaryEmployee() < minSalary)
            minSalary = employees[i].getSalaryEmployee();
        }
        return minSalary;
    }

    public static float averageSalary(Employee[] employees) {
    System.out.println();
    float summSalarys = 0;
    for (int i = 0; i < employees.length; i++) {
        summSalarys = summSalarys + employees[i].getSalaryEmployee();}
        float averageSalary = summSalarys / employees.length;
    return averageSalary;
}
    public static String allNameEmployees(Employee[] employees) {
        System.out.println();
        String nameEmployees = null;
        for (int i = 0; i < employees.length; i++) {
            nameEmployees = employees[i].getFullNameEmployee();
            System.out.println("Ф.И.О. сотрудника - " +nameEmployees);
        }
        return null;
    }


}

