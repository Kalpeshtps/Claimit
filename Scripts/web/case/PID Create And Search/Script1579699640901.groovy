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

WebUI.setText(findTestObject('Page_Claimit/input_Sign In_email'), 'admin@claimit.com')

WebUI.setEncryptedText(findTestObject('Page_Claimit/input_Sign In_password'), '1qLKCmtuCyLQZ1baQc2tGw==')

WebUI.click(findTestObject('Page_Claimit/button_Log In'))

WebUI.click(findTestObject('Page_ClaimIt Admin/a_Participants List'))

WebUI.click(findTestObject('Page_ClaimIt Admin/button_Add New Participant'))

WebUI.setText(findTestObject('Page_ClaimIt Admin/input_concat(Participant  s first name)_mot_2d43f5'), 'android')

WebUI.setText(findTestObject('Page_ClaimIt Admin/input_concat(Participant  s last name)_moth_41da6e'), 'Kr')

WebUI.setText(findTestObject('Page_ClaimIt Admin/input_concat(Participant  s Email)_email'), 'krunal.tps@gmail.com')

WebUI.setText(findTestObject('Page_ClaimIt Admin/input_concat(Participant  s Phone (best  to_299c63'), '+1 236-549-8732')

WebUI.click(findTestObject('Page_ClaimIt Admin/button_Provide access to ClaimIt'))

WebUI.acceptAlert()

PID01 = WebUI.getText(findTestObject('Object Repository/Page_ClaimIt Admin/div_Participant ID                         _a7a086'))
println(PID01)

WebUI.click(findTestObject('Object Repository/Page_ClaimIt Admin/button_OK'))

WebUI.setText(findTestObject('Page_ClaimIt Admin/input'), PID01)

//WebUI.delay(10)

WebUI.click(findTestObject('Page_ClaimIt Admin/a_View'))

//WebUI.delay(10)

WebUI.closeBrowser()