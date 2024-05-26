package eksamen2021;

public class VaccineTrialVolunteer {
 
    public VaccineTrialVolunteer(String id, boolean placebo) {
        ...
    }
 
    public String getId() {
        ...
    }
 
    /* Whether the volunteer was given a placebo or the actual vaccine */
    public boolean isPlacebo() {
        ...
    }
 
    /* Whether the volunteer got sick during the trial period,
     * the default value for this should be false */
    public boolean gotSick() {
        ...
    }
 
    /*
     * Updates whether the participant got sick during the trial period
     */
    public void setGotSick(boolean gotSick) {
        ...
    }
 
}