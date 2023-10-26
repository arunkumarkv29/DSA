import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    public static class Employee{
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

       public String toString(){
            return "name: " + name + " " + "phone: " + phone + " " + "age: " + age ;
        }
    }
//    public static class AgeComaparator implements Comparator<Employee>{
//        public int compare(Employee E1 , Employee E2){
//            return E1.getAge()-E2.getAge() ;
//        }
//    }
//    public static class NameComaparator implements Comparator<Employee>{
//        public int compare(Employee E1 , Employee E2){
//            return E1.getName().compareTo(E2.getName()) ;
//        }
//    }
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>() ;
        list.add(new Employee("rahul","7674824118", 31)) ;
        list.add(new Employee("deepak","7835966185", 25)) ;
        list.add(new Employee("Arun","8802378109", 29)) ;
        list.add(new Employee("chirag","9902378109", 30)) ;
        list.add(new Employee("ravi","9802378109", 21)) ;
        list.add(new Employee("binod","6302378109", 23)) ;
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge()-o2.getAge();
            }
        }) ;
        System.out.println(list);

        Collections.sort(list, new Comparator<Employee>(){
            public int compare(Employee o1, Employee o2){
                return o1.getName().compareTo(o2.getName()) ;
            }
        }) ;
        System.out.println("--------------");
//
//        Collections.sort(list, new NameComaparator()) ;
        System.out.println(list);
    }
}
