
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class Main {

	public static void main(String[] args){
		final int cell[][]=new int[10][10];//0Ϊ��ϸ����1Ϊ��ϸ��
	    final Map map = new Map();
	    map.mapInit(cell, 10, 10);
	    map.mapOut(cell, 10, 10);
	    
	    Timer timer = new Timer();
	    timer.schedule(new Time(map,cell), 0, 1000);// 1��һ��

	}
}
