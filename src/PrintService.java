public interface PrintService {
//    void print(Person[] people);
    default void print(Person[] people) {
        System.out.println("Не положено смотреть такие отчёты ");
    }


    void print(Customer[] customers);

    void print(Gamers[] gamers);
}
