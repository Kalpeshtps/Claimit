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

Mobile.startApplication('C:\\Users\\User\\Downloads\\ClaimIt_2020 (4).apk', true)

Mobile.tap(findTestObject('cucumber_Object/03_Dashbord_Redirection/android.widget.Button0 - ENTER PASSWORD (1)'), 0)

Mobile.tap(findTestObject('Chnage Password/android.widget.Button0 - CANCEL'), 0)

Mobile.tap(findTestObject('Chnage Password/android.widget.EditText0 - Enter Password'), 0)

Mobile.setText(findTestObject('Chnage Password/android.widget.EditText0 - Enter Password (1)'), '123456', 0)

//Mobile.setText(findTestObject('Screening Questionnaire 00/android.widget.EditText0 - Enter Password'), '123456', 0)
Mobile.tap(findTestObject('Screening Questionnaire 00/android.widget.Button0 - SIGN IN'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 00/android.view.ViewGroup2'), 0)

Mobile.setText(findTestObject('Screening Questionnaire 00/android.widget.EditText0'), 'test', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Screening Questionnaire 00/android.widget.ImageButton2'), 0)

Mobile.setText(findTestObject('Screening Questionnaire 00/android.widget.EditText0'), 'Demo', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Screening Questionnaire 00/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 00/android.view.ViewGroup8'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 00/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 00/android.widget.EditText0 - yyyy-MM-dd'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 00/android.widget.Button7 - OK'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 00/android.widget.ImageButton2'), 0)

Mobile.setText(findTestObject('Screening Questionnaire 00/android.widget.EditText0'), '+911234567890', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Screening Questionnaire 00/android.widget.ImageButton2'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Screening Questionnaire 00/android.widget.ImageButton2'), 0)

Mobile.setText(findTestObject('Screening Questionnaire 00/android.widget.EditText0 (1)'), 'test', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Screening Questionnaire 00/android.widget.ImageButton2'), 0)

Mobile.setText(findTestObject('Screening Questionnaire 00/android.widget.EditText0'), 'test', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Screening Questionnaire 00/android.widget.ImageButton2'), 0)

Mobile.setText(findTestObject('Screening Questionnaire 00/android.widget.EditText0'), 'demo', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Screening Questionnaire 00/android.widget.ImageButton2'), 0)

Mobile.setText(findTestObject('Screening Questionnaire 00/android.widget.EditText0'), '38', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Screening Questionnaire 00/android.widget.ImageButton2'), 0)

Mobile.setText(findTestObject('Screening Questionnaire 00/android.widget.EditText0'), 'test@gmail.com', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Screening Questionnaire 00/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup6'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup8'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup12'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.TextView15 - Native HawaiianPacific Islander'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 002/android.widget.TextView5 - Yes'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 002/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 002/android.view.ViewGroup8'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 002/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 002/android.view.ViewGroup6 (1)'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 002/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 002/android.view.ViewGroup6 (1)'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 002/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 002/android.view.ViewGroup8'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 002/android.widget.ImageButton2'), 0)

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

//Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.TextView9 - I currently have vasculitis or another vascular condition'), 0)
Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup6'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup6 (2)'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup8 (1)'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup6 (3)'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

//
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

//Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.TextView9 - I currently have vasculitis or another vascular condition'), 0)
Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup6'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup6 (2)'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup8 (1)'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.view.ViewGroup6 (3)'), 0)

Mobile.tap(findTestObject('Screening Questionnaire 01/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('screen/android.widget.Button0 - SUBMIT'), 0)

Mobile.tap(findTestObject('screen/android.widget.TextView19 - Screening Approval'), 0)

Mobile.tap(findTestObject('screen/android.widget.ImageButton0'), 0)

Mobile.closeApplication()

