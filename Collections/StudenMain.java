package Collections;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudenMain {
    public static void main(String[] args) {
//        List<Integer> numbers=new ArrayList<>();
//        numbers.add(10);
//        numbers.add(20);
//        numbers.add(30);
//        numbers.add(80);
//        numbers.add(40);
//        numbers.sort(Comparator.reverseOrder());
//        System.out.println(numbers);
        //
////        System.out.println(numbers);
////        System.out.println("Using for each");
////        for(int i:numbers)
////            System.out.println();
////        numbers.forEach(num->{
////            System.out.println(num);
////            System.out.println(num*num);
////        });
//        List<Integer> evenList=new ArrayList<>();
//        List<Integer> oddList=new ArrayList<>();
//        for(int i:numbers)
//        {
//            if (i%2==0)
//                evenList.add(i);
//            else
//                oddList.add(i);
//        }
//
//        List<String> list =
//                Arrays.asList("Ramesh", "Ganesh", "chandan");
//
//        System.out.println(list);

//        List<Integer> list1 = Arrays.asList(10, 20, 25, 3, 4, 9, 78);
//        list1.set(1,200);
//        System.out.println(list1);
//        List<Integer> integers = List.of(10, 20, 30, 40, 50);
//        integers.set(1,200);
//        System.out.println(integers);

        List<Student> students=new ArrayList<>();
        students.add(new Student(1, "Amit", "Pune", "CSE", 85));
        students.add(new Student(2, "Neha", "Mumbai", "ECE", 78));
        students.add(new Student(3, "Rahul", "Delhi", "ME", 90));
        students.add(new Student(4, "Sneha", "Chennai", "CSE", 88));
        students.add(new Student(5, "Vikram", "Hyderabad", "EEE", 75));
        students.add(new Student(6, "Priya", "Kolkata", "IT", 92));
        students.add(new Student(7, "Ravi", "Nagpur", "Civil", 70));
        students.add(new Student(8, "Divya", "Bangalore", "CSE", 95));
        students.add(new Student(9, "ankit", "Indore", "ME", 80));
        students.add(new Student(10, "Kiran", "Jaipur", "IT", 83));


        List<Student> sortedList = students
                .stream()
                .sorted((a, b) -> b.getName().compareTo(a.getName()))
                .toList();

//        for (Student std:sortedList)
//            System.out.println(std.getName());

//        print only students name starts with 'A'
        students
                .stream()
                .filter(std->std.getName().toLowerCase().startsWith("a"))
                .forEach(std-> System.out.println(std.getName()));


//        for (Student std:students)
//        {   if(std.getPlace()==null)
//            std.setPlace("Chennai");
//            System.out.println(std.getPlace()+":"+ std.getName());
//
//        }
//
//        Map<String, List<Student>> collect1 = students.stream()
//                .collect(Collectors.groupingBy(Student::getBranch));
//
////        collect1.keySet().stream().collect(Map.Entry.comparingByValue(collect1::)));
//        System.out.println(collect1);
//
//        Comparator<Student> comparing = Comparator
//                .comparing((Student std)->std.getName().toLowerCase()).reversed();
//        students.sort(comparing);
//        for(Student std:students)
//            System.out.println(std.getName()+":"+std.getPlace());

            List<String> countries= Arrays.asList("India","USA","UK","Canada","Australia","New Zealand","South Africa");

//        students
//                .stream()
//                .sorted((s1,s2)->s1.getRollNo()-s2.getRollNo())
//                .forEach(std-> System.out.println(std.getName()+":"+std.getPlace()));
        List<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(80);
        numbers.add(40);
        numbers.add(31);
        numbers.add(81);
        numbers.add(41);
        numbers.add(51);
        numbers.add(61);

        Map<Boolean, List<Integer>> collect = numbers
                .stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Evan numbers"+ collect.get(true));
        System.out.println("Odd numbers"+ collect.get(false));

//        System.out.println("Sorting array list");
//        List<Integer> sortedList = numbers
//                .stream()
//                .sorted((fVal, sVal) -> fVal - sVal)
//                .collect(Collectors.toList());
//
////        numbers.sort((a,b)->b-a);
////        System.out.println(numbers);
//        System.out.println(sortedList);
//        System.out.println("Using foreach");
//        numbers
//                .stream()
//                .filter(n->n%2==0)
//                .forEach(n-> {
//                    System.out.println(n);
//                });
//
//        List<Integer> oddNumbers= numbers
//                .stream()
//                .filter(n -> n % 5 != 0)
//                .map(n->n*n)
//                .toList();
//
//        int i = numbers
//                .stream()
//                .filter(n -> n % 5 != 0)
//                .map(n -> n * n)
//                .reduce(0,(a, b) -> a + b);
//
//
//        System.out.println(i);


//        Map<Boolean, List<Integer>> collect = numbers
//                .stream()
//                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
//        System.out.println("Even numbers"+ collect.get(true));
//        System.out.println("Odd numbers"+ collect.get(false));
//        List<Integer> list = numbers.stream().sorted().toList();
////        System.out.println(list);
//        numbers.stream().max((a,b)->b-a).ifPresent(System.out::println);
    }
}
