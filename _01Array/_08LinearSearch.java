package _01Array;

public class _08LinearSearch {
	public int search(int[] arr, int x) {
		if (arr == null) {
			throw new IllegalArgumentException("Your Array is null");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		_08LinearSearch lSearch = new _08LinearSearch();
		int[] arr = {2,3,4,5,6,7,8,9};
		System.out.println("At Index : "+lSearch.search(arr, 8));
	}

}
