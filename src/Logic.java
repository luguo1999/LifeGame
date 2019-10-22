import java.math.*;

public class Logic {


	public int cycle(int cell[][],int row,int col,int i,int j){
		//循环一次游戏
		
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
			    return count;
	}
	
	public int judge_cell (int count,int cell[][],int i,int j){
		   
		   if(count==3) return 1;
		   else if(count==2) return cell[i][j];
		   else return 0;
		
	}

}
