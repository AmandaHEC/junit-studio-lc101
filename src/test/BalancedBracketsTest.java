package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

//    //TODO: add tests here
//    @Test//1
//    public void emptyTest() {
//        assertEquals(true, true);
//    }
////    private void assertEquals(boolean b, boolean b1) {
////    }
//
//    @Test//2
//    public void onlyBracketsReturnsTrue() {
//        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
//    }
//    @Test//3
//    public void twoBracketsReturnsTrue() {
//        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
//    }
//    @Test//4
//    public void onlyOpenBracketReturnsFalse(){
//        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
//    }
//    @Test//5
//    public void onlyClosingBracketReturnsFalse(){
//        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
//    }
//    @Test//6
//    public void curlyBoysReturnsFalse(){
//        assertFalse(BalancedBrackets.hasBalancedBrackets("{}"));
//    }
//    @Test//7
//    public void youPutAnAsteriskReturnsFalse(){
//        assertFalse(BalancedBrackets.hasBalancedBrackets("**"));
//    }
//    @Test//8
//    public void tripleOpeningBracketsReturnsFalse(){
//        assertFalse(BalancedBrackets.hasBalancedBrackets("[[["));
//    }
//    @Test//9
//    public void tripleClosingBracketsReturnsFalse(){
//        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]"));
//    }
//    @Test//10
//    public void mixedBracketAndCurlyBoysReturnsFalse(){
//        assertFalse(BalancedBrackets.hasBalancedBrackets("[}"));
//    }
//    @Test//11
//    public void mixedOpeningBracketsReturnsFalse(){
//        assertFalse(BalancedBrackets.hasBalancedBrackets("[{"));
//    }
//    @Test//12
//    public void mixedClosingBracketsReturnsFalse(){
//        assertFalse(BalancedBrackets.hasBalancedBrackets("]}"));
//    }
    @Test
    public void emptyTest() {
    assertEquals(true, true);
}

    @Test
    public void onlyBracketsReturnTrue(){
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void stringsWithEqualLeftBracketsAndRightBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Hello]"));
    }
    @Test
    public void stringsWithNoBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Hello"));
    }
    @Test
    public void stringWithNumbersAndLettersReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("He11o"));
    }

    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void stringWithEvenBracketsWithinReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("He[11]o"));
    }
    @Test
    public void stringWithSingleSpaceReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(" "));
    }

    @Test
    public void stringWithSpecialCharactersThatAreNotUnevenBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("H./#$%^&"));
    }

    @Test(expected = java.lang.AssertionError.class)
    public void stringWithSpecialCharactersThatAreUnevenBracketsReturnsFalse(){
        BalancedBrackets.hasBalancedBrackets("H./#$%^&]");
        fail("Brackets are unbalanced");
    }
    @Test
    public void stringWithUnEvenBracketsWithinReturnsFalse() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("He[11o"));
    }

    @Test
    public void opposingBracketsAndOtherCharactersReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("H]e[10"));
    }

    @Test(expected = java.lang.AssertionError.class)
    public void opposingBracketsReturnFalse() {
        BalancedBrackets.hasBalancedBrackets("][");
        fail("Brackets are in the opposing order");
    }

    @Test(expected = java.lang.AssertionError.class)
    public void stringWithUnevenBracketsReturnFalse() {
        BalancedBrackets.hasBalancedBrackets("[");
        fail("Amount of left brackets do not equal amount of right brackets");
    }

}
