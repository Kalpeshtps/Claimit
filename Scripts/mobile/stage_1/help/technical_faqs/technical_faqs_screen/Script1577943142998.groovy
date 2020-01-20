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

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/technical_faqs/technical_faqs/android.widget.Button0 - ENTER PASSWORD'), 
    0)

Mobile.setText(findTestObject('mobile/stage_1_pre_screening_object/help/technical_faqs/technical_faqs/android.widget.EditText0 - Enter Password'), 
    '123456', 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/technical_faqs/technical_faqs/android.widget.Button0 - SIGN IN'), 
    0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/technical_faqs/technical_faqs/android.widget.TextView1'), 
    0)

String HelpName = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/help/technical_faqs/technical_faqs/android.widget.TextView0 - HELP'), 
    0)
println(HelpName)
Mobile.verifyMatch(HelpName, 'HELP', false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/technical_faqs/technical_faqs/android.widget.Button0 - TECHNICAL FAQS'), 
    0)

String FAQS = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/help/technical_faqs/technical_faqs/android.widget.TextView0 - TECHNICAL FAQS'), 
    0)
println(FAQS)
Mobile.verifyMatch(FAQS, 'TECHNICAL FAQS', false, FailureHandling.STOP_ON_FAILURE)

String QUS = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/help/technical_faqs/technical_faqs/android.view.View2 - Q Can I use either Android and iOS devices'), 
    0)
println(QUS)
Mobile.verifyMatch(QUS, 'Q: Can I use either Android and iOS devices?', false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/technical_faqs/technical_faqs/android.widget.ImageView0'), 
    0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/technical_faqs/technical_faqs/android.widget.TextView1'), 
    0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/technical_faqs/technical_faqs/android.widget.Button0 - TECHNICAL FAQS'), 
    0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/technical_faqs/technical_faqs/android.widget.TextView1 - Question not answered Click here'), 
    0)

String ChatHelpDesk = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/help/technical_faqs/technical_faqs/android.widget.TextView0 - CHAT WITH IT HELP DESK'), 
    0)
println(ChatHelpDesk)
Mobile.verifyMatch(ChatHelpDesk, 'CHAT WITH IT HELP DESK', false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/technical_faqs/technical_faqs/android.widget.ImageView0 (3)'), 
    0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/technical_faqs/technical_faqs/android.widget.ImageView0 (1)'), 
    0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.Button0 - LOGOUT'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.TextView3 - Use different participant ID'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.Button1 - YES'), 0)
