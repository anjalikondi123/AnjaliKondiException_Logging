package epamtasks.exceptionlogging;

import java.util.logging.Logger;

public class Driver_code {
	static Logger log = Logger.getLogger(Driver_code.class.getName());
    public static void main( String[] args )
    {
    	Interest_code.calInterest();
        Construction_code.costPrediction();
    }
}
