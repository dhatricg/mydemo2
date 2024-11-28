package com.cg.mansi;

import java.util.*;

interface IAnimal {
    void setId(int id);
    int getId();
    void setSpecies(String species);
    String getSpecies();
    void setName(String name);
    String getName();
    void setAge(int age);
    int getAge();
}
 
interface IZoo {
    void addAnimal(IAnimal animal);
    void removeAnimal(int id);
    int countAnimals();
    List<IAnimal> getAnimalsBySpecies(String species);
    List<Map.Entry<Integer, List<IAnimal>>> getAnimalsByAge();
}
class Animal implements IAnimal {
    private int id;
    private String species;
    private String name;
    private int age;
    public void setId(int id){
       this.id=id; 
    }
    public int getId(){
        return id;
    }
    public void setSpecies(String species){
        this.species=species;
    }
    public String getSpecies(){
        return species;
    }
    public void setAge(int age){
        this.age= age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }


 
}
 
class Zoo implements IZoo {
    private List<IAnimal> animals;
    public Zoo(){
        animals=new ArrayList<>();
    }
    public void addAnimal(IAnimal animal){
        animals.add(animal);
        System.out.println("Added animal:" +animal.getName() +"(" +animal.getSpecies()+")");
    }
    public void removeAnimal(int id){
      boolean removed=animals.removeIf(animal -> animal.getId()==id);
//      if(removed){
//          System.out.println("Removed animal with ID: "+id);
//      }else{
//          System.out.println("No animal fount with Id: "+ id);
//      }
    }
    public int countAnimals(){
        return animals.size();
    }
    public List<IAnimal> getAnimalsBySpecies(String species){
        List<IAnimal> result=new ArrayList<>();
        for(IAnimal animal:animals){
            if(animal.getSpecies().equalsIgnoreCase(species)){
                result.add(animal);
            }
        }
        System.out.println("Found "+result.size() +" animals of species: "+ species);
        return result;
    }
    public List<Map.Entry<Integer,List<IAnimal>>> getAnimalsByAge(){
        Map<Integer,List<IAnimal>> ageMap=new HashMap<>();
        for(IAnimal animal:animals){
            int age=animal.getAge();
            ageMap.putIfAbsent(age, new ArrayList<>());
            ageMap.get(age).add(animal);
        }
        List<Map.Entry<Integer,List<IAnimal>>> sortedEntries =new ArrayList<> (ageMap.entrySet());
        sortedEntries.sort((entry1,entry2)->entry2.getKey().compareTo(entry1.getKey()));
        return sortedEntries;
    }
 
}
/*public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
 
        IZoo zoo = new Zoo();
        int aCount = Integer.parseInt(br.readLine().trim());
        for (int i = 1; i <= aCount; i++) {
            String[] a = br.readLine().trim().split(" ");
            IAnimal e = new Animal();
            e.setId(Integer.parseInt(a[0]));
            e.setSpecies(a[1]);
            e.setName(a[2]);
            e.setAge(Integer.parseInt(a[3]));
            zoo.addAnimal(e);
        }
 
        out.println("There are " + zoo.countAnimals() + " animals in the zoo");
        String[] b = br.readLine().trim().split(" ");
        String species = b[0];
        List<IAnimal> specAnimals = zoo.getAnimalsBySpecies(species);
        out.println(species + ":");
        for (IAnimal sp : specAnimals) {
            out.println("" + sp.getName() + " (" + sp.getAge() + " years old)");
        }
        List<Map.Entry<Integer, List<IAnimal>>> animalsByAge = zoo.getAnimalsByAge();
        out.println("Animals by age:");
        for (Map.Entry<Integer, List<IAnimal>> groups : animalsByAge) {
            out.println("" + groups.getKey() + " year(s) old:");
            for (IAnimal animal : groups.getValue()) {
                out.println("- " + animal.getName() + " (" + animal.getSpecies() + ")");
            }
        }
        String[] c = br.readLine().trim().split(" ");
        int id = Integer.parseInt(c[0]);
        zoo.removeAnimal(id);
        out.println("There are now " + zoo.countAnimals() + " animals in the zoo");
 
        out.flush();
        out.close();
    }
}*/
