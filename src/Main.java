public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("     Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println("     Задача 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета —" + fullName.toUpperCase());

        System.out.println("     Задача 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника —" + fullName);
    }
}