package common;

import com.hwx.ambariapilib.AmbariManager;
import com.hwx.utils.config.ConfigManager;
import com.hwx.utils.logging.LogManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by vsharma on 11/8/15.
 */
public class TestBase {



    protected LogManager logger = LogManager.getLoggerInstance(this.getClass().getSimpleName());

    protected AmbariManager ambariManager;
    protected ConfigManager conf ;

    @BeforeClass
    public void init(){
        ambariManager = new AmbariManager();
        conf = ConfigManager.getInstance();
    }

    @AfterClass
    public void tearDownTest() {

        ambariManager = null;
    }

}

