package datastructures.repeatedword;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
public class RepeatedWordTest {
    // Expected Outcome
    // Expected Failure
    // Edge Case
    @Test
    public void findFirstDuplicateSuccess (){
        String test = "Once upon a time, there was a brave princess who..."; // expected : A
        String test3 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, " +
                "it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, " +
                "it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, " +
                "we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, " +
                "the period was so far like the present period, that some of its noisiest authorities insisted on its being received, " +
                "for good or for evil, in the superlative degree of comparison only...";
        RepeatWord word = new RepeatWord();
        assertEquals("a", word.findDuplicate(test));
        assertEquals("it", word.findDuplicate(test3));
    }
    @Test
    public void findDupFailure(){
        String test = "Once upon a time, there was the brave princess who..."; // expected failure, return null
        String test2 = "There are no duplicates in this sentence";
        RepeatWord word = new RepeatWord();
        assertNull(word.findDuplicate(test));
        assertNull(word.findDuplicate(test2));
    }
    @Test
    public void findDupEdge(){
        String testEdge = " ";
        String testEdge2 = "Tart heavy string, tart heavy string";
        RepeatWord word = new RepeatWord();
        assertNull(word.findDuplicate(testEdge));
        assertEquals("tart", word.findDuplicate(testEdge2));
    }
}
