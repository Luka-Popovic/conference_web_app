package hibernate;
// Generated Jul 6, 2017 9:30:01 PM by Hibernate Tools 4.3.1



/**
 * Location generated by hbm2java
 */
public class Location  implements java.io.Serializable {


     private Integer id;
     private String city;
     private String country;
     private String place;
     private String street;

    public Location() {
    }

	
    public Location(String city, String country, String place) {
        this.city = city;
        this.country = country;
        this.place = place;
    }
    public Location(String city, String country, String place, String street) {
       this.city = city;
       this.country = country;
       this.place = place;
       this.street = street;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    public String getPlace() {
        return this.place;
    }
    
    public void setPlace(String place) {
        this.place = place;
    }
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }




}


