public class PrintServiceForInvestor implements PrintService {
    @Override
    public void print(Person[] people) {
        System.out.println("people.length = " + people.length);
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println("Имя: " + person.getName() + " возраст: " + person.getAge() + " номер телефона: "+ person.getPhoneNumber());
        }
    }
    @Override
    public void print(Customer[] customers) {
        System.out.println("customers.length = " + customers.length);
        for (int i = 0; i < customers.length; i++) {
            Customer customer = customers[i];
            System.out.println("Имя: " + customer.getName() + " возраст: " + customer.getAge() + " номер карты: "+ customer.getPhoneNumber());
        }
    }

    @Override
    public void print(Gamers[] gamers) {
        System.out.println("gamers.length = " + gamers.length);
        for (int i = 0; i < gamers.length; i++) {
            Gamers gamer = gamers[i];
            System.out.println("Имя: " + gamer.getName() + " возраст: " + gamer.getAge() + " номер телефона: "+ gamer.getPhoneNumber() + " платформа: " + gamer.getPlatform());
        }
    }
}
