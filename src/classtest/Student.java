package classtest;

public class Student {
	
	int score;
	
	public void play (int hours) {
		score-=hours;
		System.out.println("你休息了:"+hours+"小時，總計扣:"+hours+"分");}
	
	
	public void study (int hours) {
		score+=hours;
		System.out.println("你讀書了:"+hours+"小時，總計加:"+hours+"分");}
	
	public void scoreprint (int phours,int shours ) {
		System.out.println("總計得分:"+score);
	}

	
	public static void main(String[]args) {
		Student s1 = new Student();
		s1.score = 80;
		
		s1.play(8);
		s1.study(5);
		
		//System.out.println(s1.score);
		s1.scoreprint(8,5);
	}
	
	}

