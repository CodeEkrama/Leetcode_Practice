package com.java8.learning;
//Collection ->  represent a group of objects as a single entity then we go for Collection
//Streams -> If we want to process objects from the Collections, we use streams
			//Stream is an interface defined in Java.util.stream package

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 
 */

public class Streams {
	//filter(Predicate)   -------- Predicate returns boolean value
	//map(Function) -------------- Returns any type of value
	static void demoFilter() {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(56);
		l.add(15);
		l.add(76);
		l.add(23);
		//values added
		
		System.out.println("Original :"+l);  //original list
		//To get only even numbers
//		List<Integer> l2= l.stream()     //got the stream of objects
//				.filter(i->i%2==0)			//filtered the elements
//				.collect(Collectors.toList());     //collected to list
		List<Integer> l2=l.stream()
				.filter(i->i%2==0)
				.collect(Collectors.toList());
		System.out.println("Filtered :"+l2);
		System.out.println("-------------------------------------------------------");
	}
	static void demoMap() {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(46);
		marks.add(46);
		marks.add(78);
		marks.add(90);
		marks.add(48);
		marks.add(68);
		marks.add(45);
		marks.add(29);
		System.out.println(marks);
		//We want to do some mathematic operation on each marks
		List<Integer> updatedMarks=marks.stream()
				.filter(i->(i<50))  
				.map(i->i+10)     //adds 10 in each element
				.collect(Collectors.toList());
		//results in a concise code using functional programming-> biggest upgrade
		System.out.println(updatedMarks);
		System.out.println("-------------------------------------------------------");
		//JAVA vs Python
	}
	
	//  In JAVA 10:
	// we can initialize any variable without mentioning the type (dynamic programming) : var x=10;
	//for every 6 months they are introducing a new version of java due to the increasing competition (python)
	//backward compatibility is a big problem in java => restrictions to add new features
	//python 3 is independant of python 2 i.e. no backward compatibility
	
	
	//processing by count method
	static void demoCount() {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(46);
		marks.add(34);
		marks.add(78);
		marks.add(90);
		marks.add(48);
		marks.add(68);
		marks.add(45);
		marks.add(29);
		System.out.println(marks);
		//count the number of failed students | cutoff=40
		
		Long noOfFailedStudents=marks.stream()
				.filter(m->m<40)
				.count();
		System.out.println("Failed: "+noOfFailedStudents);
		System.out.println("--------------------------------------------");
	}
	
	//processing by sorted method (ascending)
	static void demoSorted1() {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(46);
		marks.add(34);
		marks.add(78);
		marks.add(90);
		marks.add(48);
		marks.add(68);
		marks.add(45);
		marks.add(29);
		System.out.println(marks);
		
		List<Integer> sortedList=marks.stream()
				.sorted()   //default-> ascending
				//for descending we use Comparator object
				.collect(Collectors.toList());
		System.out.println("Ascending Sort: "+sortedList);
		System.out.println("--------------------------------------------");
	}
	//using manual comparator
	/*
	 * Comparator ----> compare(o1,o2)
	 * returns -ve iff o1 has to come before o2
	 * if(o1<o2)?1:(o1>o2):-1:0
	 * 
	 */

	static void demoSortedComparator() {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(46);
		marks.add(34);
		marks.add(78);
		marks.add(90);
		marks.add(48);
		marks.add(68);
		marks.add(45);
		marks.add(29);
		System.out.println(marks);
		//<condition>?<execute if true>:<execute if false>
		
		List<Integer> sortedList=marks.stream()
				.sorted((o1,o2)->(o1>o2)?-1:(o1<o2)?1:0)
				.collect(Collectors.toList());
		System.out.println("Descending Sort: "+sortedList);
		System.out.println("--------------------------------------------");
	}
	 /* Comparable interface -------> compareTo()
	  * o1,o2  ----> o1.compareTo(o2)    #happening internally by default results in ascending sorting
	  * o2.compareTo(o1) 
	  * -o1.compareTo(o2)
	  */
	
	//using Comparable interface (default sort)
	static void demoSortedComparableDefault() {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(46);
		marks.add(34);
		marks.add(78);
		marks.add(90);
		marks.add(48);
		marks.add(68);
		marks.add(45);
		marks.add(29);
		System.out.println(marks);
		
		List<Integer> sortedList=marks.stream()
				.sorted((o1,o2)->o1.compareTo(o2))
				.collect(Collectors.toList());
		System.out.println("Ascending Sort: "+sortedList);
		System.out.println("--------------------------------------------");
	}
	
	static void demoSortedComparableDescending() {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(46);
		marks.add(34);
		marks.add(78);
		marks.add(90);
		marks.add(48);
		marks.add(68);
		marks.add(45);
		marks.add(29);
		System.out.println(marks);
		
		List<Integer> sortedList=marks.stream()
				.sorted((o1,o2)->-o1.compareTo(o2))  //just add '-'  or interchange arguments
				.collect(Collectors.toList());
		System.out.println("Descending Sort: "+sortedList);
		System.out.println("--------------------------------------------");
	}
	
	//Sorting strings
	static void demoSortStrings() {
		ArrayList<String> l=new ArrayList<String>();
		l.add("Sunny");
		l.add("Ganesh");
		l.add("Sapeksh");
		l.add("Atif");
		l.add("Jubin");
		
		System.out.println(l);
		
		List<String> sortedList=l.stream()
				.sorted((s1,s2)-> s2.compareTo(s1))  //no arguments passed
				.collect(Collectors.toList());
		System.out.println("Descending : "+sortedList); //alphabetical
		System.out.println("--------------------------------------------");
	}
	/*
	 * (s1,s2)->s1.compareTo(s2) ===> Natural/Ascending
	 * (s1,s2)-> s2.compareTo(s1) ===> Reverse sort
	 * (s1,s2)->  -s1.compareTo(s2) ===> Reverse sort
	 * implement in above method
	 */
	//sorted 
	static void demoSortStringLength() {  //sorting w.r.t. lengths in ascending
		ArrayList<String> l=new ArrayList<String>();
		l.add("Sunny Deol");
		l.add("Ganesh Hegde");
		l.add("Sapeksh Deshwal");
		l.add("Atif Aslam");
		l.add("Jubin");
		
		System.out.println(l);
		Comparator<String> xys=(s1,s2)-> {  //functional interface
			int l1=s1.length();
			int l2=s2.length();
			if(l1<l2) return -1;
			else if(l1>l2) return +1;
			else return s1.compareTo(s2);
		};
		List<String> sortedList=l.stream()
				.sorted(xys) 
				.collect(Collectors.toList());
		System.out.println("Natural/Default Sort: "+sortedList); //length-wise
		System.out.println("--------------------------------------------");
	}
	
	//min element n max element operations
	/*
	 * min() and max() needs Comparator object as a parameter
	 */
	static void demoMinMax() {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(46);
		marks.add(34);
		marks.add(78);
		marks.add(90);
		marks.add(48);
		marks.add(68);
		marks.add(45);
		marks.add(29);
		System.out.println(marks);
		
		Integer min=marks.stream()
				.min((o1,o2)->o1.compareTo(o2)).get(); //natural sorting order (ascending)
		Integer max=marks.stream()
				.max((o1,o2)->o1.compareTo(o2)).get();  //natural
		System.out.println("Minimum value : "+min);
		System.out.println("Maximum value : "+max);
		System.out.println("--------------------------------------------");
	}
	//Without these we would have written atleast 10-15 lines of code which we did in a single line
	
/*
 * -------------------------------------------------------------------------------------------------
 */
	//PROCESS EACH ELEMENT IN A COLLECTION
	
	static void demoForEach() {
		//SYNTAX:     marks.stream.forEach(function)
		//we don't need to use iterators if we use this
		
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(46);
		marks.add(34);
		marks.add(78);
		marks.add(90);
		marks.add(48);
		marks.add(68);
		marks.add(45);
		marks.add(29);
		
		marks.stream().forEach(System.out::println);   //pritln funciton from System.out object
		System.out.println("------------------------------------------------");
		marks.stream().forEach(i->{
			System.out.println("The square of "+i+" is: "+(i*i));
		});
		System.out.println("------------------------------------------------");
	}
	/*
	 * creating objects:
	 * (Employee::new)   ====> returns an object of Employee
	 * (Integer[]::new)   ===> returns an object of Integer array
	 */
	//USING toArray() method
	//toArray() takes objects as parameters
	static void demoToArray() {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(46);
		marks.add(34);
		marks.add(78);
		marks.add(90);
		marks.add(48);
		marks.add(68);
		marks.add(45);
		marks.add(29);
		Integer[] i=marks.stream().toArray(Integer[]::new);
		System.out.println(marks);
		System.out.println("4th element is : "+i[3] );
		System.out.println("------------------------------------------------");
	}
	// Streams concept is applicable for any group of values

	static void demoStreamOf() {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(46);
		marks.add(34);
		marks.add(78);
		marks.add(90);
		marks.add(48);
		marks.add(68);
		marks.add(45);
		marks.add(29);
		Integer[] i=marks.stream().toArray(Integer[]::new);
		//getting streams of array i[] 
		List<Integer> list=Stream.of(i)    //marks.stream()
		.filter(ele-> (ele>40 && ele<=50))
		.map(j->j+20)
		.collect(Collectors.toList());
		System.out.println(list);
//		.forEach(i2->{
//			System.out.println(i2);
//		});
		System.out.println("------------------------------------------------");
	}
	//we can implement this on any type of collected data
	static void demoStreamOfAny() {
		Stream<String> s=Stream.of("9","43.5","2984","985","4","0"); //storing stream of data
		s.forEach(System.out::println);
	}
	public static void main(String[] args) {
		demoFilter();
		demoMap();
		demoCount();
		demoSorted1();
		demoSortedComparator();
		demoSortedComparableDefault();
		demoSortedComparableDescending();
		demoSortStrings();
		demoSortStringLength();
		demoMinMax();
		demoForEach();
		demoToArray();
		demoStreamOf();
		demoStreamOfAny();
	}
	
//	sorted
//	min()
//	max()
//	filter
//	compareTo
//	stream()
//	map()
//	Stream.of(null)
//	toArray
//	count
//	Comparator
//	Comparable
//	sorted
//	lambda
}
