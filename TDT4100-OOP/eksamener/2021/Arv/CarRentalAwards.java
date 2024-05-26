import java.util.Arrays;
import java.util.List;
import java.util.Map;
 
public class CarRentalAwards extends LoyaltyAward {
 
    private Map<Integer, Integer> carBrandToPoints = Map.of(1, 1, 2, 10, 3, 100, 4, 200, 5, 500);
    private List<String> validNames = Arrays.asList("CarRentalAgency1", "CarRentalAgency2");
 
    public CarRentalAwards(String awardName) {
        super(awardName);
    }
 
    @Override
    /**
     * Updates the award name
     * @param: awardName The name of the award
     *
     * @throws IllegalArgumentException If the award name is not part of the valid
     *                                  names
     */
    public void setAwardName(String awardName) {
        if (!validNames.contains(awardName)) {
            throw new IllegalArgumentException("Invalid award name");
        }
        super.setAwardName(awardName);
    }
 
    /**
     * Updates the status of the given LoyaltyUser with points based on the map
     * above. The map means that carBrand 1 will award 1 points, carBrand 2 will
     * award 10 points etc
     *
     * @param carBrand:    The brand of the car the user has rented. If the brand
     *                     does not exist 0 points should be awarded
     *
     * @param loyaltyUser: The user that rented the car
     *
     *
     */
    public void awardPoints(int carBrand, LoyaltyUser loyaltyUser) {
        Integer points = carBrandToPoints.get(carBrand);
        if (points != null) {
            awardPoints(points, loyaltyUser);
        }
    }
 
    public static void main(String[] args) {
        LoyaltyUser user = new LoyaltyUser("Name");
        // What goes wrong here
        LoyaltyAward award = new CarRentalAwards("CarRentalAgency1");
        // What goes wrong here
        award.awardPoints(1, user);
        System.out.println(user.getPoints());
    }
 
}