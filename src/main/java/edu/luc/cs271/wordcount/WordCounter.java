package edu.luc.cs271.wordcount;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/** A map-based class for counting word frequencies from an iterator. */
public class WordCounter {

  /** The map for storing the word counts. */
  private final Map<String, Integer> theMap;

  /** Creates a word counter instance based on the given map. */
  public WordCounter(final Map<String, Integer> theMap) {
    this.theMap = theMap;

  }

  /** Counts the frequencies of all words in the given iterator. */
  public void countWords(final Iterator<String> words) {
    while(words.hasNext()){
      String thisString = words.next();
      int count = theMap.getOrDefault(thisString, 0); //checking how many times ive seen the word
      count++; //having seen it one more time
      theMap.put(thisString, count); //updating the number of times its been seen
    }
  }

  /** Retrieve the frequency of a particular word. */
  public int getCount(final String word) {
        int count = theMap.getOrDefault(word, -1);
    return count;

  }

  /** Retrieve the map representing all word frequencies. */
  public Map<String, Integer> getCounts() {
    return Collections.unmodifiableMap(theMap);
  }
}
