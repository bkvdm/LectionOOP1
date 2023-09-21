public class PrintServiceForEmployee implements PrintService {
    @Override
    public void print(Person[] people) {
        System.out.println("Размер списка учтённых людей для сотрудников " + people.length);
//        for (int i = 0; i < people.length; i++) {
//            Person person = people[i];
//            System.out.println("Имя: " + person.getName() + " возраст: " + person.getAge() + " номер телефона: "+ person.getPhoneNumber());
//        }
        ;
        System.out.println("Имя: ");
        printPeople(people);
        System.out.println();
    }
    @Override
    public void print(Customer[] customers) {
        System.out.println("Размер списка покупателей для сотрудников " + customers.length);
//        for (int i = 0; i < customers.length; i++) {
//            Customer customer = customers[i];
//            System.out.println("Имя: " + customer.getName() + " возраст: " + customer.getAge() + " номер карты: "+ customer.getPhoneNumber());
//        }
        System.out.println("Покупатель: ");
        printPeople(customers);
        System.out.println();
    }

    @Override
    public void print(Gamers[] gamers) {
        System.out.println("Размер списка игроков для сотрудников " + gamers.length);
//        for (int i = 0; i < gamers.length; i++) {
//            Gamers gamer = gamers[i];
//            System.out.println("Имя: " + gamer.getName() + " возраст: " + gamer.getAge() + " номер телефона: "+ gamer.getPhoneNumber() + " платформа: " + gamer.getPlatform());
//        }
        System.out.println("Игрок: ");
        printPeople(gamers);
        System.out.println();
    }

    private void printPeople(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println(person.getName() + " возраст: " + person.getAge() + " номер телефона: "+ person.getPhoneNumber());
        }

    }
}
