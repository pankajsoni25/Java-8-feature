package app.test.employee;

public class Parallel_And_Sequential_Stream_Performance_Comparison_1 {

    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        System.out.println("Sequential Stream Count : " + GetEmployeeList.getEmployees().stream().filter(e -> e.getSalary() > 15000).count());
        long t2 = System.currentTimeMillis();
        System.out.println("Sequential Stream Time taken : " + (t2 - t1));
        System.out.println("-----------------------------------------");
        t1 = System.currentTimeMillis();
        System.out.println("Parallel Sequential Stream Count : " + GetEmployeeList.getEmployees().parallelStream().filter(e -> e.getSalary() > 15000).count());
        t2 = System.currentTimeMillis();
        System.out.println("Parallel Sequential Stream Time taken : " + (t2 - t1));

    }

}
