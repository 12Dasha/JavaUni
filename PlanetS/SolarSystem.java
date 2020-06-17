package PlanetS;
import StudentInfo.Student;

import java.util.ArrayList;
import java.util.List;
public class SolarSystem {
    private String name;
    private List<Planet> planetList = new ArrayList<>();
    private List<Star> starList = new ArrayList<>();
    private List<Moon> moonList = new ArrayList<>();
    public SolarSystem(String name){
        if(!(name instanceof String)) throw new IllegalArgumentException();
        this.name = name;
    }
    public void addPlanet(Planet planet){
        planetList.add(planet);
    }
    public void addMoon(Moon moon){
        moonList.add(moon);
    }public void addStar(Star star){
        starList.add(star);
    }
    public String getName(){
        return name;
    }
    public List<Star> getStarList(){
        return starList;
    }
    public List<Moon> getMoonList() {return moonList;}
    public int countPlanet(){
        int i =0;
        for (Planet planet : planetList){
            i++;
        }
        return i;
    }
    public boolean equals(Object ob){
        if(this == ob) return true;
        if(ob == null) return false;
        if(getClass() != ob.getClass()) return false;
        SolarSystem other = (SolarSystem) ob;
        if(planetList!= other.planetList) return false;
        if(moonList!= other.moonList) return false;
        if(starList!= other.starList) return false;
        if(name!= other.name) return false;
        if(name == null) {
            if(other.name!=null)
                return false;
        } else if(!name.equals(other.name)) return false;
        return true;
    }
    public int hashCode() {
        return(int)(31*countPlanet() + ((name == null ? 0 : name.hashCode())));
    }
    public String getNameStar(List<Star> starList){
        String result = null;
        for(Star star : starList){
            result = star.getName();
        }
        if(result == null) return "No stars";
        return result;
    }
    public String toString(){
        return getClass().getName() +'\n'+" Name of System: " + name + '\n' + " Number of planets = " + countPlanet() +'\n' + " Name of star: " + getNameStar(starList);
    }
}

