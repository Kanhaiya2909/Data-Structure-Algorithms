package _01Array;
// Example of Storing Object in Array

public class _02Student {
	public int id;
	public String name;
	
	public _02Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) {
		_02Student[] arr = new _02Student[5];
		arr[0] = new _02Student(23, "abc");
		arr[1] = new _02Student(34, "def");
		arr[2] = new _02Student(2, "ghi");
		arr[3] = new _02Student(93, "jkl");
		arr[4] = new _02Student(78, "mno");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element at "+ i+ " is id: "+arr[i].id+ " Name : "+ arr[i].name);
		}
	}

}
