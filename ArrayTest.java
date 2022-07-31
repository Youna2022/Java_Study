import java.io.PrintWriter;
import java.util.Iterator;

public class ArrayTest {
	int sum = 0;
	double avg = 0;
	int max;
	int min;
	int evenCount;
	int oddCount;
	
	
	void print(int [] arr) {
		System.out.print("array : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
	
	int max(int[] arr) {
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	int min(int[]arr) {
		int min = 100;
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	int evenCount(int[]arr) {
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] %2 == 0) {
				cnt++;
			}
		}
		return cnt;
	}
	
	int oddCount(int[]arr) {
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] %2 == 1) {
				cnt++;
			}
		}
		return cnt;
	}
	
	int sum(int[]arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	double avg(int[]arr) {
		double avg = 0;
		avg = (double) sum(arr) / arr.length;
		return avg;
	}
	
	
	public static void main(String[] args) {
		int [] array = new int[10];
		ArrayTest arrayTest = new ArrayTest();
		int i = 0;
		for(int arr : array) {
			array[i] = (int) (Math.random()*100) + 1;
			i++;
		}
		
		int[] test = {};
		
		
		
		System.out.println("할당된 배열의 크기 : " + array.length );
		arrayTest.print(array);
		System.out.println("가장 큰 값 : " + arrayTest.max(array));
		System.out.println("가장 작은 값 : " + arrayTest.min(array));
		System.out.println("짝수의 개수 : "  + arrayTest.evenCount(array));
		System.out.println("홀수의 개수 : " + arrayTest.oddCount(array));
		System.out.println("합계 : " + arrayTest.sum(array));
		String formattStriAVG = String.format("%.2f", arrayTest.avg(array));
		System.out.println("평균 : " + formattStriAVG);
//		Math.random()
		
		
		
		
		
		
	}

}
