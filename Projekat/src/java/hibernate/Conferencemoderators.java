package hibernate;
// Generated Jul 6, 2017 9:30:01 PM by Hibernate Tools 4.3.1



/**
 * Conferencemoderators generated by hbm2java
 */
public class Conferencemoderators  implements java.io.Serializable {


     private Integer id;
     private Conference conference;
     private String moderatorUsername;

    public Conferencemoderators() {
    }

    public Conferencemoderators(Conference conference, String moderatorUsername) {
       this.conference = conference;
       this.moderatorUsername = moderatorUsername;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Conference getConference() {
        return this.conference;
    }
    
    public void setConference(Conference conference) {
        this.conference = conference;
    }
    public String getModeratorUsername() {
        return this.moderatorUsername;
    }
    
    public void setModeratorUsername(String moderatorUsername) {
        this.moderatorUsername = moderatorUsername;
    }




}


