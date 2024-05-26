public class RentalCarListener implements StatusListener {
 
List<String> goldUsers = new ArrayList<>();
 
    @Override
    /**
     * Method that should be called when a given userName has updated its status.
     */
    public void statusChanged(String username, String oldStatus, String newStatus) {
        if (newStatus.equals("Gold")) {
            goldUsers.add(username);
        } else {
            goldUsers.remove(username);
        }
    }
 
    /**
     * Get's the discount of a user. Should be a 100 if the user currently has Gold
     * status, otherwise should be 0.
     *
     * @param username The username of the user
     *
     * @return The discount the user qualifies for.
     */
    public int getDiscount(String username) {
        if (goldUsers.contains(username)) {
            return 100;
        }
        else {
            return 0;
        }
    }
}