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

Mobile.startApplication('C:\\Users\\User\\Downloads\\ClaimIt_2020.apk', true)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_enter_password/Create_new_PassWord_length/android.widget.Button0 - CREATE NEW PASSWORD'), 
    0)

Mobile.setText(findTestObject('mobile/stage_1_pre_screening_object/verify_enter_password/Create_new_PassWord_length/android.widget.EditText0 - Enter Password'), 
    '1234589', 0)

Mobile.setText(findTestObject('mobile/stage_1_pre_screening_object/verify_enter_password/Create_new_PassWord_length/android.widget.EditText1 - Confirm Password'), 
    '123456', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_enter_password/Create_new_PassWord_length/android.widget.Button0 - SIGN IN'), 
    0)

String VerifyText = Mobile.getText(findTestObject('mobile1/change_password/android.widget.TextView2 - Password and confirm password do not match.'), 
    0)

println(VerifyText)

Mobile.verifyMatch(VerifyText, 'Password and confirm password do not match.', false, FailureHandling.STOP_ON_FAILURE)

