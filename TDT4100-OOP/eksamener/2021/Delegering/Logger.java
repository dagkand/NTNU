public class Logger {
 
    // This is only for testing
    Collection<String> hasLogged = new ArrayList<>();
 
    public void log(String log) {
        System.out.println(log);
        hasLogged.add(log);
    }
}