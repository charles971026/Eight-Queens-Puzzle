import java.util.ArrayList;
import java.util.Arrays;

public class EightQueenExamine {
	
	public static ArrayList<Queen> queens = new ArrayList<Queen>();
	public static ArrayList<String[]> solutions = new ArrayList<String[]>();
	public static void createArrayList(){
		for(int i = 0; i < 8; i++){
			queens.add(new Queen());
		}
	}
	
	public static void examine(int num){
		
		if(num == 0){
			queens.get(num).setRow(num + 1);
			for(int i = 1; i <= 8; i ++){
				queens.get(num).setCol(i);;
				examine(num + 1);
			}
		}
		else{
			ArrayList<Integer> cols = new ArrayList<Integer>();
			for(int i = 0; i < num; i++){
				cols.add(queens.get(i).col);
			}
			queens.get(num).row = num + 1;
			for(int i = 1; i <=8; i ++){
				
				ArrayList<Double> slopes = new ArrayList<Double>();
				for(int k = 0; k < num; k++){
					slopes.add(Math.abs((double)(queens.get(k).row - (num + 1))/(queens.get(k).col - i)));
				}
				
				if(cols.contains(i)){
					continue;
				}else if(slopes.contains((double)1)){
					continue;
				}
				else{
					queens.get(num).setCol(i);
					//System.out.println(num);
					if(num == 7){
						//System.out.println("num == 7");
						solutions.add(new String[]{queens.get(0).position,queens.get(1).position,queens.get(2).position,queens.get(3).position,
								queens.get(4).position,queens.get(5).position,queens.get(6).position,queens.get(7).position});
						break;
					}else{
						examine(num + 1);
					}
					
				}
			}
			
		}
		
		
	}
	public static void main(String[] args){
		createArrayList();
		examine(0);
		int count = 1;
		for(String[] e: solutions){
			System.out.println(Arrays.toString(e) + count);
			count++;
		}
		System.out.println(solutions.size());
	}

}
