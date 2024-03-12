package com.learning.core.day5;

	import java.util.Comparator;
	import java.util.TreeSet;

	class Person4 implements Comparable<Person4> {
	    private int id;
	    private String name;
	    private int age;
	    private double salary;

	    public Person4(int id, String name, int age, double salary) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    @Override
	    public String toString() {
	        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        Person4 person = (Person4) obj;
	        return id == person.getId();
	    }

	    @Override
	    public int hashCode() {
	        return id;
	    }

	    @Override
	    public int compareTo(Person4 other) {
	        return Integer.compare(this.id, other.id);
	    }
	}

	public class D05P10 {
	    public static void main(String[] args) {
	        TreeSet<Person4> persons = new TreeSet<>(Comparator.comparingInt(p -> p.getName().charAt(0)));
	        persons.add(new Person4(1, "Jerry", 32, 999.0));
	        persons.add(new Person4(2, "Smith", 42, 2999.0));
	        persons.add(new Person4(3, "Popeye", 52, 5999.0));
	        persons.add(new Person4(4, "Jones", 62, 6999.0));
	        persons.add(new Person4(5, "John", 22, 1999.0));
	        persons.add(new Person4(6, "Tom", 32, 3999.0));

	        Person4 firstPersonWithNameStartingWithJ = persons.first();
	        System.out.println(firstPersonWithNameStartingWithJ);
	    }
	}

