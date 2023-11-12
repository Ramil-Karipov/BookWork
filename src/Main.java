public class Main {
    public static void main(String[] args) {
        Employee[] empl = new Employee[3];
        empl[0] = new Employee("Новосельцев Виктор Викторович", 1, 25500f);
        empl[1] = new Employee("Константинов Ефим Вячеславович ", 2, 31450f);
        empl[2] = new Employee("Копадзе Давид Михайлович ", 3, 40200f);

        for (Employee e : empl) {
            System.out.println(e);

        }
    }
}