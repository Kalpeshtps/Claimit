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

Mobile.delay(10)

Mobile.tap(findTestObject('study overview/study_overview_Chat_call/android.widget.Button0 - ENTER PASSWORD'), 0)

Mobile.setText(findTestObject('study overview/study_overview_Chat_call/android.widget.EditText0 - Enter Password'), '123456', 
    0)

Mobile.tap(findTestObject('study overview/study_overview_Chat_call/android.widget.Button0 - SIGN IN'), 0)

Mobile.tap(findTestObject('study overview/study_overview_Chat_call/android.widget.TextView1'), 0)

Mobile.tap(findTestObject('study overview/study_overview_Chat_call/android.widget.Button1 - STUDY FAQS'), 0)

Mobile.tap(findTestObject('study overview/study_overview_Chat_call/android.widget.TextView1 - Question not answered Click here'), 
    0)

Mobile.tap(findTestObject('study overview/study_overview_Chat_call/android.widget.EditText0 - Type your messages here'), 
    0)

Mobile.setText(findTestObject('study overview/study_overview_Chat_call/android.widget.EditText0 - Type your messages here (1)'), 
    'Message by Katlon Automation', 0)

Mobile.tap(findTestObject('study overview/study_overview_Chat_call/android.widget.ImageView1'), 0)

Mobile.tap(findTestObject('study overview/study_overview_Chat_call/android.widget.TextView1 - CLICK HERE TO CALL OUR STUDY COORDINATOR'), 0)

Mobile.tap(findTestObject('study overview/study_overview_Chat_call/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('study overview/study_overview_Chat_call/android.widget.TextView1 - CLICK HERE TO CALL OUR STUDY COORDINATOR'), 
    0)

Mobile.tap(findTestObject('study overview/study_overview_Chat_call/android.widget.Button0 - CALL NOW'), 0)

Mobile.getText(findTestObject('study overview/study_overview_Chat_call/android.widget.LinearLayout6'), 0)

Mobile.tap(findTestObject('study overview/study_overview_Chat_call/android.widget.ImageView5'), 0)

Mobile.closeApplication()