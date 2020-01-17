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

Mobile.startApplication('C:\\Users\\User\\Desktop\\ClaimIt_2020.apk', true)
Mobile.delay(10)
Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/pending_tasks_menu/pending_task_help_menu_option/android.widget.Button0 - ENTER PASSWORD'), 0)
Mobile.setText(findTestObject('mobile/Dahsboard -Side Menu/pending_tasks_menu/pending_task_help_menu_option/android.widget.EditText0 - Enter Password'), '123456', 0)
Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/pending_tasks_menu/pending_task_help_menu_option/android.widget.Button0 - SIGN IN'), 0)
Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/pending_tasks_menu/pending_task_help_menu_option/android.widget.ImageButton0'), 0)
Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/pending_tasks_menu/pending_task_help_menu_option/android.widget.TextView0 - PENDING TASKS'), 0)
Mobile.verifyElementExist(findTestObject('mobile/Dahsboard -Side Menu/pending_tasks_menu/pending_task_help_menu_option/android.widget.TextView0'), 0, FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/pending_tasks_menu/pending_task_help_menu_option/android.widget.TextView0'), 0)
Mobile.verifyElementExist(findTestObject('mobile/Dahsboard -Side Menu/pending_tasks_menu/pending_task_help_menu_option/android.widget.ImageView0'), 0, FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/pending_tasks_menu/pending_task_help_menu_option/android.widget.ImageView0'), 0)
Mobile.verifyElementExist(findTestObject('mobile/Dahsboard -Side Menu/pending_tasks_menu/pending_task_help_menu_option/android.widget.ImageButton0'), 0, FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('mobile/Dahsboard -Side Menu/pending_tasks_menu/pending_task_help_menu_option/android.widget.ImageButton0'), 0)
Mobile.closeApplication()