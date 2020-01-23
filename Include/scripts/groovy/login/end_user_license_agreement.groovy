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




public class end_user_license_agreement {

	@Then("Verify end user license agreement Task Is Display")
	public void verify_end_user_license_agreement_Task_Is_Display() {
		Mobile.verifyElementExist(findTestObject('mobile/stage_1_pre_screening_object/end_user_license_agreement/end_user_liecense_agreement/android.widget.TextView0 - End-User License Agreement'), 0, FailureHandling.STOP_ON_FAILURE)		
	}
	
	@When("Tap on end user license agreement Task")
	public void tap_on_end_user_license_agreement_Task() {
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/end_user_license_agreement/end_user_liecense_agreement/android.widget.TextView0 - End-User License Agreement'),
			0)
	}
	
	@Then("Verify end user license agreement Screen is Open")
	public void verify_end_user_license_agreement_Screen_is_Open() {
		Mobile.verifyElementExist(findTestObject('mobile/stage_1_pre_screening_object/end_user_license_agreement/end_user_liecense_agreement/android.widget.Button0 - I AGREE'), 0, FailureHandling.STOP_ON_FAILURE)
		
	}
	
	@When("Tap on end user license agreement Screen Close button")
	public void tap_on_end_user_license_agreement_Screen_Close_button() {
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/end_user_license_agreement/end_user_liecense_agreement/android.widget.ImageButton0'),
			0)	
	}
	
	@When("Tap on Need Help Tap here to talk to study coordinator button")
	public void tap_on_Need_Help_Tap_here_to_talk_to_study_coordinator_button() {
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/end_user_license_agreement/end_user_liecense_agreement/android.widget.TextView0 - Need Help Tap here to talk toa study coordinator'),
			0)
	}
	
	@Then("verify Need Help Tap here to talk to study coordinator screen is open")
	public void verify_Need_Help_Tap_here_to_talk_to_study_coordinator_screen_is_open() {
		Mobile.verifyElementExist(findTestObject('mobile/stage_1_pre_screening_object/end_user_license_agreement/end_user_liecense_agreement/android.widget.ImageView0'), 0, FailureHandling.STOP_ON_FAILURE)
			
	}
	@Then("Tap on study coordinator screen Close button")
	public void tap_on_study_coordinator_screen_Close_button() {
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/end_user_license_agreement/end_user_liecense_agreement/android.widget.ImageView0'),
			0)
	}

	
	@Then("verify Agree buton is Display")
	public void verify_Agree_buton_is_Display() {
		Mobile.verifyElementExist(findTestObject('mobile/stage_1_pre_screening_object/end_user_license_agreement/end_user_liecense_agreement/android.widget.Button0 - I AGREE'), 0, FailureHandling.STOP_ON_FAILURE)

	}
	
	@When("Tap on Agree button")
	public void tap_on_Agree_button() {
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/end_user_license_agreement/end_user_liecense_agreement/android.widget.Button0 - I AGREE'),
			0)
		
	}
	
	@Then("verify Study Overview Screen Is open")
	public void verify_Study_Overview_Screen_Is_open() {
		Mobile.verifyElementExist(findTestObject('mobile/stage_1_pre_screening_object/end_user_license_agreement/end_user_liecense_agreement/android.view.View0 - Study Overview '), 0, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/end_user_license_agreement/end_user_liecense_agreement/android.view.View0 - Study Overview '),
			0)
	}
	
	@Then("verify next button is Display")
	public void verify_next_button_is_Display() {
		Mobile.verifyElementExist(findTestObject('mobile/stage_1_pre_screening_object/end_user_license_agreement/end_user_liecense_agreement/android.widget.Button0 - NEXT'), 0, FailureHandling.STOP_ON_FAILURE)
		
	}
	
	@When("Tap on next button in Study Overview screen")
	public void tap_on_next_button_in_Study_Overview_screen() {
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/end_user_license_agreement/end_user_liecense_agreement/android.widget.Button0 - NEXT'),
			0)
		
	}
	
	
	@Then("verify elC Task Is Display")
	public void verify_elC_Task_Is_Display() {
		Mobile.verifyElementExist(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.widget.TextView0 - eIC'), 0, FailureHandling.STOP_ON_FAILURE)
	}
}
