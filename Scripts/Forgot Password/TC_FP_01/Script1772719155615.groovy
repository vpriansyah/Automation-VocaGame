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
import java.util.Random as Random
import com.kms.katalon.core.testobject.ConditionType as ConditionType

//WebUI.callTestCase(findTestCase('Register/TC_REG_01'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.delay(10)

WebUI.click(findTestObject('Forgot Password/button_Masuk'))

WebUI.delay(1)

WebUI.click(findTestObject('Forgot Password/p_Lupa Password'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Forgot Password/input__Nomor whatsapp atau Email'), GlobalVariable.valid_email)

WebUI.delay(3)

WebUI.click(findTestObject('Forgot Password/button_Kirim Kode OTP'))

WebUI.delay(1)

WebUI.click(findTestObject('Forgot Password/li_Kirim OTP via Emailzzmmddollicons.com'))

WebUI.click(findTestObject('Forgot Password/button_Lanjutkan'))

//WebUI.switchToWindowTitle('Temp Mail – Free Temporary Email')
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('Register/Refresh inbox'))
//
//WebUI.click(findTestObject('Forgot Password/p_logo account confirm New OTP Notification 280640 Do not give OTP to anyone, including parties claiming to be from admin. OTP'))
//
//WebUI.delay(3)
//
//WebUI.doubleClick(findTestObject('Forgot Password/p_280640 (2)'))
//
//String otp2 = WebUI.getText(findTestObject('Forgot Password/p_280640 (2)'))
//
//WebUI.switchToWindowTitle('VocaGame - Top up Game & Voucher Game termurah dan terpercaya di Indonesia.')
//
//WebUI.delay(1)
//
//TestObject otpField = new TestObject()
//
//otpField.addProperty('xpath', ConditionType.EQUALS, '//input[@data-input-otp=\'true\']')
//
//WebUI.waitForElementVisible(otpField, 10)
//
//WebUI.setText(otpField, otp2)
WebUI.delay(7)

WebUI.click(findTestObject('Register/button_Verifikasi OTP'))

WebUI.delay(2)

WebUI.setText(findTestObject('Forgot Password/input__Password Baru'), GlobalVariable.password)

WebUI.setText(findTestObject('Forgot Password/input__Konfirmasi Password Baru'), GlobalVariable.password)

WebUI.delay(3)

WebUI.click(findTestObject('Forgot Password/button_Reset Password'))

