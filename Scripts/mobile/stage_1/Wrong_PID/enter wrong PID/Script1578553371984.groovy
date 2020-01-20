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

String WrongPID = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/Wrong PID/android.widget.TextView0 - WE WERE UNABLE TO FINDTHAT PARTICIPANT ID.'), 
    0)

println(WrongPID)

//Mobile.verifyMatch(WrongPID, 'WE WERE UNABLE TO FIND THAT PARTICIPANT ID.', false, FailureHandling.STOP_ON_FAILURE)
Mobile.verifyElementVisible(findTestObject('mobile/stage_1_pre_screening_object/Wrong PID/android.widget.Button0 - TRY AGAIN'), 
    0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Wrong PID/android.widget.Button0 - TRY AGAIN'), 0)

String PARTICIPANT = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/Wrong PID/android.widget.TextView0 - PLEASE ENTER YOUR PARTICIPANT ID'), 
    0)

println(PARTICIPANT)

Mobile.verifyMatch(PARTICIPANT, 'PLEASE ENTER YOUR PARTICIPANT ID', false, FailureHandling.STOP_ON_FAILURE)

