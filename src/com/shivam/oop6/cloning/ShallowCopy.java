package com.shivam.oop6.cloning;

public class ShallowCopy {
    class Address {
        String city;

        public Address(String city) {
            this.city = city;
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
            return super.clone(); // Shallow copy
        }
    }

    public class Main {
        public void main(String[] args) throws CloneNotSupportedException {
            Address address = new Address("New York");
            Person original = new Person("John", address);

            Person shallowCopy = (Person) original.clone();

            // Modifying the nested object
            shallowCopy.address.city = "Los Angeles";

            System.out.println("Original Address: " + original.address.city); // Output: Los Angeles
            System.out.println("Shallow Copy Address: " + shallowCopy.address.city); // Output: Los Angeles
        }
    }


}
