package utilities;
import org.junit.Test;

public class AnimalShelterTest {
    @Test public void stackGenericTest(){
        StackGeneric newStackGeneric = new StackGeneric();
        System.out.println(newStackGeneric);
    }
    @Test public void gNodeTest(String value){
        StackGeneric newStackGeneric = new StackGeneric();
        StackGeneric.gNode<String> nodeTest = new StackGeneric.gNode(  4);
        System.out.println(nodeTest);


    }
    @Test public void animalTest(String value, String animal, String pref){
        StackGeneric newStackGeneric = new StackGeneric();
        StackGeneric.gNode<String> nodeTest = new StackGeneric.gNode(  6);
        newStackGeneric.enqueue(  "cat" );
        newStackGeneric.enqueue(  "dog");
        newStackGeneric.enqueue("dog");
        newStackGeneric.enqueue(  "dog");
        newStackGeneric.enqueue(  "cat");
        newStackGeneric.enqueue(  "dog");
        System.out.println(newStackGeneric.toString());
        newStackGeneric.dequeue(  "cat");
        System.out.println(newStackGeneric.toString());

    }
}
