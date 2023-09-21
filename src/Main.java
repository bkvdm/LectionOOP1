//import javax.print.PrintService;

public class Main {
    public static void main(String[] args) {
//        Person sarah = new Person("Sarah", 30, 100);
//        sarah.setAge(34);
//        System.out.println("sarah.getAge() = " + sarah.getAge());
//        Person[] people = {
//                new Person("Сара", 30, 100),
//                new Person("Джон", 12, 101),
//                new Person("Иван", 25, 102),
//                new Person("Том", 35, 103),
//                new Person("Джо", 18, 104)
//        };
//        System.out.println("people.length = " + people.length);
//        for (int i = 0; i < people.length; i++) {
//            Person person = people[i];
//            System.out.println("Имя: " + person.getName() + " возраст: " + person.getAge() + " номер телефона: "+ person.getPhoneNumber());
//        }
        Customer[] customers = {
                new Customer("Сара", 30, 100, 2345),
                new Customer("Джон", 12, 101, 1198),
                new Customer("Том", 35, 103, 8934),
        };
//        System.out.println("customers.length = " + customers.length);
//        for (int i = 0; i < customers.length; i++) {
//            Customer customer = customers[i];
//            System.out.println("Имя: " + customer.getName() + " возраст: " + customer.getAge() + " номер телефона: "+ customer.getPhoneNumber());
//        }
        Gamers[] gamers = {
                new Gamers("Сара", 30, 100, "PC"),
                new Gamers("Джон", 12, 101, "PS"),
                new Gamers("Джо", 35, 104, "PS"),
        };

        PrintService printServiceForInvestor = new PrintServiceForInvestor();
        PrintService printServiceForEmployee = new PrintServiceForEmployee();
//        printServiceForInvestor.print(customers);
//        printServiceForEmployee.print(customers);
//        printServiceForInvestor.print(gamers);
//        printServiceForEmployee.print(gamers);
//        printService.print(people);
//        printService.print(customers);
//        printService.print(gamers);

        Person[] people = new Person[customers.length + gamers.length];
        for (int i = 0; i < gamers.length; i++) {
            people[i] = gamers[i];
        }
        for (int i = 0; i < customers.length; i++) {
            people[i + gamers.length] = customers[i];
        }
//        printService.print(people);
//        printServiceForInvestor.print(people);
//        printServiceForEmployee.print(people);
        printReport(printServiceForInvestor, customers, gamers, people);
        printReport(printServiceForEmployee, customers, gamers, people);
    }

    private static void printReport(PrintService printService, Customer[] customers, Gamers[] gamers, Person[] people) {
        printService.print(customers);
        printService.print(gamers);
        printService.print(people);
    }
}