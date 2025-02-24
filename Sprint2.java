public class Sprint2 {
    public static void main(String[] args) {
        Person person = new Person("Привет");
        System.out.println(person.print);
    }

    public static class Person {
        public String print;
        private Integer age;

        public Person(String print) {
            this.print = print;
        }

        public String print() {
            return print;
        }

        public String getPrint() {
            return print;
        }

        public void setPrint(String print) {
            this.print = print;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}