package br.com.poo2.tartaruga;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;

public class PointTest {
	
	private Point point;

	@Before
	public void setUp(){
		point = new Point(8, 11);
	}
	
	@Test
	public void testaPointInicial(){
		assertThat(point.getX(), equalTo(8));
		assertThat(point.getY(), equalTo(11));
	}
	
	@Test
	public void testaPointSum(){
		Point sum = point.sum(new Point(1,1));
		
		assertThat(sum.getX(), equalTo(9));
		assertThat(sum.getY(), equalTo(12));
	}
	

}
