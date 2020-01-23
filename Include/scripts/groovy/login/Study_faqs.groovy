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


public class Study_faqs {


	@When("Tap on Help option")
	public void tap_on_Help_option() {
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/study_faqs/study_faqs/android.widget.TextView1'), 0)
	}

	@Then("verify Help Option Is open")
	public void verify_Help_Option_Is_open() {
		//Mobile.verifyElementExist(findTestObject('mobile/stage_1_pre_screening_object/help/study_faqs/study_faqs/android.widget.Button0 - STUDY FAQS'), 0, FailureHandling.STOP_ON_FAILURE)
	}

	@When("Tap on STUDY FAQS Option")
	public void tap_on_STUDY_FAQS_Option() {
		//Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/study_faqs/study_faqs/android.widget.ImageView0'), 0)
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/study_faqs/study_faqs/android.widget.Button0 - STUDY FAQS'),
				0)

	}

	@Then("verify STUDY FAQS Is Display")
	public void verify_STUDY_FAQS_Is_Display() {
		String studyfaq = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/help/study_faqs/study_faqs/android.widget.TextView0 - STUDY FAQS'),
				0)
		println(studyfaq)
		Mobile.verifyMatch(studyfaq, 'STUDY FAQS', false, FailureHandling.STOP_ON_FAILURE)
	}

	@Then("verify redirect in STUDY FAQS Screen")
	public void verify_redirect_in_STUDY_FAQS_Screen() {
		String faqs = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/help/study_faqs/study_faqs/android.view.View0 - STUDY FAQs'),
				0)
		println(faqs)
		Mobile.verifyMatch(faqs, 'STUDY FAQs', false, FailureHandling.STOP_ON_FAILURE)
	}

	@When("Tap in Close button")
	public void tap_in_Close_button() {

		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/study_faqs/study_faqs/android.widget.ImageView0'), 0)
	}

	@Then("verify redirect in Dashboard Screen")
	public void verify_redirect_in_Dashboard_Screen() {
		Mobile.verifyElementExist(findTestObject('mobile/stage_1_pre_screening_object/help/study_faqs/study_faqs/android.widget.TextView0'), 0, FailureHandling.STOP_ON_FAILURE)
	}

	@When("Tap on Help button and tap on STUDY FAQS Option")
	public void tap_on_Help_button_and_tap_on_STUDY_FAQS_Option() {
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/study_faqs/study_faqs/android.widget.TextView0'), 0)
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/study_faqs/study_faqs/android.widget.Button0 - STUDY FAQS'), 0)
	}

	@Then("Verify STUDY FAQS Title")
	public void verify_STUDY_FAQS_Title() {
		String studyfaq = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/help/study_faqs/study_faqs/android.widget.TextView0 - STUDY FAQS'),
				0)
		println(studyfaq)
		Mobile.verifyMatch(studyfaq, 'STUDY FAQS', false, FailureHandling.STOP_ON_FAILURE)
	}

	@Then("verify Content OF STUDY FAQS")
	public void verify_Content_OF_STUDY_FAQS() {
		String studyq = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/help/study_faqs/study_faqs/android.view.View0 - Q When will I start taking the study product'),
				0)
		println(studyq)
		Mobile.verifyMatch(studyq, 'Q: When will I start taking the study product?', false, FailureHandling.STOP_ON_FAILURE)
	}

	@When("Tap on Question not answered click here button")
	public void tap_on_Question_not_answered_click_here_button() {
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/study_faqs/study_faqs/android.widget.TextView0 - Question not answered Click here'), 0)
	}

	@Then("Verify STUDY Chat Screen is open")
	public void verify_STUDY_Chat_Screen_is_open() {
		Mobile.verifyElementExist(findTestObject('mobile/stage_1_pre_screening_object/help/study_faqs/study_faqs/android.widget.ImageView0'), 0, FailureHandling.STOP_ON_FAILURE)
	}

	@When("tap on CLose and Tap on STUDY Chat Close button")
	public void tap_on_CLose_and_Tap_on_STUDY_Chat_Close_button() {
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/study_faqs/study_faqs/android.widget.ImageView0'), 0)
		Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/study_faqs/study_faqs/android.widget.ImageView0'), 0)
	}
}
