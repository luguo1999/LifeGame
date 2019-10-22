package Frame;

public class Logic {

	public void reset(int cell[][],int row,int col){
		//随机数重置
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				//cell[i][j]=((int)(1+Math.random()*100))%2;
				cell[i][j]=cell[j][i];
			}
		}
	}
	public void init(int cell[][],int row,int col){
		//特殊图案初始化
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				cell[i][j]=i%2;
			}
		}
	}
	 
	public void cycle(int cell[][],int row,int col){
		//循环一次游戏
		int[][] new_cell=new int[row][col];
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				int count=0;
			    if(((i-1)>=0)&&((j-1)>=0)&&((i+1)<row)&&((j+1)<col)){
			    	count=cell[i-1][j-1]+cell[i-1][j]+cell[i-1][j+1]+
			    			cell[i][j-1]+cell[i][j+1]+
			    			cell[i+1][j-1]+cell[i+1][j]+cell[i+1][j+1];
			    }
			    else if(i-1<0){
			    	if(j==0){
			    		count=cell[i][j+1]+cell[i+1][j]+cell[i+1][j+1];
			    	}
			    	else if(j==col-1){
			    		count=cell[i][j-1]+cell[i+1][j-1]+cell[i+1][j];
			    	}
			    	else{
			    		count=cell[i][j-1]+cell[i][j+1]+
			    				cell[i+1][j-1]+cell[i+1][j]+cell[i+1][j+1];
			    	}
			    }
			    else if((i+1)==row){
                    if(j==0){
			    		count=cell[i-1][j]+cell[i-1][j+1]+cell[i][j+1];
			    	}
			    	else if(j==col-1){
			    		count=cell[i-1][j-1]+cell[i-1][j]+cell[i][j-1];
			    	}
			    	else{
			    		count=cell[i-1][j-1]+cell[i-1][j]+cell[i-1][j+1]+
				    			cell[i][j-1]+cell[i][j+1];
			    	}
			    }
			    else if(j-1<0){
			    	count=cell[i-1][j]+cell[i-1][j+1]+cell[i][j+1]+
			    			cell[i+1][j]+cell[i+1][j+1];
			    }
			    else if((j+1)==col){
			    	count=cell[i-1][j-1]+cell[i-1][j]+cell[i][j-1]+
			    			cell[i+1][j-1]+cell[i+1][j];
			    }
			    //判断下一次生命状态
			   if(count>=4) new_cell[i][j]=0;
			   else if(count==3) new_cell[i][j]=1;
			   else if(count==2) new_cell[i][j]=cell[i][j];
			   else new_cell[i][j]=0;
			}
		}
		System.arraycopy(new_cell, 0, cell, 0, new_cell.length);
	}
}

