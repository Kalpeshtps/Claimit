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

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_agree_button_object/android.widget.Button0 - ENTER PASSWORD'), 
    0)

Mobile.setText(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_agree_button_object/android.widget.EditText0 - Enter Password'), 
    '123456', 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_agree_button_object/android.widget.Button0 - SIGN IN'), 
    0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_agree_button_object/android.widget.TextView0 - eIC'), 
    0)

Mobile.verifyElementExist(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_agree_button_object/android.widget.Button0 - AGREE'), 
    0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_agree_button_object/android.widget.Button0 - AGREE'), 
    0)

String SIGNATURE = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_agree_button_object/android.widget.TextView0 - SIGNATURE'), 
    0)
println(SIGNATURE)
Mobile.verifyMatch(SIGNATURE, 'SIGNATURE', false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_agree_button_object/android.widget.ImageButton0'), 
    0)

String eIC = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_agree_button_object/android.widget.TextView19 - eIC'), 
    0)
println(eIC)
Mobile.verifyMatch(eIC, 'eIC', false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.ImageButton0'), 
    0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.Button0 - LOGOUT'), 
    0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.TextView3 - Use different participant ID'), 
    0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.Button1 - YES'), 
    0)

