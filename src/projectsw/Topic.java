package projectsw;

public class Topic {

  public String name;

  public Researcher members;

//    public Researcher *;
  //  public ResearchOutcome *;

    public void setMembers(Researcher members) {
        this.members = members;
    }

    public Researcher getMembers() {
        return members;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    

}