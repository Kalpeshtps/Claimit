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


public class log_out_successful {


	@When("Tap Side menu and Click on Log out button")
	public void tap_Side_menu_and_Click_on_Log_out_button() {
		Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/log_out/android.widget.ImageButton0'), 0)
		Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/log_out/android.widget.Button0 - LOGOUT'), 0)
	}

	@Then("verify Enter Password Screen Is open")
	public void verify_Enter_Password_Screen_Is_open() {
		String SignINName = Mobile.getText(findTestObject('mobile/Dahsboard -Side Menu/log_out/android.widget.Button0 - SIGN IN'), 0)
		println(SignINName)
		Mobile.verifyMatch(SignINName, 'SIGN IN', false, FailureHandling.STOP_ON_FAILURE)
	}

	@When("tap on Login with different PID")
	public void tap_on_Login_with_different_PID() {
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.TextView3 - Use different participant ID'), 0)
	}

	@When("DIsplay Alret Popup and tap on yes")
	public void display_Alret_Popup_and_tap_on_yes() {
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.Button1 - YES'), 0)
	}
}
