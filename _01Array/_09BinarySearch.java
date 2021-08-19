package _01Array;

public class _09BinarySearch {
	public int binarySearch(int[] arr, int key) {
		if (arr == null) {
			throw new IllegalArgumentException("Your array is empty");
		}
		int low = 0;
		int large = arr.length -1;
		
		while (large >= low) {
			
			int mid = (low + large)/2;
			
		if (arr[mid] == key) {
			return mid;
		}
		if (key < arr[mid]) {
			large = mid -1;
		}else {
			low = mid +1;
		}
	}
		return -1;
	}
	public static void main(String[] args) {
		_09BinarySearch binarySearch = new _09BinarySearch();
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(binarySearch.binarySearch(arr, 9));
	}

}
