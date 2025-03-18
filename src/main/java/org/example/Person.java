package org.example;

import lombok.Data;;
@Data

class Person implements Comparable<Person> {
        public Person(String name, int age) {
                this.name = name;
                this.age = age;
        }

        private String name;
        private int age;

        public String getName() {
                return name;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int compareTo(Person age){
                return age.getAge() - this.getAge();
        }

}