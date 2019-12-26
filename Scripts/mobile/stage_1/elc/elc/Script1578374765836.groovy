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

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.widget.Button0 - ENTER PASSWORD'), 
    0)

Mobile.setText(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.widget.EditText0 - Enter Password'), 
    '123456', 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.widget.Button0 - SIGN IN'), 0)

//Mobile.delay(10)
Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.widget.TextView0 - eIC'), 0)

String elctitle = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.widget.TextView0 - eIC (1)'), 0)
println(elctitle)
Mobile.verifyMatch(elctitle, 'eIC', false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.view.View0 - (888) 232-7036'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.widget.ImageView0'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.view.View0 - LumenatoStudyobviohealth.com'), 
    0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.widget.Button0 - Cancel'), 0)

Mobile.scrollToText('How long is the study? :')

Mobile.scrollToText('STUDY TITLE:')

String subtitle = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.view.View0 - INFORMED CONSENT DOCUMENT'), 
    0)

println(subtitle)

Mobile.verifyMatch(subtitle, 'INFORMED CONSENT DOCUMENT', false, FailureHandling.STOP_ON_FAILURE)

String content = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.view.View0 - STUDY TITLE'), 
    0)

println(content)

Mobile.verifyMatch(content, 'STUDY TITLE:', false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.widget.Button0 - DISAGREE'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.widget.TextView0 - eIC'), 0)

Mobile.closeApplication()

