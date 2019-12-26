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
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:/Users/User/Downloads/ClaimIt_2020_android.apk', true)

//Mobile.startExistingApplication('com.obvio.claimit.uat')
//Mobile.switchToPortrait()

Mobile.setText(findTestObject('test login/android.widget.EditText0'), '1', 0)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('test login/android.widget.EditText1'), 40)

Mobile.setText(findTestObject('test login/android.widget.EditText1'), '2', 0)

//
//Mobile.setText(findTestObject('test login/android.widget.EditText2'), '0', 0)
//
//Mobile.setText(findTestObject('test login/android.widget.EditText3'), '5', 0)
//
//Mobile.setText(findTestObject('test login/android.widget.EditText4'), '4', 0)
//
//Mobile.setText(findTestObject('test login/android.widget.EditText5'), '4', 0)
//
//Mobile.setText(findTestObject('test login/android.widget.EditText6'), '6', 0)
//
//Mobile.setText(findTestObject('test login/android.widget.EditText7'), '0', 0)
//
//Mobile.setText(findTestObject('test login/android.widget.EditText8'), '0', 0)
//
//Mobile.setText(findTestObject('test login/android.widget.EditText9'), '9', 0)
Mobile.switchToPortrait()

Mobile.startApplication('C:\\Users\\User\\Downloads\\ClaimIt_2020 (4).apk', true)

Mobile.tap(findTestObject('Login With Logout/android.widget.Button0 - CREATE NEW PASSWORD'), 0)

Mobile.tap(findTestObject('Login With Logout/android.widget.Button0 - CANCEL'), 0)

Mobile.tap(findTestObject('Login With Logout/android.widget.EditText0 - Enter Password'), 0)

Mobile.setText(findTestObject('Login With Logout/android.widget.EditText0 - Enter Password (1)'), '123456', 0)

Mobile.tap(findTestObject('Login With Logout/android.widget.EditText1 - Confirm Password'), 0)

Mobile.setText(findTestObject('Login With Logout/android.widget.EditText1 - Confirm Password (1)'), '123456', 0)

Mobile.tap(findTestObject('Login With Logout/android.widget.Button0 - SIGN IN'), 0)

Mobile.tap(findTestObject('Login With Logout/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Login With Logout/android.widget.Button0 - LOGOUT'), 0)

Mobile.tap(findTestObject('Login With Logout/android.widget.TextView3 - Use different participant ID'), 0)

Mobile.tap(findTestObject('Login With Logout/android.widget.Button1 - YES'), 0)

Mobile.closeApplication()

Mobile.tap(findTestObject('test login/android.widget.Button0 - ENTER PASSWORD'), 0)

Mobile.tap(findTestObject('test login/android.widget.Button0 - CANCEL'), 0)

Mobile.setText(findTestObject('test login/android.widget.EditText0 - Enter Password'), '123456', 0)

Mobile.tap(findTestObject('test login/android.widget.Button0 - SIGN IN'), 0)

Mobile.switchToPortrait()

Mobile.closeApplication()