public abstract class Person
{
    private String firstName, familyName;
    public Person(String firstName, String familyName)
    {
        this.firstName = firstName;
        this.familyName = familyName;
    }
    public abstract String toString();
    public String getFirstName()
    {
        return firstName;
    }
    public String getFamilyName()
    {
        return familyName;
    }
    public boolean equals(Person p)
    {
        if(this.firstName.equals(p.getFirstName()) && this.familyName.equals(p.getFamilyName()))
        {
            return true;
        }else return false;
    }
}
