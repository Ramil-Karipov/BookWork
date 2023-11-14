public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.addContact("Новосельцев Виктор Викторович", 1, 140000);
        service.addContact("Константинов Ефим Вячеславович ", 2, 865040);
        service.addContact("Копадзе Давид Михайлович ", 3, 77477);

        service.printAllInformation();
        service.calculateSalary();
        service.findMinimalSalaryWorker();
        service.findHighestSalaryWorker();
        service.findAverageSalary();
        service.printAllEmployeesFullNames();
        service.calculateSalaryOfDepartment(1);
        service.findAverageSalaryOfDepartment(2);
        service.indexSalary();
        service.printAllInformation();
        service.findMinimalSalaryWorkerOfDepartment(3);
        service.findHighestSalaryWorkerOfDepartment(4);
        service.indexSalaryOfDepartment(10, 5);
        service.printAllInformation();
        service.printAllInformationOfDepartment(1);
        service.findWorkersWithSalaryBelowParameter(60_000);
        service.findWorkersWithSalaryHigherParameter(45_000);


    }


}
