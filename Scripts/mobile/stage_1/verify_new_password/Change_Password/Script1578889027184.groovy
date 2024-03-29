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

Mobile.tap(findTestObject('TECHNICAL_FAQS/technical_faqs_ChatANDCall/android.widget.Button0 - ENTER PASSWORD'), 0)

Mobile.setText(findTestObject('mobile/stage_1_pre_screening_object/help/technical_faqs/technical_faqs_Chat/android.widget.EditText0 - Enter Password'), 
    '123456', 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/technical_faqs/technical_faqs_Chat/android.widget.Button0 - SIGN IN'), 
    0)

Mobile.tap(findTestObject('Chnage Password/new/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.TextView11 - PROFILE'), 0)

Mobile.tap(findTestObject('Chnage Password/new/android.widget.Button0 - CHANGE PASSWORD'), 0)

String ChangePassword = Mobile.getText(findTestObject('Chnage Password/new/android.widget.TextView2 - CHANGE PASSWORD'), 0)
println(ChangePassword)
Mobile.verifyMatch(ChangePassword, 'CHANGE PASSWORD', false, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Chnage Password/new/android.widget.EditText0 - Current Password'), '123456', 0)

Mobile.setText(findTestObject('Chnage Password/new/android.widget.EditText1 - New Password'), '123456', 0)

Mobile.setText(findTestObject('Chnage Password/new/android.widget.EditText2 - Confirm Password'), '123456', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Chnage Password/new/android.widget.TextView4 - UPDATE PASSWORD'), 0)

String ChangePasswordsuccessfully = Mobile.getText(findTestObject('mobile/Alret Message/android.widget.TextView6 - Password changed successfully.'), 0)
println(ChangePasswordsuccessfully)
Mobile.verifyMatch(ChangePasswordsuccessfully, 'Password changed successfully.', false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.Button0 - LOGOUT'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.TextView3 - Use different participant ID'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.Button1 - YES'), 0)
