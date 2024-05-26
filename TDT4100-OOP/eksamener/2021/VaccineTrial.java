package eksamen2021;

import java.lang.reflect.Array;

public class VaccineTrial {
 
    // Add any needed fields here
    ArrayList<VaccineTrialVolunteer> volunteers = new ArrayList<VaccineTrialVolunteer>();
 
    /**
     * Adds a new VaccineTrialVolunteer to the trial
     *
     * @param id      The id of the volunteer
     *
     * @param placebo Whether the volunteer was given a placebo, or the actual
     *                vaccine
     */
 
    public void addVolunteer(String id, boolean placebo) {
        volunteers.add(new VaccineTrialVolunteer(id, placebo));
    }
 
    /**
     * Returns whether the vaccine's effectiveness rate is higher than the provided
     * limit. The effectiveness of the vaccine is calculated as follows:
     *
     * 1- (number of people that received the vaccine and got sick/
     *         number of people that got sick)
     *
     * If there is no sick people, the vaccine is not effective
     *
     * @param limit A limit to compare against
     *
     * @throws IllegalArgumentException If limit is not between (including) 0 and 1.
     *
     * @return Whether the vaccine effectiveness rate is higher than the limit
     */
    public boolean isMoreEffectiveThanLimit(double limit) {
        if (limit < 0 || limit > 1) {
            throw new IllegalArgumentException("Limit must be between 0 and 1");
        }
        double numberOfSick = 0;
        double numberOfSickWithVaccine = 0;
        for (VaccineTrialVolunteer volunteer : volunteers) {
            if (volunteer.gotSick()) {
                numberOfSick++;
                if (!volunteer.isPlacebo()) {
                    numberOfSickWithVaccine++;
                }
            }
        }
        double effectiveness = 1 - (numberOfSickWithVaccine / numberOfSick);
        return effectiveness > limit;
 
    }
 
    /**
     * Updates the sick state of a VaccineTrialVolunteer
     *
     * @param id The id of the volunteer to set sick.
     * @throws IllegalArgumentException if there is no volunteer with the given id
     */
    public void setSick(String id) {
        VaccineTrialVolunteer volunteer = getVolunteer(id);
        if (volunteer == null) {
            throw new IllegalArgumentException("No volunteer with id " + id);
        }
        volunteer.setGotSick(true);
    }
 
    /**
     * Get's the volunteer with the given ID
     *
     * @param id The id of the volunteer to set sick.
     *
     * @return The vaccine trial volunteer with the given ID. If the ID is not valid
     *         for any volunteer, return null
     */
    public VaccineTrialVolunteer getVolunteer(String id) {
        for (VaccineTrialVolunteer volunteer : volunteers) {
            if (volunteer.getId().equals(id)) {
                return volunteer;
            }
        }
        return null;
    }
 
}