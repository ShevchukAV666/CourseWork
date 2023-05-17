public class Employee {
    private String fullNameEmployee; //имя
    private int salaryEmployee; // зарплата
    private int departmentEmployee; // отдел 1-5
    private int idEmployee;
    static int id = 1;

    public Employee(String nameEmployee, int salaryEmployee, int departmentEmployee) {
        this.fullNameEmployee = nameEmployee;
        this.salaryEmployee = salaryEmployee;
        this.departmentEmployee = departmentEmployee;
        this.idEmployee = id++;
    }

    public String getNameEmployee() {
        return fullNameEmployee;
    }

    public int getSalaryEmployee() {
        return salaryEmployee;
    }

    public int getDepartmentEmployee() {
        return departmentEmployee;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setSalaryEmployee(int salaryEmployee) {  //изменения зп
        this.salaryEmployee = salaryEmployee;
    }

    public void setDepartmentEmployee(int departmentEmployee) {  // изменение отдела
        this.departmentEmployee = departmentEmployee;
    }

    @Override
    public String toString() {
        return "id сотрудника - " + idEmployee + ", ФИО сотрудника - " + fullNameEmployee + ", Зарплата сотрудника - " + salaryEmployee + ", Отдел сотрудника - " + departmentEmployee;
    }

}



