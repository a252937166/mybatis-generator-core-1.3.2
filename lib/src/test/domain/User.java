package test.domain;

public class User {
    /** ����  Id **/
    private Integer id;

    /** ����  countryname **/
    private String countryname;

    /** ����  countrycode **/
    private String countrycode;

    /**   ����  Id   **/
    public Integer getId() {
        return id;
    }

    /**   ����  Id   **/
    public void setId(Integer id) {
        this.id = id;
    }

    /**   ����  countryname   **/
    public String getCountryname() {
        return countryname;
    }

    /**   ����  countryname   **/
    public void setCountryname(String countryname) {
        this.countryname = countryname == null ? null : countryname.trim();
    }

    /**   ����  countrycode   **/
    public String getCountrycode() {
        return countrycode;
    }

    /**   ����  countrycode   **/
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }
}