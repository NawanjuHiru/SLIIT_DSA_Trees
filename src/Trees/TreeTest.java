package Trees;

import java.util.Scanner;

public class TreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree tree = new Tree();
		tree.insert(149, "Anusha");
		tree.insert(167, "Kosala");
		tree.insert(047, "Dinusha");
		tree.insert(066, "Mihiri");
		tree.insert(159, "Jayani");
		tree.insert(118, "Nimal");
		tree.insert(195, "Nishantha");
		tree.insert(034, "Avodya");
		tree.insert(105, "Bimali");
		tree.insert(133, "Sampath");
		
		tree.inOrder();
		System.out.println();
		tree.preOrder();
		System.out.println();
		tree.postOrder1();
		System.out.println();
		
		System.out.println("Enter employee number to find emp.details : ");
		Scanner sc = new Scanner(System.in);
		int empId = sc.nextInt();
		String nameOfEmployee = tree.find(empId).name;
		System.out.println("Name of the Employee is : ");
		System.out.println(nameOfEmployee);
		
		tree.deleteAll();
		System.out.println("Tree is deleted.");
		tree.inOrder();
		
	}

}
