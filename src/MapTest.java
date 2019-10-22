import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class MapTest {

	private Map map=new Map();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testMapInit() {
		//fail("Not yet implemented");
		int[][] cell=new int[10][10];
		map.mapInit(cell, 10, 10);
		assertArrayEquals(map.cell_temp,cell);

	}

	@Test
	public void testMapReset() {
		//fail("Not yet implemented");
		int[][] cell=new int[][]{ //十行十列
				{1,1,1,1,1,1,1,1,1,1},
				{0,0,0,0,0,0,0,0,0,0},
				{1,1,1,1,1,1,1,1,1,1},
				{0,0,0,0,0,0,0,0,0,0},
				{1,1,1,1,1,1,1,1,1,1},
				{0,0,0,0,0,0,0,0,0,0},
				{1,1,1,1,1,1,1,1,1,1},
				{0,0,0,0,0,0,0,0,0,0},
				{1,1,1,1,1,1,1,1,1,1},
				{0,0,0,0,0,0,0,0,0,0},
		};
		 map.mapReset(cell, 10, 10);
		 
		assertArrayEquals(map.cell_temp,cell);
	}

	@Test
	public void testMapPlay() {
		//fail("Not yet implemented");
		 int[][] cell=new int[][]{ //十行十列
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
			 map.mapPlay(cell, 10, 10);
			 
			 int[][] cell_1=new int[][]{
					 {0,1,1,1,1,1,1,1,1,0},
					 {0,1,1,1,1,1,1,1,1,0},
					 {0,0,0,0,0,0,0,0,0,0},
					 {0,1,1,1,1,1,1,1,1,0},
					 {0,0,0,0,0,0,0,0,0,0},
					 {0,1,1,1,1,1,1,1,1,0},
					 {0,0,0,0,0,0,0,0,0,0},
					 {0,1,1,1,1,1,1,1,1,0},
					 {0,0,0,0,0,0,0,0,0,0},
					 {0,1,1,1,1,1,1,1,1,0},
			 };
			 assertArrayEquals(cell_1,cell);
		}

	}


