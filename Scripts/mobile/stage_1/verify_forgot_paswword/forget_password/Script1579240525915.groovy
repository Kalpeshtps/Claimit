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
Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_forgot_paswword/android.widget.Button0 - ENTER PASSWORD'),
	0)
String nammm = Mobile.getAttribute(findTestObject('mobile/stage_1_pre_screening_object/elc/elc_object/android.widget.EditText0 - Enter Password'),
	'text', 5)
println(nammm)
Mobile.verifyMatch(nammm, 'Enter Password', false, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_forgot_paswword/android.widget.TextView0 - Forgot Password'),
	0)
String forgottitle = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/verify_forgot_paswword/android.widget.TextView0 - PASSWORD RESET'), 0)
println(forgottitle)
Mobile.verifyMatch(forgottitle, 'PASSWORD RESET', false, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/verify_forgot_paswword/android.widget.ImageView0'), 0)
Mobile.verifyElementExist(findTestObject('mobile/stage_1_pre_screening_object/verify_forgot_paswword/android.widget.ImageView0'), 10)
String forgottext = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/verify_forgot_paswword/android.widget.EditText0 - Please enter your registered email address'), 0)
Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/verify_forgot_paswword/android.widget.ImageButton0'), 0)
println(forgottext)
Mobile.verifyMatch(forgottext, 'Please enter your registered email address', false, FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.TextView3 - Use different participant ID'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/Create_New_Password_Screen/android.widget.Button1 - YES'), 0)
