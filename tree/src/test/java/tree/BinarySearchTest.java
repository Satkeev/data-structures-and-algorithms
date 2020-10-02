package tree;



import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;


    public class BinarySearchTest {
        public BinarySearchTree<Integer> testBurst;


        public void setUpBurst() {
            this.testBurst = new BinarySearchTree<>();
        }


        public void tearDownBurst() {
            this.testBurst = null;
        }

        @Test
        public void testInstantiate() {
            BinarySearchTree<Integer> testBstInt = new BinarySearchTree<>();
            BinarySearchTree<Character> testBstChar = new BinarySearchTree<>();
            BinarySearchTree<String> testBstTString = new BinarySearchTree<>();
        }

        @Test
        public void testContainsOnEmptyBurst() {
            assertFalse("Should be false",
                    this.testBurst.contains(1)
            );
            assertFalse("Should be false",
                    this.testBurst.contains(46)
            );
            assertFalse("Should be false",
                    this.testBurst.contains(-34)
            );
        }

        @Test
        public void TestAddToBurst() {
            this.testBurst.add(0);
            this.testBurst.add(-3);
            this.testBurst.add(45);
            this.testBurst.add(9384);
            this.testBurst.add(-23);

            // This should not error out nor should it be added
            this.testBurst.add(0);

        }

    }