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

Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_email/android.widget.Button0 - ENTER PASSWORD'), 
    0)

Mobile.setText(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_email/android.widget.EditText0 - Enter Password'), 
    '123456', 0)

Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_email/android.widget.Button0 - SIGN IN'), 
    0)

Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_email/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_email/android.widget.TextView26 - eIC DOCUMENTS'), 
    0)

Mobile.getText(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_email/android.widget.TextView2 - Please enter your participant ID (without any dashes) as your password to review files. e.g. 4891763210.'), 
    0)

Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_email/android.widget.ImageView1'), 0)

String Email = Mobile.getText(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_email/android.widget.TextView0 - Email'), 
    0)
println(Email)
Mobile.verifyMatch(Email, 'Email', false, FailureHandling.STOP_ON_FAILURE)

String Print = Mobile.getText(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_email/android.widget.TextView1 - Print'), 
    0)
println(Print)
//Mobile.verifyMatch(Print, 'Email', false, FailureHandling.STOP_ON_FAILURE)

String Preview = Mobile.getText(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_email/android.widget.TextView2 - Preview'), 
    0)
println(Preview)
//Mobile.verifyMatch(Preview, 'Email', false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_email/android.widget.TextView0 - Email'), 
    0)
Mobile.pressBack()

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.Button0 - LOGOUT'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.TextView3 - Use different participant ID'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.Button1 - YES'), 0)



