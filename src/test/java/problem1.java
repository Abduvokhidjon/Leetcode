public class problem1 {
}
    class Person {
        private String name;
        private int age;

        // Constructor with no arguments
        public Person() {
            this("Unknown", 0); // Calls the constructor with two arguments
        }

        // Constructor with one argument
        public Person(String name) {
            this(name, 0); // Calls the constructor with two arguments
        }

        // Constructor with two arguments
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        public static void main(String[] args) {
            Person p1 = new Person();
            Person p2 = new Person("John");
            Person p3 = new Person("Alice", 25);

            p1.display();
            p2.display();
            p3.display();

            int [] array ={1, 2, 3, 54};
            int n = array[0];



        }
    }





