
public class Map {

	private Logic L = new Logic();
	public final int[][] cell_temp=new int[][]{ //十行十列
			{0,0,0,0,0,0,0,0,0,0},
			{1,1,1,1,1,1,1,1,1,1},
			{0,0,0,0,0,0,0,0,0,0},
			{1,1,1,1,1,1,1,1,1,1},
			{0,0,0,0,0,0,0,0,0,0},
			{1,1,1,1,1,1,1,1,1,1},
			{0,0,0,0,0,0,0,0,0,0},
			{1,1,1,1,1,1,1,1,1,1},
			{0,0,0,0,0,0,0,0,0,0},
			{1,1,1,1,1,1,1,1,1,1},
	};
	
	public void mapInit(int cell[][],int row,int col){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				cell[i][j]=i%2;
			}
		}
	}
	
	public void mapReset(int cell[][],int row,int col){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				//cell[i][j]=((int)(1+Math.random()*100))%2;
				//cell[i][j]=cell[j][i];
				cell[i][j]=(cell[i][j]+1)%2;
			}
		}
	}
	
	public void mapPlay(int cell[][],int row,int col){
		int[][] new_cell=new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				int count=L.cycle(cell, row, col, i, j);
				new_cell[i][j]=L.judge_cell(count,cell,i,j);
			}
		}
	System.arraycopy(new_cell, 0, cell, 0, new_cell.length);
		
	}
	
	public void mapOut(int cell[][],int row,int col){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(cell[i][j]==1)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.print('\n');
		}
	}
	
}
