package ex.ex13;

import java.util.List;

import java.util.Comparator;

class Ex131 {
    public static void main(String[] args) {
        Branch branch = new Branch("札幌");
        System.out.println(branch.getName());
        List<Employee> employees = branch.getEmployees();
        for (Employee employee:employees) {
            System.out.println(
                    employee + " " + employee.getAllSales() +
                            " " + employee.getSum() +
                            " " + employee.getAve());
        }

        //支店合計の表示
        int sum = 0;
        for (Employee employee:employees) {
            sum+=employee.getSum();
        }
        System.out.println("支店合計の表示");
        System.out.println(branch.getName() + ":" + sum);

        //支店の上位３名の表示
        System.out.println("支店売上TOP3");
        employees.sort(Comparator.comparing(Employee::getSum,Comparator.reverseOrder()));
        for (int i = 0; i < 3; i++) {
            System.out.println(employees.get(i).getName() + ":" +
                    employees.get(i).getSum());
        }
    }
}
