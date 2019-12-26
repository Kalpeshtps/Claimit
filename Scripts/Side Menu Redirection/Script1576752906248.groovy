import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

Mobile.startApplication('C:\\Users\\User\\Downloads\\ClaimIt_2020 (4).apk', true)

WebUI.delay(20)

Mobile.setText(findTestObject('data test/android.widget.EditText0 - Enter Password'), '123456', 0)

Mobile.tap(findTestObject('data test/android.widget.Button0 - SIGN IN'), 0)

Mobile.tap(findTestObject('data test/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('data test/android.widget.TextView24 - PENDING TASKS'), 0)

Mobile.tap(findTestObject('data test/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('data test/android.widget.TextView9 - PROFILE'), 0)

Mobile.tap(findTestObject('data test/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('data test/android.widget.TextView12 - eIC DOCUMENTS'), 0)

Mobile.tap(findTestObject('data test/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('data test/android.widget.TextView10 - STUDY TEAM CHAT'), 0)

Mobile.tap(findTestObject('data test/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('data test/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('data test/android.widget.TextView11 - IT HELP DESK'), 0)

Mobile.tap(findTestObject('data test/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('data test/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('data test/android.widget.LinearLayout10'), 0)

Mobile.closeApplication()

WebUI.acceptAlert()

Mobile.startApplication('C:\\Users\\User\\Downloads\\ClaimIt_2020 (4).apk', true)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup6'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup8'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup12'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.TextView15 - Native HawaiianPacific Islander'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup8 (1)'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup8 (1)'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup8 (1)'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup8 (2)'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup8 (3)'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup8 (4)'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup6 (1)'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup8 (1)'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup8 (4)'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup8 (1)'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.TextView9 - I currently have vasculitis or another vascular condition'), 
    0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup6'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup6 (2)'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup8 (1)'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup6 (3)'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.closeApplication()

