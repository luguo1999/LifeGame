package Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JTextField;

public class Lifegame extends JFrame {

	private JPanel contentPane;
	private final Logic L = new Logic();
	int num;
	private Timer timer = new Timer();
		/*
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Lifegame(final int cell[][],final int row,final int col) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		final JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
	
		JButton btnNewButton = new JButton("经典地图");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=0;
				timer.cancel();
				timer=new Timer();
				final Graphics g=contentPane.getGraphics();
				clearMap(g,row,col);
				L.init(cell, row, col);
				paintMap(g,cell,row,col);
				
				 TimerTask task = new TimerTask() {
					  public void run() {
						  clearMap(g,row,col);
						  L.cycle(cell, row, col);
						  paintMap(g,cell,row,col);
					    	
						  num++;
						  setTitle("这是第"+num+"次变化");
					  }  
				 };
				 timer.schedule(task, 0, 1000);// 1秒一次
			}
		});
		btnNewButton.setBounds(19, 213, 113, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("重置地图");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=0;
				//repaint();
				timer.cancel();
				timer=new Timer();
				final Graphics g=contentPane.getGraphics();
				clearMap(g,row,col);
		    	L.reset(cell, row, col);//重置地图
		    	paintMap(g,cell,row,col);
		    	
				TimerTask task = new TimerTask() {
					  public void run() {
						  clearMap(g,row,col);
						  L.cycle(cell, row, col);
						  paintMap(g,cell,row,col);
						  num++;
						  setTitle("这是第"+num+"次变化");
					  }
				 };
				 timer.schedule(task, 0, 1000);// 1秒一次
			}
			
		});
		btnNewButton_1.setBounds(159, 213, 113, 27);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("停止游戏");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=0;
				setTitle("这是第"+num+"次变化");
				timer.cancel();
				//repaint();
				Graphics g=contentPane.getGraphics();
				clearMap(g,row,col);
				paintLine(g,row,col);
			}
		});
		btnNewButton_2.setBounds(305, 213, 113, 27);
		contentPane.add(btnNewButton_2);
		
	}
    public void paintLine(Graphics g,final int row,final int col){
    	int temp=(int)(170/row);
    	for(int i=0;i<row;i++) {
    		for(int j=0;j<col;j++) {
    			g.drawRect(j*temp+129, i*temp+10, temp, temp);
    		}
	}
    }
    public void paintMap(Graphics g,final int cell[][],final int row,final int col){
    	int temp=(int)(170/row);
    	for(int i=0;i<row;i++) {
    		for(int j=0;j<col;j++) {
    			if(cell[i][j]==1) {
    				g.fillRect(j*temp+129, i*temp+10, temp, temp);
    			}
    			else {
    				g.drawRect(j*temp+129, i*temp+10, temp, temp);
    			}
    		}
    	}
    }
    public void clearMap(Graphics g,final int row,final int col){
    	int temp=(int)(170/row);
    	g.clearRect(129, 10, temp*row, temp*col);
    }
}
