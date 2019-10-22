import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class LogicTest {
	
	private Logic logic=new Logic();
	int[][] cell_test=new int[][]{ //��������
			{0,0,0,},
			{1,1,1,},
			{0,0,0,},
	};
	int[][] cell_test1=new int[][]{ //��������
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
		count_test=logic.cycle(cell_test, 3, 3, 0, 0);//���Ͻ�
		assertEquals(2,count_test);
		
		count_test=logic.cycle(cell_test, 3, 3, 2, 0);//���½�
		assertEquals(2,count_test);
		
		count_test=logic.cycle(cell_test, 3, 3, 0, 2);//���Ͻ�
		assertEquals(2,count_test);
		
		count_test=logic.cycle(cell_test, 3, 3, 2, 2);//���½�
		assertEquals(2,count_test);
		
		count_test=logic.cycle(cell_test, 3, 3, 0, 1);//�ϱ�
		assertEquals(3,count_test);
		
		count_test=logic.cycle(cell_test, 3, 3, 2, 1);//�±�
		assertEquals(3,count_test);
		
		count_test=logic.cycle(cell_test, 3, 3, 1, 0);//���
		assertEquals(1,count_test);
		
		count_test=logic.cycle(cell_test, 3, 3, 1, 2);//�ұ�
		assertEquals(1,count_test);
		
		count_test=logic.cycle(cell_test, 3, 3, 1, 1);//�м�
		assertEquals(2,count_test);
	}

	@Test
	public void testJudge_cell() {
		//fail("Not yet implemented");
		judge_test=logic.judge_cell(0, cell_test1, 0, 5);//��Χ0����ϸ��
		assertEquals(0,judge_test);
		
		judge_test=logic.judge_cell(1, cell_test1, 0, 4);//��Χ1����ϸ��
		assertEquals(0,judge_test);
		
		judge_test=logic.judge_cell(2, cell_test1, 5, 3);//��Χ2����ϸ��
		assertEquals(cell_test1[5][3],judge_test);
		
		judge_test=logic.judge_cell(3, cell_test1, 0, 0);//��Χ3����ϸ��
		assertEquals(1,judge_test);
		
		judge_test=logic.judge_cell(4, cell_test1, 0, 1);//��Χ4����ϸ��
		assertEquals(0,judge_test);
		
		judge_test=logic.judge_cell(5, cell_test1, 4, 0);//��Χ5����ϸ��
		assertEquals(0,judge_test);
		
		judge_test=logic.judge_cell(6, cell_test1, 3, 2);//��Χ6����ϸ��
		assertEquals(0,judge_test);
		
		judge_test=logic.judge_cell(7, cell_test1, 4, 2);//��Χ7����ϸ��
		assertEquals(0,judge_test);
		
		judge_test=logic.judge_cell(8, cell_test1, 2, 1);//��Χ8����ϸ��
		assertEquals(0,judge_test);
	}

}
