package gb;

public class Employee {
    String name; //ФИО
    String position; //должность
    String email; //емейл
    String phone_number; //номер телефона
    int salary; //зарплата
    int age; //возраст

    public Employee(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }



    public String toString(){
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                name, position, email, phone_number, salary, age);
    }

    public void print(){
        System.out.println(this);
    }


    public static void main(String[] args)  {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("иванов иванович", "Генеральный директор", "vk@primer,ru", "+799962265544", 250000, 55);
        persArray[1] = new Employee("Иван Зеленский ", "Директор по развитию", "vz@primer,ru", "+79999984455", 127000, 42);
        persArray[2] = new Employee("владимир петров ", "Охранник", "dm@primer,ru", "+79997771235", 19000, 21);
        persArray[3] = new Employee("Олеся Лисина", "Ведущий разработчик", "ol@primer,ru", "+79995554757", 120000, 28);
        persArray[4] = new Employee("Кристина Волкова", "Директор по работе с клиентами", "kv@primer,ru", "+79994445557", 138000, 48);

        for (int i=0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].print();

    }
}
