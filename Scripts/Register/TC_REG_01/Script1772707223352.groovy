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

WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('Register/button_Masuk'))

WebUI.click(findTestObject('Register/span_Daftar Sekarang'))

WebUI.delay(5)

WebUI.setText(findTestObject('Register/input__Nama Depan'), 'Devan')

WebUI.setText(findTestObject('Register/input__Nama Belakang'), 'Putra')

Random rand = new Random()

String phoneNumber = '08' + (100000000 + rand.nextInt(900000000))

WebUI.setText(findTestObject('Register/input_Whatsapp'), phoneNumber)

WebUI.setText(findTestObject('Register/input_Email'), 'hyduziqo@fxzig.com')

//WebUI.newTab('')
//
//WebUI.navigateToUrl('https://internxt.com/temporary-email')
//
//WebUI.delay(7)
//
//WebUI.click(findTestObject('Register/copy_temp email'))
//
//WebUI.switchToWindowTitle('VocaGame - Top up Game & Voucher Game termurah dan terpercaya di Indonesia.')
//
//WebUI.sendKeys(findTestObject('Register/input_Email'), Keys.chord(Keys.CONTROL, 'v'))
WebUI.setText(findTestObject('Register/input__Password'), GlobalVariable.password)

WebUI.setText(findTestObject('Register/input__Konfirmasi Password'), GlobalVariable.password)

WebUI.click(findTestObject('Register/Checklist TnC'))

WebUI.click(findTestObject('Register/button_Buat Akun Active'), FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('Register/button_Buat Akun Active'), FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('Register/button_Buat Akun Active'), FailureHandling.OPTIONAL)

//if (WebUI.verifyElementPresent(findTestObject('Object Repository/Register/button_Buat Akun Active'), 5, FailureHandling.OPTIONAL)) {
//    WebUI.click(findTestObject('Object Repository/Register/button_Buat Akun Active'))
//}
WebUI.click(findTestObject('Register/li_Kirim OTP via Emailh1jtwdollicons.com'))

WebUI.click(findTestObject('Register/button_Lanjutkan'), FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('Register/button_Lanjutkan'), FailureHandling.OPTIONAL)

WebUI.delay(7)

//WebUI.switchToWindowTitle('Temp Mail – Free Temporary Email')
//
//WebUI.delay(3)
//
//WebUI.click(findTestObject('Register/Refresh inbox'))
//
//WebUI.click(findTestObject('Register/mail_Your OTP Code'))
//
//WebUI.delay(3)
//
//WebUI.doubleClick(findTestObject('Register/OTP'))
//
//String otp = WebUI.getText(findTestObject('Register/OTP'))
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
//WebUI.setText(otpField, otp)
WebUI.click(findTestObject('Register/button_Verifikasi OTP'))

WebUI.delay(2)

