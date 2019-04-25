package builder.schema;

public class UserBuilderTwo {

    private String name;
    private String nationality;
    private boolean banned;
    private Ethnicity ethnicity;

    public UserBuilderTwo(){
        nationality = "polish";
        banned = false;
        ethnicity = Ethnicity.CAUCASIUAN;
    }


    public UserBuilderTwo withName(String name){
        this.name = name;
        return this;
    }

    public UserBuilderTwo withNationality(String nationality){
        this.nationality = nationality;
        return this;
    }

    public User build(){
        return new User(name, nationality, banned, ethnicity);
    }
}
