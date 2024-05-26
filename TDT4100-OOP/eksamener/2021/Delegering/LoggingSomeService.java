public class LoggingSomeService implements SomeService {
 
    // Add needed fields here
    private SomeService delegate;
    private Logger logger;
 
    /*
     * Creates a LoggingSomeService object with the given delegate and logger
     */
    public LoggingSomeService(SomeService delegate, Logger logger) {
        this.delegate = delegate;
        this.logger = logger; 
    }
 
    @Override
    /**
     * Delegates the job of calculating a magic string to the delegate, and logs the
     * result before returning it
     *
     * @return A string
     */
    public String getAMagicString() {
        String magicString = delegate.getAMagicString();
        logger.log(magicString);
        return magicString;
    }
 
    /**
     * Delegates the job of calculating a magic number to the delegate, and logs the
     * result before returning it
     *
     * @return An integer
     */
    @Override
    public int getAMagicNumber() {
        int magicNumber = delegate.getAMagicNumber();
        logger.log(Integer.toString(magicNumber));
        return magicNumber;
    }
}