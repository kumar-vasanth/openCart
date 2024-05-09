/*
 * package testCases;
 * 
 * import org.testng.Assert; import org.testng.annotations.Test;
 * 
 * import pageObjects.AccountRegistrationPage; import pageObjects.HomePage;
 * import testbase.BaseClass;
 * 
 * public class TC_001_AccountRegistrationTest extends BaseClass {
 * 
 * @Test(groups= {"Regression","Master"}) //Step8 groups added public void
 * verify_account_registration() {
 * logger.info("***** Starting TC001_AccountRegistrationTest  ****");
 * logger.debug("This is a debug log message"); try { HomePage hp = new
 * HomePage(driver); hp.clickMyAccount();
 * logger.info("Clicked on MyAccount Link.. ");
 * 
 * hp.clickRegister(); logger.info("Clicked on Register Link.. ");
 * 
 * AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
 * 
 * logger.info("Providing customer details...");
 * regpage.setFirstName(randomeString().toUpperCase());
 * regpage.setLastName(randomeString().toUpperCase());
 * regpage.setEmail(randomeString() + "@gmail.com");// randomly generated the
 * email regpage.setTelephone(randomeNumber());
 * 
 * String password = randomAlphaNumeric(); regpage.setPassword(password);
 * regpage.setConfirmPassword(password);
 * 
 * regpage.setPrivacyPolicy(); regpage.clickContinue();
 * 
 * logger.info("Validating expected message..");
 * 
 * String confmsg = regpage.getConfirmationMsg(); Assert.assertEquals(confmsg,
 * "Your Account Has Been Created!", "Confirmation message mismatch");
 * 
 * logger.info("Test passed"); } catch (Exception e) {
 * logger.error("Test failed: " + e.getMessage()); Assert.fail("Test failed: " +
 * e.getMessage()); } finally {
 * logger.info("***** Finished TC001_AccountRegistrationTest *****"); } }
 * 
 * }
 */

package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testbase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass
{
	@Test(groups= {"Regression","Master"}) //Step8 groups added
	public void test_account_Registration() throws InterruptedException
	{		
		logger.info("Strating TC_001_AccountRegistrationtTest");
		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on My Account ");
			
			hp.clickRegister();
			logger.info("Clicked on Register ");

			AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
			
			regpage.setFirstName(randomeString().toUpperCase());
			logger.info("Provided First Name ");

			regpage.setLastName(randomeString().toUpperCase());
			logger.info("Provided Last Name ");

			regpage.setEmail(randomeString() + "@gmail.com");// randomly generated the email
			//regpage.setEmail("pavannoltraining@gmail.com");// duplicate email should fail test case
			logger.info("Provided Email ");

			regpage.setTelephone(randomeNumber());
			logger.info("Provided Telephone ");

			regpage.setPassword("test@123");
			logger.info("Provided Password ");

			regpage.setConfirmPassword("test@123");
			logger.info("Provided Confrmed Password ");

			regpage.setPrivacyPolicy();
			logger.info("Set Privacy Policy ");

			regpage.clickContinue();
			logger.info("Clicked on Continue ");

			Thread.sleep(2000);

			String confmsg = regpage.getConfirmationMsg();
			Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}
		catch(Exception e)
		{
			Assert.fail();
		}

		logger.info("Finished TC_001_AccountRegistrationtTest");
	}
					
}

