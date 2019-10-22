import java.util.TimerTask;
import java.util.concurrent.*;

public class Time extends TimerTask{

	private Map map;
	private int[][] cell;
	
	Time(Map map,int cell[][]){
		this.map=map;
		this.cell=cell;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		 map.mapPlay(cell, 10, 10);
		 map.mapOut(cell, 10, 10);
	}
}
