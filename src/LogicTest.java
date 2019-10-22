import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class LogicTest {
	
	private Logic logic=new Logic();
	int[][] cell_test=new int[][]{ //三行三列
			{0,0,0,},
			{1,1,1,},
			{0,0,0,},
	};
	int[][] cell_test1=new int[][]{ //六行六列
			{0,1,1,0,0,0},
			{1,1,1,1,0,0},
			{1,0,1,1,0,0},
			{1,1,1,1,0,0},
			{1,1,0,1,0,0},
			{1,1,1,0,0,0},
	};
	int count_test=0;
	int judge_test = 0;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testCycle() {
		//fail("Not yet implemented");
		count_test=logic.cycle(cell_test, 3, 3, 0, 0);//左上角
		assertEquals(2,count_test);
		
		count_test=logic.cycle(cell_test, 3, 3, 2, 0);//左下角
		assertEquals(2,count_test);
		
		count_test=logic.cycle(cell_test, 3, 3, 0, 2);//右上角
		assertEquals(2,count_test);
		
		count_test=logic.cycle(cell_test, 3, 3, 2, 2);//右下角
		assertEquals(2,count_test);
		
		count_test=logic.cycle(cell_test, 3, 3, 0, 1);//上边
		assertEquals(3,count_test);
		
		count_test=logic.cycle(cell_test, 3, 3, 2, 1);//下边
		assertEquals(3,count_test);
		
		count_test=logic.cycle(cell_test, 3, 3, 1, 0);//左边
		assertEquals(1,count_test);
		
		count_test=logic.cycle(cell_test, 3, 3, 1, 2);//右边
		assertEquals(1,count_test);
		
		count_test=logic.cycle(cell_test, 3, 3, 1, 1);//中间
		assertEquals(2,count_test);
	}

	@Test
	public void testJudge_cell() {
		//fail("Not yet implemented");
		judge_test=logic.judge_cell(0, cell_test1, 0, 5);//周围0个活细胞
		assertEquals(0,judge_test);
		
		judge_test=logic.judge_cell(1, cell_test1, 0, 4);//周围1个活细胞
		assertEquals(0,judge_test);
		
		judge_test=logic.judge_cell(2, cell_test1, 5, 3);//周围2个活细胞
		assertEquals(cell_test1[5][3],judge_test);
		
		judge_test=logic.judge_cell(3, cell_test1, 0, 0);//周围3个活细胞
		assertEquals(1,judge_test);
		
		judge_test=logic.judge_cell(4, cell_test1, 0, 1);//周围4个活细胞
		assertEquals(0,judge_test);
		
		judge_test=logic.judge_cell(5, cell_test1, 4, 0);//周围5个活细胞
		assertEquals(0,judge_test);
		
		judge_test=logic.judge_cell(6, cell_test1, 3, 2);//周围6个活细胞
		assertEquals(0,judge_test);
		
		judge_test=logic.judge_cell(7, cell_test1, 4, 2);//周围7个活细胞
		assertEquals(0,judge_test);
		
		judge_test=logic.judge_cell(8, cell_test1, 2, 1);//周围8个活细胞
		assertEquals(0,judge_test);
	}

}
