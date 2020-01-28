package login
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
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



class Create_password_successful {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Then("verify Create new Paswword button is display")
	public void verify_Create_new_Paswword_button_is_display() {
		Mobile.verifyElementExist(findTestObject('cucumber_Object/01_Create_password_successful/android.widget.Button0 - CREATE NEW PASSWORD'), 0, FailureHandling.STOP_ON_FAILURE)
	}

	@When("Tap on Create new Paswword button")
	public void tap_on_Create_new_Paswword_button() {
		Mobile.tap(findTestObject('cucumber_Object/01_Create_password_successful/android.widget.Button0 - CREATE NEW PASSWORD'),
				0)
	}

	@Then("Verify Confirm Password text box Is display")
	public void verify_Confirm_Password_text_box_Is_display() {
		Mobile.verifyElementExist(findTestObject('cucumber_Object/01_Create_password_successful/android.widget.EditText1 - Confirm Password'), 0, FailureHandling.STOP_ON_FAILURE)
	}

	@When("Enter Password and Confirm Password fill both Filed")
	public void enter_Password_and_Confirm_Password_fill_both_Filed() {
		Mobile.setText(findTestObject('cucumber_Object/01_Create_password_successful/android.widget.EditText0 - Enter Password'), '123456', 0)
		Mobile.setText(findTestObject('cucumber_Object/01_Create_password_successful/android.widget.EditText1 - Confirm Password'), '123456', 0)
	}

	@When("Tap on SIGN IN button")
	public void tap_on_SIGN_IN_button() {
		Mobile.tap(findTestObject('cucumber_Object/01_Create_password_successful/android.widget.Button0 - SIGN IN'), 0)
	}
}