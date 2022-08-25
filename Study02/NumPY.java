package Study02;

public class NumPY {

	static boolean solution(String s) {
		s = s.toUpperCase();
		String[] arr = s.split("");
		int p = 0;
		int y = 0;
		
		for(int i= 0; i<arr.length; i++) {
			if(arr[i].equals("P")) {
				p++;
			}else if(arr[i].equals("Y")) {
				y++;
			}
		}
        return p == y;
    }
	
	public static void main(String[] args) {
		String py = "Pyy";
		boolean ans = solution(py);
		System.out.println(ans);
	}

}
//"pPoooyY"	true
//"Pyy"	false