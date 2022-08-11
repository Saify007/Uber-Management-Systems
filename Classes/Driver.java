package Classes;//this package includes all the packages

public class Driver {
    protected String name;
    protected String did;
    protected double salary;
    
    public void setName(String name){
        this.name = name;
    }
    public void setdId(int dId){
        this.did = Integer.toString(dId);
    }
    public void setSalary(double Salary){
        this.salary = Salary;
    }
    
    public String getName(){
        return name;
    }
    public int getDId(){
        int id = Integer.parseInt(did);
        return id;
    }
    public double getSalary(){
        return salary;
    }
    
}

