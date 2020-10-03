package pratice_1;

public class Dog {
    public class Dog {
        private int age;
        private String name;

        public Dog(int age, String name) {
            this.age = age;
            this.name = name;
        }
        public int getAge(){
            return age;
        }
        public String getName(){
            return name;
        }


        public void setAge(int age){
            this.age = age;
        }
        public void setName(String name){
            this.name = name;
        }

        public int ConvertInHumanAge(){
            return age*7;
        }

        @Override
        public String toString() {
            return "pratice_1.Dog{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
