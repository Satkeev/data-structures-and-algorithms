package datastructures.leftjoin;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import static org.junit.Assert.*;

public class LeftJoinTest {
    @Test public void testLeftJoin() {
        HashMap<String, String> left = new HashMap<>();
        HashMap<String, String> right = new HashMap<>();

        left.put("fond", "enamored");
        left.put("wrath", "anger");
        left.put("diligent", "employed");
        left.put("outfit", "garb");
        left.put("guide", "usher");
        right.put("fond", "averse");
        right.put("wrath", "delight");
        right.put("diligent", "idle");
        right.put("guide", "follow");
        right.put("flow", "jam");

        ArrayList<ArrayList<String>> testResult = new ArrayList<>();
        testResult.add(new ArrayList<String>(Arrays.asList("diligent", "employed", "idle")));
        testResult.add(new ArrayList<String>(Arrays.asList("outfit", "garb", null)));
        testResult.add(new ArrayList<String>(Arrays.asList("wrath", "anger", "delight")));
        testResult.add(new ArrayList<String>(Arrays.asList("guide", "usher", "follow")));
        testResult.add(new ArrayList<String>(Arrays.asList("fond", "enamored", "averse")));

        assertEquals("Should return the expect output",
                testResult,
                LeftJoin.leftJoin(left, right)
        );
    }
}