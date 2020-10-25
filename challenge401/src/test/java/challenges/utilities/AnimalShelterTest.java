package challenges.utilities;


import org.junit.Test;

public class AnimalShelterTest {
    @Test public void stackGenericTest(){
        utilities.StackGeneric newStackGeneric = new utilities.StackGeneric();
        System.out.println(newStackGeneric);
    }
    @Test public void gNodeTest(String value){
        utilities.StackGeneric newStackGeneric = new utilities.StackGeneric();
        utilities.StackGeneric.gNode<String> nodeTest = new utilities.StackGeneric.gNode(  4);
        System.out.println(nodeTest);


    }
    @Test public void animalTest(String value, String animal, String pref){
        utilities.StackGeneric newStackGeneric = new utilities.StackGeneric();
        utilities.StackGeneric.gNode<String> nodeTest = new utilities.StackGeneric.gNode(  6);
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
