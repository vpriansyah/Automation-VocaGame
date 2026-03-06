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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login/TC_LOG_01'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Product Order/input_Indonesia_cy-search-product'), 'Mobile Legend')

WebUI.delay(5)

WebUI.click(findTestObject('Product Order/img_Indonesia_h-12 w-12 rounded-lg object-cover object-top'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Product Order/input__User ID'), 5)

WebUI.setText(findTestObject('Product Order/input__User ID'), GlobalVariable.user_id)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Product Order/input__Email'), 5)

WebUI.setText(findTestObject('Product Order/input__Email'), GlobalVariable.valid_email)

WebUI.click(findTestObject('Product Order/button_Weekly Diamond Pass'))

WebUI.delay(1)

WebUI.click(findTestObject('Product Order/button_Rp 27,819'))

WebUI.verifyTextPresent('Input ini wajib diisi', false)

