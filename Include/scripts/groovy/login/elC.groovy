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



class elC {
	
	
	@When("Tap on elC screen")
	public void tap_on_elC_screen() {
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.widget.TextView0 - eIC'), 0)
		
	}
	
	@Then("verify elC Title Is Display")
	public void verify_elC_Title_Is_Display() {
		String elctitle = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.widget.TextView0 - eIC (1)'),
			0)
		println(elctitle)
		Mobile.verifyMatch(elctitle, 'eIC', false, FailureHandling.STOP_ON_FAILURE)
		
	}
	
	@Then("verify in elC Screen Mobile Number Is display")
	public void verify_in_elC_Screen_Mobile_Number_Is_display() {
		Mobile.verifyElementExist(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.view.View0 - (888) 232-7036'), 0, FailureHandling.STOP_ON_FAILURE)
		
	}
	
	@When("tap on elC screen mobile number")
	public void tap_on_elC_screen_mobile_number() {
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.view.View0 - (888) 232-7036'), 0)
		
	}
	
	@When("Tap on elC mobile number is display and Tap on cancle button")
	public void tap_on_elC_mobile_number_is_display_and_Tap_on_cancle_button() {
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.widget.ImageView0'), 0)
		Mobile.pressBack()
		
	}
	
	@Then("verify in elC Screen Email id is display")
	public void verify_in_elC_Screen_Email_id_is_display() {
		
		Mobile.verifyElementExist(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.view.View0 - LumenatoStudyobviohealth.com'), 0, FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("Tap on elc Screen Emial id is Display")
	public void tap_on_elc_Screen_Emial_id_is_Display() {
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.view.View0 - LumenatoStudyobviohealth.com'),
			0)
		
	}
	
	@Then("verify cancle button is Disply")
	public void verify_cancle_button_is_Disply() {
		Mobile.verifyElementExist(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.widget.Button0 - Cancel'), 0, FailureHandling.STOP_ON_FAILURE)
		
	}
	
	@When("Tap on pressback for redirect on elc Screen")
	public void tap_on_pressback_for_redirect_on_elc_Screen() {
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.widget.Button0 - Cancel'), 0)
		
	}
	
	@Then("Verify How long is the study text able to Display")
	public void verify_How_long_is_the_study_text_able_to_Display() {
		Mobile.scrollToText('How long is the study? :')
		
	}
	
	@Then("verify STUDY TITLE Text able to Display")
	public void verify_STUDY_TITLE_Text_able_to_Display() {
		Mobile.scrollToText('STUDY TITLE:')
		
	}
	
	@Then("verify STUDY TITLE text able to Display in elC screen")
	public void verify_STUDY_TITLE_text_able_to_Display_in_elC_screen() {
		String content = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.view.View0 - STUDY TITLE'),
			0)
		println(content)
		Mobile.verifyMatch(content, 'STUDY TITLE:', false, FailureHandling.STOP_ON_FAILURE)
		
	}
	
	@When("in elc screen tap on DISAGREE button")
	public void in_elc_screen_tap_on_DISAGREE_button() {
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.widget.Button0 - DISAGREE'), 0)
		
	}
}