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

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/enter_password_screen/Use_different_participant_id/android.widget.Button0 - ENTER PASSWORD'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/enter_password_screen/Use_different_participant_id/android.widget.TextView3 - Use different participant ID'), 0)

String VerifyText =  Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/enter_password_screen/Use_different_participant_id/android.widget.TextView0 - Are you sure you want to sign in with different participant ID'), 0)
println(VerifyText)
Mobile.verifyMatch(VerifyText, 'Are you sure you want to sign in with different participant ID?', false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/enter_password_screen/Use_different_participant_id/android.widget.Button0 - NO'), 0)

String GetLoginText = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/enter_password_screen/Use_different_participant_id/android.widget.TextView3 - Use different participant ID'), 0)
println(GetLoginText)
Mobile.verifyMatch(GetLoginText, 'Use different participant ID', false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/enter_password_screen/Use_different_participant_id/android.widget.TextView3 - Use different participant ID'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/enter_password_screen/Use_different_participant_id/android.widget.Button1 - YES'), 0)

String PIDText = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/enter_password_screen/Use_different_participant_id/android.widget.TextView0 - PLEASE ENTER YOUR PARTICIPANT ID'), 0)
println(PIDText)
Mobile.verifyMatch(PIDText, 'PLEASE ENTER YOUR PARTICIPANT ID', false, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()