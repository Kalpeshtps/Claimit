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

Mobile.switchToPortrait()

/*
int timeout = 10
def inputField = findTestObject('test login/android.widget.EditText0')
Mobile.tap(inputField, timeout)
Mobile.sendKeys(inputField, '1')


def inputField1 = findTestObject('test login/android.widget.EditText1')
Mobile.tap(inputField1, timeout)
Mobile.sendKeys(inputField, '2')


def inputField1 = findTestObject('test login/android.widget.EditText2')
Mobile.tap(inputField1, timeout)
Mobile.sendKeys(inputField, '0')

*/
Mobile.setText(findTestObject('test login/android.widget.EditText0'), '1', 0)

Mobile.sendKeys(findTestObject('test login/android.widget.EditText1'), '2', 0)

Mobile.sendKeys(findTestObject('test login/android.widget.EditText2'), '0', 0)

Mobile.sendKeys(findTestObject('test login/android.widget.EditText3'), '5', 0)

Mobile.sendKeys(findTestObject('test login/android.widget.EditText4'), '4', 0)

Mobile.sendKeys(findTestObject('test login/android.widget.EditText5'), '4', 0)

Mobile.sendKeys(findTestObject('test login/android.widget.EditText6'), '6', 0)

Mobile.sendKeys(findTestObject('test login/android.widget.EditText7'), '0', 0)

Mobile.sendKeys(findTestObject('test login/android.widget.EditText8'), '0', 0)

Mobile.setText(findTestObject('test login/android.widget.EditText9'), '9', 0)

Mobile.delay(20)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('test login/android.widget.Button0 - ENTER PASSWORD'), 0)

Mobile.tap(findTestObject('test login/android.widget.Button0 - CANCEL'), 0)

Mobile.setText(findTestObject('test login/android.widget.EditText0 - Enter Password'), '123456', 0)

Mobile.startApplication('C:\\Users\\User\\Downloads\\ClaimIt_2020 (3).apk', true)

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

Mobile.tap(findTestObject('test login/android.widget.Button0 - SIGN IN'), 0)

Mobile.switchToPortrait()

WebUI.delay(20)

Mobile.tap(findTestObject('Study Chat/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Study Chat/android.widget.TextView27 - STUDY TEAM CHAT'), 0)

Mobile.switchToPortrait()

Mobile.setText(findTestObject('Study Chat/android.widget.EditText0 - Type your messages here'), 'Hello', 0)

Mobile.tap(findTestObject('Study Chat/android.widget.ImageView1'), 0)

Mobile.switchToPortrait()

Mobile.setText(findTestObject('Study Chat/android.widget.EditText0 - Type your messages here (1)'), '1', 0)

Mobile.tap(findTestObject('Study Chat/android.widget.ImageView1'), 0)

Mobile.switchToPortrait()

Mobile.closeApplication()

