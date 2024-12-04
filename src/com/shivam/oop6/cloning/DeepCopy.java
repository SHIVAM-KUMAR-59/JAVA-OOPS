package com.shivam.oop6.cloning;

public class DeepCopy {
    class Address implements Cloneable {
        String city;

        public Address(String city) {
            this.city = city;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone(); // Deep copy of Address
        }

        @Override
        public String toString() {
            return "Address{city='" + city + "'}";
        }
    }

    class Person implements Cloneable {
        String name;
        Address address;

        public Person(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Person cloned = (Person) super.clone(); // Clone top-level object
            cloned.address = (Address) address.clone(); // Clone nested object
            return cloned;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', address=" + address + "}";
        }
    }

    // Making the Main class static to run it without needing an instance of DeepCopy
    public static class Main {
        public static void main(String[] args) throws CloneNotSupportedException {
            DeepCopy deepCopyInstance = new DeepCopy();
            DeepCopy.Address address = deepCopyInstance.new Address("New York");
            DeepCopy.Person person1 = deepCopyInstance.new Person("John", address);

            DeepCopy.Person person2 = (DeepCopy.Person) person1.clone(); // Deep copy
            System.out.println("Before Modification:");
            System.out.println("Person1: " + person1);
            System.out.println("Person2: " + person2);

            person2.address.city = "Los Angeles"; // Modifies the copied reference
            System.out.println("After Modification:");
            System.out.println("Person1: " + person1);
            System.out.println("Person2: " + person2);
        }
    }
}
