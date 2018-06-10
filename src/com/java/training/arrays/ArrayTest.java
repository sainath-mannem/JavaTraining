package com.java.training.arrays;

public class ArrayTest {

	class Employee {
		private int id;
		private String name;
		public Employee(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + "]";
		}
		
		
	}
	
	public static void main(String[] args) {
		ArrayTest atest = new ArrayTest();
		/*int[] intArray = new int[10];
		intArray[0] = 1;
		intArray[4] = 2;
		printArray(intArray);
		
		atest.testEmpArray();*/
		
		//atest.testArrayLiterals();
		//printArray(new int[]{1, 2, 3,4});
		int[] intArray = new int[10];
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		printArray(intArray);
		insertArray(intArray, 2, 5);
		printArray(intArray);
		removeArray(intArray, 2);
		printArray(intArray);
		findMinMaxInArray(intArray);
	}

	private static void findMinMaxInArray(int[] intArray) {

		int minVal = Integer.MAX_VALUE;

		for(int i=0; i < intArray.length; i++){
		    if(intArray[i] < minVal){
		        minVal = intArray[i];
		    }
		}

		System.out.println("minVal = " + minVal);
		

		int maxVal = Integer.MIN_VALUE;
		for(int i=0; i < intArray.length; i++){
		    if(intArray[i] > maxVal){
		        maxVal = intArray[i];
		    }
		}
		System.out.println("maxVal = " + maxVal);
	}

	private static void removeArray(int[] intArray, int removeIndex) {
		for(int i = removeIndex; i < intArray.length -1; i++){
			intArray[i] = intArray[i + 1];
		}
	}

	private static void insertArray(int[] intArray, int insertPosition, int number) {
		for(int i=intArray.length-1; i > insertPosition; i--){
			intArray[i] = intArray[i-1];
		}
		intArray[insertPosition] = number;
	}

	private void testArrayLiterals() {
		//int[] intArray = new int[] {1, 2, 3,4};
		int[] intArray = {1, 2, 3,4};
		System.out.println(intArray.length);
		printArray(intArray);
	}

	private void testEmpArray() {
		Employee[] empArray = new Employee[10];
		for(int i=0; i<empArray.length; i++) {
			empArray[i] = new Employee(i, "Person "+i);
		}
		
		for (Employee employee : empArray) {
			System.out.println(employee);
		}
	}

	private static void printArray(int[] intArray) {
		System.out.print("[");
		for(int i = 0; i<intArray.length; i++) {
			System.out.print(intArray[i]);
		}
		System.out.println("]");
	}
}
