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



class Dashbord_Redirection {
	@When("Tap On Side menu and Tap to open Pending Task option")
	public void tap_On_Side_menu_and_Tap_to_open_Pending_Task_option() {
		Mobile.tap(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.ImageButton0'), 0)
		Mobile.tap(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.TextView24 - PENDING TASKS'), 0)
	}

	@Then("Verify redirect in Pending Task Screen")
	public void verify_redirect_in_Pending_Task_Screen() {
		String PENDINGTASKS = Mobile.getText(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.TextView0 - PENDING TASKS'), 0)
		println(PENDINGTASKS)
		Mobile.verifyMatch(PENDINGTASKS, 'PENDING TASKS', false, FailureHandling.STOP_ON_FAILURE)
	}

	@When("Tap to open Side menu and Tap on Profile option")
	public void tap_to_open_Side_menu_and_Tap_on_Profile_option() {
		Mobile.tap(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.ImageButton0'), 0)
		Mobile.tap(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.TextView11 - PROFILE'), 0)
	}

	@Then("verify redirect in Profile Screen")
	public void verify_redirect_in_Profile_Screen() {
		String PROFILE = Mobile.getText(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.TextView0 - PROFILE'), 0)
		println(PROFILE)
		Mobile.verifyMatch(PROFILE, 'PROFILE', false, FailureHandling.STOP_ON_FAILURE)
	}

	@When("Tap to open Side menu and Tap on eIC Documents option")
	public void tap_to_open_Side_menu_and_Tap_on_eIC_Documents_option() {
		Mobile.tap(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.ImageButton0'), 0)
		Mobile.tap(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.TextView12 - eIC DOCUMENTS'), 0)
	}

	@Then("Verify redirect in eIC Documents Screen")
	public void verify_redirect_in_eIC_Documents_Screen() {
		String eICDocuments = Mobile.getText(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.TextView0 - eIC Documents'), 0)
		println(eICDocuments)
		Mobile.verifyMatch(eICDocuments, 'eIC Documents', false, FailureHandling.STOP_ON_FAILURE)
	}

	@When("Tap to open Side menu and Tap on STUDY TEAM CHAT")
	public void tap_to_open_Side_menu_and_Tap_on_STUDY_TEAM_CHAT() {
		Mobile.tap(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.ImageButton0'), 0)
		Mobile.tap(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.TextView10 - STUDY TEAM CHAT'), 0)
	}

	@Then("verify redirect in STUDY TEAM CHAT Screen")
	public void verify_redirect_in_STUDY_TEAM_CHAT_Screen() {
		String STUDYCOORDINATOR = Mobile.getText(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.TextView0 - CHAT WITH STUDY COORDINATOR'), 0)
		println(STUDYCOORDINATOR)
		Mobile.verifyMatch(STUDYCOORDINATOR, 'CHAT WITH STUDY COORDINATOR', false, FailureHandling.STOP_ON_FAILURE)
	}

	@When("Tap to open Side menu and Tap on IT HELP DESK")
	public void tap_to_open_Side_menu_and_Tap_on_IT_HELP_DESK() {
		Mobile.tap(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.ImageView0'), 0)
		Mobile.tap(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.ImageButton0'), 0)
		Mobile.tap(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.TextView11 - IT HELP DESK'), 0)
	}

	@Then("verify redirect in IT HELP DESK Screen")
	public void verify_redirect_in_IT_HELP_DESK_Screen() {
		String ITHELPDESK = Mobile.getText(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.TextView0 - CHAT WITH IT HELP DESK'), 0)
		println(ITHELPDESK)
		Mobile.verifyMatch(ITHELPDESK, 'CHAT WITH IT HELP DESK', false, FailureHandling.STOP_ON_FAILURE)
	}

	@When("Tap to open Side menu and Tap on SETTINGS Option")
	public void tap_to_open_Side_menu_and_Tap_on_SETTINGS_Option() {
		Mobile.tap(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.ImageView0'), 0)
		Mobile.tap(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.ImageButton0'), 0)
		Mobile.tap(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.TextView12 - SETTINGS'), 0)
	}

	@Then("verify redirect in SETTINGS Screen")
	public void verify_redirect_in_SETTINGS_Screen() {
		String Settings = Mobile.getText(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.TextView0 - Settings'), 0)
		println(Settings)
		Mobile.verifyMatch(Settings, 'Settings', false, FailureHandling.STOP_ON_FAILURE)
	}

	@When("Tap on open side menu and Tap on LOGOUT button")
	public void tap_on_open_side_menu_and_Tap_on_LOGOUT_button() {
		Mobile.tap(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.ImageButton0'), 0)
		Mobile.tap(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.Button0 - LOGOUT'), 0)
	}

	@Then("Verify redirect in Enter Password screen")
	public void verify_redirect_in_Enter_Password_screen() {
		String PARTICIPANTID = Mobile.getText(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.TextView0 - YOUR PARTICIPANT ID'), 0)
		println(PARTICIPANTID)
		Mobile.verifyMatch(PARTICIPANTID, 'YOUR PARTICIPANT ID', false, FailureHandling.STOP_ON_FAILURE)
	}

	@When("Tap on Use different participant ID")
	public void tap_on_Use_different_participant_ID() {
		Mobile.tap(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.TextView3 - Use different participant ID'), 0)
	}
}