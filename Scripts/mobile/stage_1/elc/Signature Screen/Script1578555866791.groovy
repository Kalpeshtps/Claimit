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

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.Button0 - ENTER PASSWORD'), 0)

Mobile.setText(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.EditText0 - Enter Password'), '123456', 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/dashboard/android.widget.Button0 - SIGN IN'), 0) 

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/Signature Screen/android.widget.TextView19 - eIC'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/Signature Screen/android.widget.Button1 - AGREE'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/Signature Screen/android.widget.ImageButton0'), 0)

String eIC = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/elc/Signature Screen/android.widget.TextView19 - eIC'), 0)
println(eIC)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/Signature Screen/android.widget.TextView19 - eIC'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/Signature Screen/android.widget.Button1 - AGREE'), 0)

Mobile.setText(findTestObject('mobile/stage_1_pre_screening_object/elc/Signature Screen/android.view.View0'), 't', 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/Signature Screen/android.widget.Button0 - CLEAR'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/Signature Screen/android.widget.Button1 - DONE'), 0)

String Signaturerequired = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/elc/Signature Screen/android.widget.TextView3 - Signature required to proceed.'), 0)
println(Signaturerequired)
// Signature required to proceed.
Mobile.setText(findTestObject('mobile/stage_1_pre_screening_object/elc/Signature Screen/android.view.View0'), 'qw', 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/Signature Screen/android.widget.Button1 - DONE'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/Signature Screen/android.widget.Button1 - YES'), 0)
/*
String signed_document_emailed = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/elc/Signature Screen/android.widget.TextView0 - Would you like a copy of this signed document emailed to you'), 0)
println(signed_document_emailed)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/Signature Screen/android.widget.Button1 - YES'), 0)

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/Signature Screen/android.widget.ImageView4'), 0)

String Subject = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/elc/Signature Screen/android.widget.EditText0 - Subject'), 0)
println(Subject)

String eICpdf = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/elc/Signature Screen/android.widget.TextView6 - eIC.pdf'), 0)
println(eICpdf)
Mobile.pressBack()

Mobile.tap(findTestObject('mobile/stage_1_pre_screening_object/elc/Signature Screen/android.widget.Button0 - COMPLETE'), 0)

String Screening_Questionnaire = Mobile.getText(findTestObject('mobile/stage_1_pre_screening_object/elc/Signature Screen/android.widget.TextView19 - Screening Questionnaire'), 0)
println(Screening_Questionnaire)
*/
Mobile.closeApplication()