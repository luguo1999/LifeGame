package Frame;

import java.awt.EventQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
	
		public static void main(String[] args) {
			/*EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {*/
						final int cell[][]=new int[30][30];//0Ϊ��ϸ����1Ϊ��ϸ��
						Lifegame frame = new Lifegame(cell,30,30);
						frame.setVisible(true);
					/*} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
*/
	}
}
