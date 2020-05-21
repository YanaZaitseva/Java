public class Main {
    public static void main(String[] args) {


        class Employee {
            private String name;
            private String position;
            private String email;
            private String phone;
            private int salary;
            int age;

            public void employee(String[] args) {
                Employee employee = new Employee();

               this.name = "Ivanov Ivan";
               this.position = "Engineer";
                this.email = "ivivan@mailbox.com";
                this.phone = "897654322";
                this.salary = 30000;
                this.age = 32;


                //Employee employee1 = new Employee("Ivanov Ivan", "Engineer", 32)

                System.out.println("Employees' name is" + " " + this.name);
                System.out.println("Employees' position is" + " " + this.position);
                System.out.println("Employees' email is" + " " + this.email);
                System.out.println("Employees' phone is" + " " + this.phone);
                System.out.println("Employees' salary is" + " " + this.salary);
                System.out.println("Employees' age is" + " " + this.age);
            }
        }
    }
}


/*
class Person {

  // Person[] persArray = new Person[5];
  //String [][] persArray = new String[5][6]; // двумерный массив? // one data type for all-string?
  Person[][] persArray = new Person[5][6];
    persArray[0] = new Person ("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "898765432", 30000, 30);

        persArray[1] = new Person ("Petrov Petr", "Marketing specialist", "petrov@gmailbox.com", "891234567", 20000, 41);
        persArray[2] = new Person ("Sergeev Sergey", "Accountant", "Sserge@rambler.com", "893445567",40000, 42);
        persArray[3] = new Person ("Dow Jane", "Sales representative", "DJane@yahoo.com", "89122387763", 32000, 24);
        persArray[4] = new Person ("Smith Sam", "CEO",  "SamSmith@gmailbox.com", "893294876", 45000, 45);

//length = persArray.lenght; // in this case length= age (in last place)

     //   if persArray[6] >= 40 { // ne [6] a age...//string or int vezde?

    for (persArray i = 0; i ..) {

    {
        for (persArray j = 6) {
        }


        System.out.println(persArray[1] = (6));
    }
        }
        }
 */



