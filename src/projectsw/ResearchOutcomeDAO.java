package projectsw;

import java.sql.SQLException;

public class ResearchOutcomeDAO {

    public DBConnect obj=new DBConnect();
  public String memberName;

    public ResearchOutcomeController myResearchOutcomeController;
    public ResearchOutcome myResearchOutcome;

  public void addResOutcome( ResearchOutcome R) throws SQLException {
  String sql="insert into research"+"values (R.getTitle(), R.getOwnerName(),R.getDescription(),R.getT1())";
  obj.st.executeUpdate(sql);
  }

  public void removeResOutcome(String rName, int id) throws SQLException {
   String sql="delete from research where name = rName and id = id";
      obj.st.executeUpdate(sql);
      
  }

  public void editResOutcome(int id, String ntitle, String ngOwner, String ndescription, String ntag ) throws SQLException {
      String sql="update research set name = ntitle"
                 + " description = ndescription , tag = nTag"
                 + "where owner = ngOwner and id = id";
                 obj.st.executeUpdate(sql);
  }

  public Researcher selectResOutcome() {
      
  return null;
  }

}