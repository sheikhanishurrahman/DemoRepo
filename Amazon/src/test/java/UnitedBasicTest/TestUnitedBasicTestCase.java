package UnitedBasicTest;
import UnitedBasic.UnitedBasicTestCase;
import org.testng.annotations.Test;

public class TestUnitedBasicTestCase extends UnitedBasicTestCase {
    @Test
    public void enterTextIntoTextBox(){

    }
    @Test
    public void clickOnTosearchBox(){
        searchButton();
    }
    @Test
    public void clickOnTextEspanol(){
        checkTextEspanol();
    }
    @Test
    public void testAlreadyMember(){
        verifyingText();
    }
    @Test
    public void clickedOnSignIn(){
        clickOnSignIn();
    }
    @Test
    public void clickedOnDownArrow(){
        clickSignInDownArrow();
    }
}

