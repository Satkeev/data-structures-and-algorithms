package challenges.multibracketvalidation;


import org.junit.Test;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void testMultiBracketValidationBasic() {
        assertFalse(MultiBracketValidation.multiBracketValidation("([]"));
        assertFalse(MultiBracketValidation.multiBracketValidation("([]{)}"));
        assertTrue(MultiBracketValidation.multiBracketValidation("()[]{}"));
        assertTrue(MultiBracketValidation.multiBracketValidation("({}[]){}"));
        assertFalse(MultiBracketValidation.multiBracketValidation("([]}"));


    }

    @Test
    public void testMultiBracketValidationWithOtherCharacters() {
        assertTrue(MultiBracketValidation.multiBracketValidation("(hi)[this]{fine}"));
        assertTrue(MultiBracketValidation.multiBracketValidation("(mi{good}[nice]ce){legit}"));
        assertFalse(MultiBracketValidation.multiBracketValidation("(not[ok]ok}"));
        assertFalse(MultiBracketValidation.multiBracketValidation("(we[are]{at)home}"));
        assertFalse(MultiBracketValidation.multiBracketValidation("(where[is]the school?"));
    }
}

