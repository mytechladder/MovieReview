package com.mytechladder.moviereview;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.*;

import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mytechladder.moviereview.controller.ReviewController;

//@RunWith(SpringRunner.class)
@SpringBootTest
class MovieReviewApplicationTests {

	@Autowired
	  private  ReviewController controller;
	
	@Test
	  public void contexLoads() throws Exception {
	    assertNotNull(controller);
	  }

}
