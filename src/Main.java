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

        for (int a = 0; a < employees.length; a++) { //вывести список сотрудников со всеми данными
            System.out.println(employees[a]);
        }
        System.out.println();

        int sumSalarys = 0; //сумма зарплат
        for (int b = 0; b < employees.length; b++) {
            sumSalarys = sumSalarys + employees[b].getSalaryEmployee();
        }
        System.out.println("Сумма затрат на зарплаты в месяц - " + sumSalarys + " рублей");
        System.out.println();

        float averageSalary = sumSalarys / 10f; //средняя зарплата
        System.out.println("Средняя зарплата сосставляет - " + averageSalary + " рублей");
        System.out.println();

        for (int c = 0; c < employees.length; c++) { //вывести только ФИО
            System.out.println("Ф.И.О. сотрудника - " + employees[c].getNameEmployee());
        }
        System.out.println();

        int maxSalary = 1;
        int minSalary = 200000;

        for (int i = 0; i < employees.length; i++) { //рассчет минимальной и максимальной зарплат
            if (employees[i].getSalaryEmployee() > maxSalary)
                maxSalary = employees[i].getSalaryEmployee();
            else if (employees[i].getSalaryEmployee() < minSalary)
                minSalary = employees[i].getSalaryEmployee();
        }
            System.out.println("Максималная зарплата составляет " + maxSalary + " рублей");
            System.out.println("Минимальная зарплата составляет " + minSalary + " рублей");

            System.out.println();

            employees[0].setSalaryEmployee(222_000); //изменение зарплаты сотрудника
            System.out.println("Новая зарплата у сотрудник " + employees[0].getNameEmployee() + " ,составляет " + employees[0].getSalaryEmployee() + " рублей");
            System.out.println();

            employees[0].setDepartmentEmployee(4);//изменение отдела сотрудника
            System.out.println("Новый отдел у сотрудник " + employees[0].getNameEmployee() + " - " + employees[0].getDepartmentEmployee());

        }
    }




















