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

//Mobile.delay(10)
Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_new_password/android.widget.Button0 - ENTER PASSWORD (1)'), 
    0)

Mobile.setText(findTestObject('mobile/stage_1_pre_screening_object/verify_new_password/android.widget.EditText0 - Enter Password (1)'), 
    '123456', 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_new_password/android.widget.Button0 - SIGN IN (2)'), 
    0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_new_password/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_new_password/android.widget.TextView25 - PROFILE'), 
    0)

String profileTitle = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/verify_new_password/android.widget.TextView0 - PROFILE'), 
    0)

println(profileTitle)

Mobile.verifyMatch(profileTitle, 'PROFILE', false, FailureHandling.STOP_ON_FAILURE)

//Mobile.tap(findTestObject('Chnage Password/android.widget.TextView2 - CHANGE PASSWORD'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - CHANGE PASSWORD'), 0)

Mobile.setText(findTestObject('mobile/stage_1_pre_screening_object/verify_enter_password/Change_Password_Successfully/android.widget.EditText0 - Current Password'), 
    '123456', 0)

Mobile.setText(findTestObject('mobile/stage_1_pre_screening_object/verify_enter_password/Change_Password_Successfully/android.widget.EditText0 - New Password'), 
    '123456', 0)

Mobile.setText(findTestObject('mobile/stage_1_pre_screening_object/verify_enter_password/Change_Password_Successfully/android.widget.EditText0 - Confirm Password'), 
    '123456', 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_enter_password/Change_Password_Successfully/android.widget.TextView0 - UPDATE PASSWORD'), 
    0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_enter_password/Change_Password_Successfully/android.widget.ImageButton0'), 
    0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_enter_password/Change_Password_Successfully/android.widget.Button0 - LOGOUT'), 
    0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_enter_password/Change_Password_Successfully/android.widget.TextView0 - Use different participant ID'), 
    0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_enter_password/Change_Password_Successfully/android.widget.Button0 - YES'), 
    0)

