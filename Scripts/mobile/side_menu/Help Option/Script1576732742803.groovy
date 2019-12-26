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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.lumenato.claimitadmin.obviohealth.net/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Claimit/input_Sign In_email'), 'admin@claimit.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Claimit/input_Sign In_password'), '1qLKCmtuCyLQZ1baQc2tGw==')

WebUI.click(findTestObject('Object Repository/Page_Claimit/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_ClaimIt Admin/a_Participants List'))

WebUI.click(findTestObject('Object Repository/Page_ClaimIt Admin/button_Add New Participant'))

WebUI.setText(findTestObject('Object Repository/Page_ClaimIt Admin/input_concat(Participant  s first name)_mot_2d43f5'), 
    'Ios')

WebUI.setText(findTestObject('Object Repository/Page_ClaimIt Admin/input_concat(Participant  s last name)_moth_41da6e'), 
    'KK')

WebUI.setText(findTestObject('Object Repository/Page_ClaimIt Admin/input_concat(Participant  s Email)_email'), 'Kalpesh@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_ClaimIt Admin/input_concat(Participant  s Phone (best  to_299c63'), 
    '+1 234-689-8746')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ClaimIt Admin/select_White                               _93e408'), 
    'Other', true)

WebUI.setText(findTestObject('Object Repository/Page_ClaimIt Admin/input_Please specify_other_race'), 'test')

WebUI.click(findTestObject('Object Repository/Page_ClaimIt Admin/button_Provide access to ClaimIt'))

WebUI.waitForAlert(0)

WebUI.acceptAlert()

WebUI.delay(20)

WebUI.getText(findTestObject('Object Repository/Page_ClaimIt Admin/div_Participant ID                         _09d1bb'))

WebUI.delay(10)

WebUI.getText(findTestObject('Object Repository/Page_ClaimIt Admin/h4_884-188-3871'))

WebUI.delay(20)

WebUI.getText(findTestObject('Object Repository/Page_ClaimIt Admin/h4_621-185-5031'))

WebUI.closeBrowser()

WebUI.closeBrowser()

WebUI.navigateToUrl('https://uat.lumenato.claimitadmin.obviohealth.net/participant-list')

WebUI.closeBrowser()

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.waitForAlert(0)

