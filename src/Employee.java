import java.util.Objects;

public class Employee {
    private String fIO;
    private int department;
    private float salary;
    private static int counter;
    private int id;

    public int getId() {
        return this.id;
    }

    public String getFIO() {
        return this.fIO;
    }

    public int getDepartment() {
        return this.department;
    }

    public float getSalary() {
        return this.salary;
    }

    public void SetFIO(String fio) {
        this.fIO = fio;
    }

    public void SetDepartment(int dept) {
        this.department = dept;
    }

    public void SetSalary(float sal) {
        this.salary = sal;
    }

    @Override
    public String toString() {
        return fIO +
                ", Отдел = " + department +
                ", Заработная плата = " + salary + " руб." +
                " ID " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Float.compare(salary, employee.salary) == 0
                && id == employee.id && Objects.equals(fIO, employee.fIO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fIO, department, salary, id);
    }

    public Employee(String fio, int dept, float sal) {
        fIO = fio;
        department = dept;
        salary = sal;
        id = counter++;

    }

}

