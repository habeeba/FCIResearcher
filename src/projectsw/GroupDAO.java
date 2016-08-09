package projectsw;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

public class GroupDAO {

  public DBConnect obj=new DBConnect();
  
  public void addGroup(Group G) throws SQLException {
  String sql="insert into Groubs"+"values (G.getGroupName(),G.getCreator(),G.getTitle(),G.getDescription(),G.getMeetingTime())";
  obj.st.executeUpdate(sql);
  }

  public void removeGroup(String GName) throws SQLException {
      String sql="delete from Groubs where GroupName=GName";
      obj.st.executeUpdate(sql);
  
  }

  public void editRGroup( String groupName,String Description,String title) throws SQLException {
         String sql="update Groubs set GroupName=groupName"
                 + "Title=title,Description=Description"
                 + "where GroupName=groupName";
         obj.st.executeUpdate(sql);
  }

  public String selectSpecificGroup(String GName) throws SQLException {
      String query="select  from Groubs where name=GName";
      obj.rs=obj.st.executeQuery(query);
      String Creator = null;
      Creator=obj.rs.getString("Creator");
      return Creator;
          
  }
  
  public ArrayList<Group> view_avelable_groub() throws SQLException{
      String sql="select * from Groubs ";
      obj.rs=obj.st.executeQuery(sql);
      
      String GName=null;
      String Creator = null;
      String title=null;
      String meetingTime=null;
      String description=null;
      ArrayList<Group>allGroub=new ArrayList<>();
     
      while(obj.rs.next()){
         GName=obj.rs.getString("GroupName");
         Creator=obj.rs.getString("Creator");
         title=obj.rs.getString("title");
         meetingTime=obj.rs.getString("meetingTime");
         description=obj.rs.getString("description");
      allGroub.add(new Group(title, Integer.BYTES, Creator, description, GName));
  }
      return allGroub;
  }
}