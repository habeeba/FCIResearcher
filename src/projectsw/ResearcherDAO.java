package projectsw;

import java.sql.SQLException;
import java.util.Vector;

public class ResearcherDAO {

    private String memberName;
    public Researcher myResearcher;
    public Authentication myAuthentication;
    public Vector  myResearchTags;
  //  public NotificationHandler 1;
 public DBConnect obj=new DBConnect();
  public void addResearcher(Researcher R) throws SQLException {
      String sql="insert into Researcher"+"values (R.userName,R.pass,R.jobDescription,R.photo,R.affiliations,R.interests)";
      obj.st.executeUpdate(sql);
  
  }

  public void removeResearcher(String pass,String userName) throws SQLException {
      String sql="delete from Groubs where GroupName=GName";
      obj.st.executeUpdate(sql);
  
  }

  public void editResearcher(Researcher newResearcher) throws SQLException {
      String sql="update Groubs set GroupName=newResearcher.getUserName(),GroupCreator=newResearcher.getPass()"
                 + "Title=newResearcher.getJobDescription(),Description=newResearcher.getDescription()"
                 + "where GroupName=newResearcher.getGroupName()";
         obj.st.executeUpdate(sql);
  
  }

  public boolean selectResearcher(String password,String userName) throws SQLException {
      String query="select  from Researcher where UserName=userName and Pass=password";
      obj.rs=obj.st.executeQuery(query);
      if(obj.rs!=null){
          return true;
      }
      else 
          return false;
  }

}