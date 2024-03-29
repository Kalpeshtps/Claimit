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

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_new_password/android.widget.Button0 - ENTER PASSWORD'), 
    0)

Mobile.setText(findTestObject('mobile/stage_1_pre_screening_object/verify_new_password/android.widget.EditText0 - Enter Password'), 
    '123456', 0)

String Button = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/verify_new_password/android.widget.Button0 - SIGN IN'), 
    0)

println(Button)

//Mobile.verifyMatch(Button, 'Are you sure you want to sign in with different participant ID?', false, FailureHandling.STOP_ON_FAILURE)
Mobile.hideKeyboard()

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_new_password/android.widget.Button0 - SIGN IN'), 0)

String PENDING_TASKS = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/verify_new_password/android.widget.TextView16 - PENDING TASKS'), 
    0)

println(PENDING_TASKS)

//Mobile.verifyMatch(PENDING_TASKS, 'Are you sure you want to sign in with different participant ID?', false, FailureHandling.STOP_ON_FAILURE)
Mobile.closeApplication()

