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



class elC_DOCUMENT_NOTSUBMIT {

	@When("Tap to open Side and tap on ecl Documents Option")
	public void tap_to_open_Side_and_tap_on_ecl_Documents_Option() {
		Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/Not_Submit_elcelc_DOCUMENTS/android.widget.ImageButton0'), 0)
		Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/Not_Submit_elcelc_DOCUMENTS/android.widget.TextView26 - eIC DOCUMENTS'), 0)
	   
	}

	@Then("verify elc screen titile and redirection")
	public void verify_elc_screen_titile_and_redirection() {
		String elCtitle = Mobile.getText(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/Not_Submit_elcelc_DOCUMENTS/android.widget.TextView0 - eIC Documents'), 0)
		println(elCtitle)
		Mobile.verifyMatch(elCtitle, 'eIC Documents', false, FailureHandling.STOP_ON_FAILURE)
	}

	@Then("verify text Currently there are no Signed eIC")
	public void verify_text_Currently_there_are_no_Signed_eIC() {
		String elCtext = Mobile.getText(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/Not_Submit_elcelc_DOCUMENTS/android.widget.TextView2 - Currently there are no Signed eIC'), 0)
		println(elCtext)
		Mobile.verifyMatch(elCtext, 'Currently there are no Signed eIC', false, FailureHandling.STOP_ON_FAILURE)
		
	}
}