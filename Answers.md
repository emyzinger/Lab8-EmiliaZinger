**Try using a TreeMap instead of a HashMap. Does this make any difference?**
	When running TreeMap instead of HashMap there is no difference in the output of the program. Both ways run the program fairly quickly and both have the same results. 

**What happens if you invoke countWords multiple times for different String iterators?**
	If you invoke countWords multiple times for different String iterators the wordCounter will total up the words from the two iterators into the same map. This causes there to be more words which are counted and then there is a higher chance of collisions in the words. 

**What crucial role does the Iterator abstraction play in making WordCounter testable?**
The Iterator abstraction allows the test class to create multiple different iterators to test it, and it allows it to create iterators in different ways that will still work with the word counter class. 
