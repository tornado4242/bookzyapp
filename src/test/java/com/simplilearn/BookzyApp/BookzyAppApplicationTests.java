package com.simplilearn.BookzyApp;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookzyAppApplicationTests {

	    private BookzyAppApplication analyser = new BookzyAppApplication();
	        @Test	 
		    public void testWordCount() {     	 
			       	 assertEquals(7,analyser.getWordCount("Train to win in the digital economy"));	 
				     }
}
