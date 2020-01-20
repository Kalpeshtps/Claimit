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

Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_preview/android.widget.Button0 - ENTER PASSWORD'), 
    0)

Mobile.setText(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_preview/android.widget.EditText0 - Enter Password'), 
    '123456', 0)

Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_preview/android.widget.Button0 - SIGN IN'), 
    0)

Mobile.delay(10)

Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_preview/android.widget.ImageButton0'), 
    0)

Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_preview/android.widget.TextView26 - eIC DOCUMENTS'), 
    0)

Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_preview/android.widget.ImageView1'), 0)

Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_preview/android.widget.TextView1 - Print'), 
    0)

Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_preview/android.widget.Button1 - OK'), 
    0)

Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_preview/android.widget.Button0 - CANCEL'), 
    0)

Mobile.verifyElementExist(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_preview/android.widget.ImageView1'), 
    0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_preview/android.widget.ImageView1'), 0)

Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_preview/android.widget.TextView1 - Print'), 
    0)

Mobile.setText(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_preview/android.widget.EditText0 - eg. 5554562018'), 
    '84612612800', 0)

Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_preview/android.widget.Button1 - OK (1)'), 
    0)

String Matchtext = Mobile.getText(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_preview/android.widget.TextView2 - Password doesnt match'), 
    0)

println(Matchtext)

//Mobile.verifyMatch(Matchtext, 'Email', false, FailureHandling.STOP_ON_FAILURE)
Mobile.clearText(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_preview/android.widget.EditText0 - '), 
    0)

Mobile.setText(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_preview/android.widget.EditText0 - eg. 5554562018 (1)'), 
    '8461261280', 0)

Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/elc_DOCUMENTS/elc_Document_preview/android.widget.Button0 - CANCEL'), 
    0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.Button0 - LOGOUT'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.TextView3 - Use different participant ID'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.Button1 - YES'), 0)

Mobile.delay(20)