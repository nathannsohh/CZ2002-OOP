public class SalePerson implements Comparable{
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales){
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }
    
    public String toString(){
        return lastName + ", " + firstName + ": " + totalSales;
    }

    public boolean equals(Object o){
        if(this.getClass() == o.getClass()){
            SalePerson s = (SalePerson) o;
            return this.firstName == s.getFirstName() && this.lastName == s.getLastName();
        }
        return false;
    }

    public int compareTo(Object o){
        if(this.getClass() == o.getClass()){
            SalePerson s = (SalePerson) o;
        
        if(totalSales > s.totalSales)
            return 1;
        else if(totalSales < s.totalSales)
            return -1;
        else
            if(lastName.compareTo(s.lastName) > 1)
                return 1;
            else
                return -1;
        }
        return -1;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }
}
