package projectsw;

import java.sql.SQLException;
import java.util.Vector;

public class ResearchOutcomeController {

  private String memberName;

    public AddResearchOutcomeForm myAddResearchOutcomeForm;
    public Vector  myResearchOutcome;
    public Vector  myResearcherDAO;
  //  public ResearchOutcome myResearchOutcome;
    public ResearchOutcomeDAO myResearchOutcomeDAO;
    public Vector  myNotification;
    ResearchOutcomeDAO obj2 = new ResearchOutcomeDAO();
  public void addResOutcome(ResearchOutcome R) throws SQLException {
      obj2.addResOutcome(R);
  }

  public void editResOutcome( int id, String ntitle, String ngOwner, String ndescription, String ntag) throws SQLException {
      obj2.editResOutcome(id, ntitle, ngOwner, ndescription, ntag);
  }

  public Boolean deleteResOutcome(String rName, int id) throws SQLException {
      obj2.removeResOutcome(rName, id);
  return null;
  }

}