
public class Queen {
	
	public int row;
	public int col;
	private String colToAlpha;
	public String position;
	
	public void setRow(int row){
		
		this.row = row;
	}
	
	public void setCol(int col){
		this.col = col;
		setColToAlpha();
	}
	
	private void setColToAlpha(){
		
		if(this.col == 1){
			colToAlpha = "a";
		}else if(this.col == 2){
			colToAlpha = "b";
		}else if(this.col == 3){
			colToAlpha = "c";
		}else if(this.col == 4){
			colToAlpha = "d";
		}else if(this.col == 5){
			colToAlpha = "e";
		}else if(this.col == 6){
			colToAlpha = "f";
		}else if(this.col == 7){
			colToAlpha = "g";
		}else if(this.col == 8){
			colToAlpha = "h";
		}
		
		position = row + colToAlpha;
	}
	
	

}
