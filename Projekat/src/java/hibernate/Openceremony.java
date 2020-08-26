package hibernate;
// Generated Jul 6, 2017 9:30:01 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Openceremony generated by hbm2java
 */
public class Openceremony  implements java.io.Serializable {


     private Integer id;
     private Agenda agenda;
     private Date date;
     private Date beginTime;
     private Date endTime;
     private String type;
     private boolean rendered = false;
     
    public Openceremony() {
    }

    public Openceremony(Agenda agenda, Date date, Date beginTime, Date endTime, String type) {
       this.agenda = agenda;
       this.date = date;
       this.beginTime = beginTime;
       this.endTime = endTime;
       this.type = type;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Agenda getAgenda() {
        return this.agenda;
    }
    
    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public Date getBeginTime() {
        return this.beginTime;
    }
    
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }
    public Date getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public boolean isRendered() {
        return rendered;
    }

    public void setRendered(boolean rendered) {
        this.rendered = rendered;
    }

}


