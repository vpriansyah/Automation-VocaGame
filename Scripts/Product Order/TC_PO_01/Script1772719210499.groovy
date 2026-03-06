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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.callTestCase(findTestCase('Login/TC_LOG_01'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Product Order/input_Indonesia_cy-search-product'), 'Mobile Legend')

WebUI.delay(5)

WebUI.click(findTestObject('Product Order/img_Indonesia_h-12 w-12 rounded-lg object-cover object-top'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Product Order/input__User ID'), 5)

WebUI.setText(findTestObject('Product Order/input__User ID'), GlobalVariable.user_id)

WebUI.setText(findTestObject('Product Order/input__Zone ID'), GlobalVariable.zone_id)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Product Order/input__Email'), 5)

WebUI.setText(findTestObject('Product Order/input__Email'), GlobalVariable.valid_email)

WebUI.click(findTestObject('Product Order/button_Weekly Diamond Pass'))

WebUI.delay(3)

WebUI.click(findTestObject('Product Order/button_Rp 27,819'))

WebUI.delay(2)

WebUI.click(findTestObject('Product Order/svg_Buy_lucide lucide-chevron-down h-4 w-4 shrink-0 transition-transform duration-200'))

WebUI.click(findTestObject('Product Order/p_QRIS'))

WebUI.delay(3)

TestObject buyButton = findTestObject('Object Repository/Product Order/button_Buy')

WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(WebUI.findWebElement(buyButton)))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Product Order/span_nomor pesanan'))

