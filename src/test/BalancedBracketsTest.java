package test;

import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    /*
TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
*/

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsAroundWord(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[word]"));
    }

    @Test
    public void closingBracketsMissing(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[word"));
    }

    @Test
    public void openingBracketsMissing(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("word]"));
    }

    @Test
    public void noBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void multipleBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[word]]"));
    }

    @Test
    public void bracketsWithinWordReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("w[ord]"));
    }

    @Test
    public void multipleWordWithBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("a str[ing of wo]rds"));
    }

    @Test
    public void closingBracketBeforeOpeningBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]word["));
    }


}
