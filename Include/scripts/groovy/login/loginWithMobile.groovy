package login
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.cucumber.keyword.internal.CucumberKeywordContributor
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class loginWithMobile {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("i want to launch application")
	def i_want_to_launch_application(){
		Mobile.startApplication('C:\\Users\\User\\Downloads\\ClaimIt_2020.apk', true)
	}

	@When("Tap on Enter Password button")
	def Tap_on_Enter_Password_button(){
		Mobile.tap(findTestObject('cucumber_Object/02_login/android.widget.Button0 - ENTER PASSWORD (1)'), 0)
	}
	
	@Then("enter Password and tap on Sign button")
	def enter_Password_and_tap_on_Sign_button() {
		Mobile.setText(findTestObject('cucumber_Object/02_login/android.widget.EditText0 - Enter Password'), '123456', 0)
		Mobile.tap(findTestObject('cucumber_Object/02_login/android.widget.Button0 - SIGN IN'), 0)
	}

	@Then("verify Dashbord Screen open")
	public void verify_Dashbord_Screen_open() {
		Mobile.waitForElementPresent(findTestObject('cucumber_Object/05_log_out_successful/android.widget.ImageButton0'), 30)
		Mobile.verifyElementExist(findTestObject('cucumber_Object/05_log_out_successful/android.widget.ImageButton0'), 0, FailureHandling.STOP_ON_FAILURE)
	}
}