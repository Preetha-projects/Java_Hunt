package CoreJava.OOPS;

/*
                                        INHERITANCE IN JAVA
                                    Mini Project: Space Mission System
Objective:
Design a class hierarchy where: All missions share some common properties and behavior.
Specific missions (Mars and Moon) have specialized behavior.
The program must demonstrate:
   - Inheritance
   - Method Overriding
   - Constructor Chaining
   - Runtime Polymorphism

 */
public class Inheritance_SpaceApp {

    public static void main(String[] args) {
        //Runtime Polymorphism
        SpaceMission mission1 = new MarsMission("Mars Explorer", 393, 52, true);
        mission1.launch();
        mission1.missionObjective();  // dynamic method dispatch
        mission1.displayDetails();
        mission1.endMission();

        System.out.println("\n-----------------------------\n");
        SpaceMission mission2 = new MoonMission("Lunar Explorer", 287, 30, true);
        mission2.launch();
        mission2.missionObjective();
        mission2.displayDetails();
        mission2.endMission();
    }
}

class SpaceMission{
    protected String missionName;
    protected int durationDays;
    protected long budget;

    public SpaceMission(String missionName, int durationDays, long budget) {
        this.missionName = missionName;
        this.durationDays = durationDays;
        this.budget = budget;

    }

    public void launch(){
        System.out.println("Launching " + missionName);
    }

    public void endMission(){
        System.out.println("Ending " + missionName);
    }

    public void missionObjective(){
        System.out.println("Objective of " + missionName+ " to explore space");
    }

    public void displayDetails(){
        System.out.println("Mission Name: " + missionName);
        System.out.println("Duration (days): " + durationDays);
        System.out.println("Budget: $" + budget);
    }
}

class MarsMission extends SpaceMission {
    protected boolean collectSoilSamples;

    public MarsMission(String missionName, int durationDays, long budget, boolean collectSoilSamples) {
        super(missionName, durationDays, budget);   // Constructor chaining to initialize common properties
        this.collectSoilSamples = collectSoilSamples;
    }

    @Override
    public void missionObjective() {
        System.out.println("Objective of " + missionName + " to explore Mars and collect soil samples");
        soilAnalysis();
    }

    public void soilAnalysis() {
        if (collectSoilSamples) {
            System.out.println("Analyzing soil samples collected from Mars");
        }
    }
}

class MoonMission extends SpaceMission{
    private boolean deployRover;

    public MoonMission(String missionName, int durationDays, long budget, boolean deployRover) {
        super(missionName, durationDays, budget);  // Constructor chaining
        this.deployRover = deployRover;
    }

    @Override
    public void missionObjective() {
        System.out.println("Objective of " + missionName+ " to explore Moon and deploy rover");
        performMoonWalk();
    }

    public void performMoonWalk() {
        if (deployRover) {
            System.out.println("Performing moonwalk and deploying rover on the Moon");
        }
    }
}
