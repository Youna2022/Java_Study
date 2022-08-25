package Study02;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class year2016 {
	
	
	public static String solution(int a, int b)  {
		
        String day = "";
//        String temDate = "2016" + a + b;
//        SimpleDateFormat dformet = new SimpleDateFormat("yyyyMMdd");
//        Date nDate = dformet.parse(temDate);
//        
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(nDate);
//        int dayNum = cal.get(Calendar.DAY_OF_WEEK);
        
        LocalDate c = LocalDate.of(2016, a, b);
        DayOfWeek d = c.getDayOfWeek();
        int dayNum = d.getValue();
        
        switch(dayNum) {
        case 1:
        	day = "MON";
        	break;
        case 2:
        	day = "TUE";
        	break;
        case 3:
        	day = "WED";
        	break;
        case 4:
        	day = "THU";
        	break;
        case 5:
        	day = "FRI";
        	break;
        case 6:
        	day = "SAT";
        	break;
        case 7:
        	day = "SUN";
        	break;
        }
  
        return day;
    }
	
	
	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		System.out.println(solution(a, b));
		
		
	}

}

//2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
//a	b	result
//5	24	"TUE"