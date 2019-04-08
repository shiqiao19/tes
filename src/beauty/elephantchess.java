package beauty;

public class elephantchess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//中国象棋将帅问题
		//1   2   3
		//4   5   6
		//7   8   9
		byte i = 81;
		while(i>0) {
			i--;
			if(i/9%3==i%9%3)
				continue;
			System.out.println("a "+(i/9+1)+" b "+(i%9+1));
		}
		//81 9 9  0 0
		//80 8 8  2 2
		//79 8 7  2 1    9 8        
		//78 8 6  2 0    9 7
		
	}

}
