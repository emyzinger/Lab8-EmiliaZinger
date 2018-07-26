package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestWordCounter {

  // TO DO complete this test class

  // TO DO declare a reference to the SUT (system under test), i.e., WordCounter
  private WordCounter fixture;

  @Before
  public void setUp() {
    Map<String, Integer> wordMap= new HashMap<String, Integer>();
    fixture = new WordCounter(wordMap);
  }

  @After
  public void tearDown() {
    fixture = null;
  }

  @Test
  public void testGetCountEmpty() {
    assertTrue(fixture.getCounts().isEmpty());

  }

  @Test
  public void testGetCountNonEmpty() {
    fixture.countWords(Arrays.asList("Hey", "Hey", "how", "are", "you").iterator());
    assertEquals(fixture.getCount("Hey"), 2);
    assertEquals(fixture.getCount("are"), 1);
    assertEquals(fixture.getCount("youre"), -1);
    //int youre = fixture.getCount("youre");
    //System.out.println(youre);
    assertEquals(fixture.getCount("Bobby"), -1);
    // TO DO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator


  }
}
