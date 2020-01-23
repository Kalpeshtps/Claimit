import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.driver.MobileDriverType
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

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.Button0 - ENTER PASSWORD'), 0)

Mobile.setText(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.EditText0 - Enter Password'), '123456', 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.Button0 - SIGN IN'), 0)

Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.TextView17 - 1'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.TextView24 - PENDING TASKS'), 0)

String PENDINGTASKS = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.TextView0 - PENDING TASKS'), 0)
println(PENDINGTASKS)
Mobile.verifyMatch(PENDINGTASKS, 'PENDING TASKS', false, FailureHandling.STOP_ON_FAILURE)


Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.TextView11 - PROFILE'), 0)

String PROFILE = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.TextView0 - PROFILE'), 0)
println(PROFILE)
Mobile.verifyMatch(PROFILE, 'PROFILE', false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.TextView12 - eIC DOCUMENTS'), 0)

String eICDocuments = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.TextView0 - eIC Documents'), 0)
println(eICDocuments)
Mobile.verifyMatch(eICDocuments, 'eIC Documents', false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.TextView10 - STUDY TEAM CHAT'), 0)

String STUDYCOORDINATOR = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.TextView0 - CHAT WITH STUDY COORDINATOR'), 0)
println(STUDYCOORDINATOR)
Mobile.verifyMatch(STUDYCOORDINATOR, 'CHAT WITH STUDY COORDINATOR', false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.TextView11 - IT HELP DESK'), 0)

String ITHELPDESK = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.TextView0 - CHAT WITH IT HELP DESK'), 0)
println(ITHELPDESK)
Mobile.verifyMatch(ITHELPDESK, 'CHAT WITH IT HELP DESK', false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.TextView12 - SETTINGS'), 0)

String Settings = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.TextView0 - Settings'), 0)
println(Settings)
Mobile.verifyMatch(Settings, 'Settings', false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.Button0 - LOGOUT'), 0)

String PARTICIPANTID = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.TextView0 - YOUR PARTICIPANT ID'), 0)
println(PARTICIPANTID)
Mobile.verifyMatch(PARTICIPANTID, 'YOUR PARTICIPANT ID', false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.TextView3 - Use different participant ID'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.Button1 - YES'), 0)