import java.util.*;

public class Main {
    public static class Employee implements Comparable<Employee>{
        private String name ;
        private String phone ;
        private int age ;
        Employee(String name, String phone, int age){
            this.name = name ;
            this.phone = phone ;
            this.age = age ;
        }
        public String getName(){
            return name ;
        }
        public String getPhone(){
            return phone ;
        }
        public int getAge(){
            return age ;
        }

        @Override
        public int compareTo(Employee o) {
            return this.getAge()-o.getAge();
        }
        public String toString(){
            return "name: " + name + " " + "phone: " + phone + " " + "age: " + age ;
        }
    }
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>() ;
        list.add(new Employee("Rahul","7674824118", 31)) ;
        list.add(new Employee("deepak","7835966185", 25)) ;
        list.add(new Employee("Arun","8802378109", 29)) ;

        Collections.sort(list) ;
        System.out.println(list);
    }
}