package datastructures.leftjoin;

import java.util.ArrayList;
import java.util.HashMap;

public class LeftJoin {
    public static ArrayList<Object> leftJoin(HashMap<String, String> left, HashMap<String, String> right) {
        ArrayList<Object> result = new ArrayList<>();
        ArrayList<String> tmpArray;

        for (String key: left.keySet()) {
            tmpArray = new ArrayList<String>();
            tmpArray.add(key);
            tmpArray.add(left.get(key));
            tmpArray.add(right.get(key));
            result.add(tmpArray);
        }

        return result;
    }
}