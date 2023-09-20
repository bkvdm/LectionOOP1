import javax.print.PrintService;

public class Main {
    public static void main(String[] args) {
//        Person sarah = new Person("Sarah", 30, 100);
//        sarah.setAge(34);
//        System.out.println("sarah.getAge() = " + sarah.getAge());
        Person[] people = {
                new Person("Сара", 30, 100),
                new Person("Джон", 12, 101),
                new Person("Иван", 25, 102),
                new Person("Том", 35, 103),
        };
        System.out.println("people.length = " + people.length);
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println("Имя: " + person.getName() + " возраст: " + person.getAge() + " номер телефона: "+ person.getPhoneNumber());
        }
        Customer[] customers = {
                new Customer("Сара", 30, 100, 2345),
                new Customer("Джон", 12, 101, 1198),
                new Customer("Том", 35, 103, 8934),
        };
        System.out.println("customers.length = " + customers.length);
        for (int i = 0; i < customers.length; i++) {
            Customer customer = customers[i];
            System.out.println("Имя: " + customer.getName() + " возраст: " + customer.getAge() + " номер телефона: "+ customer.getPhoneNumber());
        }
        PrintService printService = new PrintService();
        printService.print(people);
        printService.print(customers);
    }
}