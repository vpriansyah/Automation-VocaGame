package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object valid_email
     
    /**
     * <p></p>
     */
    public static Object user_id
     
    /**
     * <p></p>
     */
    public static Object zone_id
     
    /**
     * <p></p>
     */
    public static Object change_password
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables('default')
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
    
            url = selectedVariables['url']
            password = selectedVariables['password']
            valid_email = selectedVariables['valid_email']
            user_id = selectedVariables['user_id']
            zone_id = selectedVariables['zone_id']
            change_password = selectedVariables['change_password']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
