
public class EvenOddCnt {
	
	
	private static int[] solution(int[] num_list) {
        int[] answer = {0,0};
        
        for(int i = 0; i < num_list.length; i++ ) {
            if(num_list[i] % 2 == 0) {
                 answer[1] += 1;
            } else{
                answer[0] +=1;
            }
        }
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5};
		System.out.println("num_list.length --> " + num_list.length);
		System.out.println("answer --> " + solution(num_list));
		
		
	}

}

//num_list	result
//[1, 2, 3, 4, 5]	[2, 3]
//[1, 3, 5, 7]	[0, 4]