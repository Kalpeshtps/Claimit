import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://uat.lumenato.claimitadmin.obviohealth.net/')

WebUI.setText(findTestObject('Object Repository/Screening Approval/Page_Claimit/input_Sign In_email'), 'admin@claimit.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Screening Approval/Page_Claimit/input_Sign In_password'), '1qLKCmtuCyLQZ1baQc2tGw==')

WebUI.click(findTestObject('Object Repository/Screening Approval/Page_Claimit/button_Log In'))

WebUI.click(findTestObject('Object Repository/Screening Approval/Page_ClaimIt Admin/a_Participants List'))

WebUI.setText(findTestObject('Object Repository/Screening Approval/Page_ClaimIt Admin/input'), '388-349-9047')

WebUI.click(findTestObject('Page_ClaimIt Admin/a_View'))

WebUI.click(findTestObject('IP_Shipment/Page_ClaimIt Admin/a_View'))

WebUI.scrollToPosition(110, 180)

WebUI.click(findTestObject('IP_Shipment/Page_ClaimIt Admin/a_Ship Now'))

WebUI.click(findTestObject('IP_Shipment/Page_ClaimIt Admin/button_Save'))

WebUI.click(findTestObject('IP_Shipment/Page_ClaimIt Admin/a_Go Back'))

WebUI.delay(10)

WebUI.closeBrowser()

