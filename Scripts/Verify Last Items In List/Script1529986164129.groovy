import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

Mobile.switchToPortrait()

Mobile.setText(findTestObject('Login/android.widget.EditText0 - Enter Password'), '123456', 0)

Mobile.setText(findTestObject('Login/android.widget.EditText1 - Confirm Password'), '123456', 0)

Mobile.tap(findTestObject('Login/android.widget.Button0 - SIGN IN'), 0)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Login/android.widget.TextView19 - End-User License Agreement'), 0)

Mobile.tap(findTestObject('Login/android.widget.Button0 - I AGREE'), 0)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Login/android.widget.Button0 - NEXT'), 0)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Login/android.widget.TextView19 - eIC'), 0)

Mobile.tap(findTestObject('Login/android.widget.Button1 - AGREE'), 0)

Mobile.switchToPortrait()

Mobile.setText(findTestObject('Login/android.view.View0'), 'l', 0)

Mobile.tap(findTestObject('Login/android.widget.Button1 - DONE'), 0)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Login/android.widget.Button1 - YES'), 0)

Mobile.pressBack()

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Login/android.widget.Button0 - COMPLETE'), 0)

Mobile.switchToPortrait()

Mobile.closeApplication()

