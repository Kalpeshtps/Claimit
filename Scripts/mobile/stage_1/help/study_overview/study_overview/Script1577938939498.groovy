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

Mobile.tap(findTestObject('TECHNICAL_FAQS/technical_faqs_ChatANDCall/android.widget.Button0 - ENTER PASSWORD'), 0)

Mobile.setText(findTestObject('TECHNICAL_FAQS/android.widget.EditText0 - Enter Password'), '123456', 0)

Mobile.tap(findTestObject('TECHNICAL_FAQS/android.widget.Button0 - SIGN IN'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/study_overview/android.widget.TextView0'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/study_overview/android.widget.Button2 - STUDY OVERVIEW'), 
    0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/study_overview/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/study_overview/android.widget.TextView0'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/study_overview/android.widget.Button2 - STUDY OVERVIEW'), 
    0)

String studyover = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/help/study_overview/android.widget.TextView0 - STUDY OVERVIEW'), 
    0)

println(studyover)

Mobile.verifyMatch(studyover, 'STUDY OVERVIEW', false, FailureHandling.STOP_ON_FAILURE)

String study = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/help/study_overview/android.view.View0 - Study Overview '), 
    0)

println(study)

Mobile.verifyMatch(study, 'Study Overview :', false, FailureHandling.STOP_ON_FAILURE)

String studycontent = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/help/study_overview/android.view.View0 - This study is being done to assess your perception of your skin health and appearance while taking a tomato-based product supplement daily for 12 weeks.'), 
    0)

println(studycontent)

Mobile.verifyMatch(studycontent, 'This study is being done to assess your perception of your skin health and appearance while taking a tomato-based product supplement daily for 12 weeks.', 
    false, FailureHandling.STOP_ON_FAILURE)

String remind = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/help/study_overview/android.view.View0 - Reminders '), 
    0)

println(remind)

Mobile.verifyMatch(remind, 'Reminders :', false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/help/study_overview/android.widget.ImageView0'), 0)

Mobile.verifyElementVisible(findTestObject('mobile/stage_1_pre_screening_object/help/study_overview/android.widget.TextView0'), 
    0)

Mobile.verifyElementExist(findTestObject('mobile/stage_1_pre_screening_object/help/study_overview/android.widget.TextView0'), 
    0, FailureHandling.STOP_ON_FAILURE)



Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.Button0 - LOGOUT'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.TextView3 - Use different participant ID'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.Button1 - YES'), 0)


/*
Mobile.tap(findTestObject('TECHNICAL_FAQS/android.widget.Button0 - ENTER PASSWORD'), 0)

Mobile.setText(findTestObject('TECHNICAL_FAQS/android.widget.EditText0 - Enter Password'), '123456', 0)

Mobile.tap(findTestObject('TECHNICAL_FAQS/android.widget.Button0 - SIGN IN'), 0)

Mobile.tap(findTestObject('study overview/android.widget.TextView1'), 0)

Mobile.tap(findTestObject('study overview/android.widget.Button2 - STUDY OVERVIEW'), 0)

Mobile.tap(findTestObject('study overview/android.widget.ImageView0'), 0)
*/

