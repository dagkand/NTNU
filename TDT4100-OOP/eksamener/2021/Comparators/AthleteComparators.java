public class AthleteComparators {
 
    /**
     * @return a comparator that compares athletes based on their name. Using this
     *          comparator, Ane should come before Berit
     */
    public static Comparator<Athlete> getSimpleComparator() {
        return (athlete1, athlete2) -> athlete1.getName().compareTo(athlete2.getName());
    }
 
    /**
     * @return A comparator that compares athletes based on the number of medals of
     *          different valour. The comparator will be used for sorting athletes
     *          based on putting the athlete with the highest number of medals of the best valour
     *          first.
     *
     *          If one athlete has more "Gold" medals than the other athlete it
     *          should come before that one. If they have equal number of "Gold"
     *          medals they should be compared on the number of "Silver" medals, and
     *          if that is equal on the number of "Bronze" medals. If they have the
     *          same number of medals of all valour, they should be compared based
     *          on the name similar to getSimpleComparator
     *         
     *          The spelling and order of the medals can be seen in the list validMetals in the Medal class.
     */
    public static Comparator<Athlete> getAdvancedComparator() {
        ...
    }
}