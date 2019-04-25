package builder.schema;

public class UserBuilderOne {

    private User user;

    public UserBuilderOne(){
        user = new User();
        user.setNationality("polish");
        user.setEthnicity(Ethnicity.CAUCASIUAN);
    }

    public UserBuilderOne withName(String name){
        user.setName(name);
        return this;
    }

    public UserBuilderOne withNationality(String nationality){
        user.setNationality(nationality);
        return this;
    }

    public UserBuilderOne banned(){
        user.setBanned(true);
        return this;
    }

    public UserBuilderOne unBanned(){
        user.setBanned(false);
        return this;
    }

    public UserBuilderOne withAfricanEthnicity(){
        user.setEthnicity(Ethnicity.AFRICAN);
        return this;
    }

    public UserBuilderOne withAsianEthnicity(){
        user.setEthnicity(Ethnicity.ASIAN);
        return this;
    }

    public UserBuilderOne withWhiteEthnicity(){
        user.setEthnicity(Ethnicity.CAUCASIUAN);
        return this;
    }

    public UserBuilderOne withInianEthnicity(){
        user.setEthnicity(Ethnicity.INDIAN);
        return this;
    }

    public User build(){
        return user;
    }






}
