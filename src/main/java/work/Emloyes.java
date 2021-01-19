package work;

public class Emloyes {
    public static void main(String[] args) {
        Employee[] employees = {new Employee("Стив","Возняк","IT-инженер","stivvoznyak@email.com","8777444111",4000,71),
                                new Employee("Стив","Джобс","Дизайнер","jobs@imail.com","8777777777",120000000,72),
                                new Employee("Рональд","Уэйн","Senior","ronald@email.com","8777454111",0,70),
                                new Employee("Тим","Кук","бухгалтер","TIM@email.com","822222222",20000000,35),
                                new Employee("Джонн","Скали","CEO","skali@email.com","8777442111",1500000,35)};

        for (Employee i:employees) {
            if(i.getAge()>40)
                i.showEmployee();
        }

     }

}
