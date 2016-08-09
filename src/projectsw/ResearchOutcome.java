package projectsw;

import java.util.Vector;

public class ResearchOutcome {

  private String title;

  private String description;
  public Researcher ownerName;
  public int id ; 
    public Vector  myResearchOutcomeController;
      public Vector  myResearchTags;
 //   public Vector  myResearchTags;
      public Topic t1;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

      
    public void setT1(Topic t1) {
        this.t1 = t1;
    }

    public Topic getT1() {
        return t1;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setMyResearchOutcomeController(Vector myResearchOutcomeController) {
        this.myResearchOutcomeController = myResearchOutcomeController;
    }

    public Vector getMyResearchOutcomeController() {
        return myResearchOutcomeController;
    }

    public void setMyResearchTags(Vector myResearchTags) {
        this.myResearchTags = myResearchTags;
    }

    public Vector getMyResearchTags() {
        return myResearchTags;
    }

    public void setOwnerName(Researcher ownerName) {
        this.ownerName = ownerName;
    }

    public Researcher getOwnerName() {
        return ownerName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

 
}