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

WebUI.click(findTestObject('Object Repository/Page_ClaimIt Admin/span_Participants List'))

WebUI.click(findTestObject('Object Repository/Page_ClaimIt Admin/button_Add New Participant'))

WebUI.setText(findTestObject('Object Repository/Page_ClaimIt Admin/input_concat(Participant  s first name)_mot_2d43f5'), 
    'Android')

WebUI.setText(findTestObject('Object Repository/Page_ClaimIt Admin/input_concat(Participant  s last name)_moth_41da6e'), 
    'RK')

WebUI.setText(findTestObject('Object Repository/Page_ClaimIt Admin/input_concat(Participant  s Email)_email'), 'admin@claimit.com')

WebUI.click(findTestObject('Object Repository/Page_ClaimIt Admin/div_Participants Phone (best  to call)'))

WebUI.setText(findTestObject('Object Repository/Page_ClaimIt Admin/input_concat(Participant  s Phone (best  to_299c63'), 
    '+1 212-121-2121')

WebUI.click(findTestObject('Object Repository/Page_ClaimIt Admin/input_concat(Participant  s date of birth)__83b6bc'))

WebUI.click(findTestObject('Object Repository/Page_ClaimIt Admin/div_Participants Race                      _2672ef'))

WebUI.click(findTestObject('Object Repository/Page_ClaimIt Admin/button_Provide access to ClaimIt'))

WebUI.acceptAlert()
