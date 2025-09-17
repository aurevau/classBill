public class Job {
    private String company;
    private int salary;

    public Job(String company, int salary) {
        this.company = company;
        this.salary = salary;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public int getSalary(){
        return this.salary;
    }
}
