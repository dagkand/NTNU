package eksamen2021;

public class VaccineTrialVolunteer {

    private final String id;
    private final boolean placebo;
    private boolean gotSick = false;
 
    public VaccineTrialVolunteer(String id, boolean placebo) {
        this.id = id;
        this.placebo = placebo;
    }
 
    public String getId() {
        return id;
    }
 
    /* Whether the volunteer was given a placebo or the actual vaccine */
    public boolean isPlacebo() {
        return placebo;
    }
 
    /* Whether the volunteer got sick during the trial period,
     * the default value for this should be false */
    public boolean gotSick() {
        return gotSick;
    }
 
    /*
     * Updates whether the participant got sick during the trial period
     */
    public void setGotSick(boolean gotSick) {
        this.gotSick = gotSick;
    }
 
}