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

//Mobile.startApplication('C:\\Users\\User\\Downloads\\ClaimIt_2020.apk', true)

Mobile.delay(10)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_forgot_paswword/forgot_password_negative/android.widget.Button0 - ENTER PASSWORD'), 
    0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_forgot_paswword/forgot_password_negative/android.widget.TextView0 - Forgot Password'), 
    0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_forgot_paswword/forgot_password_negative/android.widget.Button0 - RESET PASSWORD'), 
    0)

String enterEmail = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/verify_forgot_paswword/forgot_password_negative/android.widget.TextView1 - Please enter valid email'),
	0)
println(enterEmail)
Mobile.verifyMatch(enterEmail, 'Please enter valid email', false, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('mobile/stage_1_pre_screening_object/verify_forgot_paswword/forgot_password_negative/android.widget.EditText0 - Please enter your registered email address'), 
    'dmin12@claimit.com', 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_forgot_paswword/forgot_password_negative/android.widget.Button0 - RESET PASSWORD'), 
    0)

Mobile.clearText(findTestObject('mobile/stage_1_pre_screening_object/verify_forgot_paswword/android.widget.EditText0 - dhfhfugwghru.com'), 
    0)

Mobile.setText(findTestObject('mobile/stage_1_pre_screening_object/verify_forgot_paswword/android.widget.EditText0 - Please enter your registered email address'), 
    'admin@claimit', 0)

Mobile.verifyElementExist(findTestObject('mobile/stage_1_pre_screening_object/verify_forgot_paswword/forgot_password_negative/android.widget.Button0 - RESET PASSWORD'), 
    0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_forgot_paswword/forgot_password_negative/android.widget.Button0 - RESET PASSWORD'), 
    0)

String WrongEmail = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/verify_forgot_paswword/forgot_password_negative/android.widget.TextView1 - Please enter valid email'), 
    0)
println(WrongEmail)
Mobile.verifyMatch(WrongEmail, 'Please enter valid email', false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_forgot_paswword/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.TextView3 - Use different participant ID'), 
    0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.Button1 - YES'), 
    0)