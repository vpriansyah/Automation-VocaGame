import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\X1CARB~1\\AppData\\Local\\Temp\\Katalon\\20260306_010434\\execution.properties')

TestCaseMain.beforeStart()

TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://vocagame.com/id-id\')\n\nWebUI.click(findTestObject(\'Page_VocaGame - Top up Game  Voucher Game t_04b01b/button_Masuk\'))\n\nWebUI.setText(findTestObject(\'Page_VocaGame - Top up Game  Voucher Game t_04b01b/input_Nomor HP atau email\'), \'deyantraa@gmail.com\')\n\nWebUI.click(findTestObject(\'Page_VocaGame - Top up Game  Voucher Game t_04b01b/button_Masuk Akun\'))\n\nWebUI.click(findTestObject(\'Page_VocaGame - Top up Game  Voucher Game t_04b01b/input__\'))\n\nWebUI.setEncryptedText(findTestObject(\'Page_VocaGame - Top up Game  Voucher Game t_04b01b/input__\'), \'p4y+y39Ir5OTdtOb306gDg==\')\n\nWebUI.click(findTestObject(\'Page_VocaGame - Top up Game  Voucher Game t_04b01b/button_Masuk Akun_1\'))\n\nWebUI.click(findTestObject(\'Page_VocaGame - Top up Game  Voucher Game t_04b01b/img_Mobile Legends_ Bang Bang\'))\n\nWebUI.setText(findTestObject(\'Page_Top Up Mobile Legends Bang Bang Diamon_98e0e1/input__User ID\'), \'74907682\')\n\nWebUI.setText(findTestObject(\'Page_Top Up Mobile Legends Bang Bang Diamon_98e0e1/input__Zone ID\'), \'2136\')\n\nWebUI.setText(findTestObject(\'Page_Top Up Mobile Legends Bang Bang Diamon_98e0e1/input__Email\'), \'deyantraa@gmail.com\')\n\nWebUI.click(findTestObject(\'Page_Top Up Mobile Legends Bang Bang Diamon_98e0e1/div_Weekly Diamond PassRp 27,819\'))\n\nWebUI.click(findTestObject(\'Page_Top Up Mobile Legends Bang Bang Diamon_98e0e1/path_path\'))\n\nWebUI.click(findTestObject(\'Page_Top Up Mobile Legends Bang Bang Diamon_98e0e1/p_QRIS\'))\n\nWebUI.click(findTestObject(\'Page_Top Up Mobile Legends Bang Bang Diamon_98e0e1/button_Buy\'))\n\nWebUI.closeBrowser()\n\n', FailureHandling.STOP_ON_FAILURE, true)

