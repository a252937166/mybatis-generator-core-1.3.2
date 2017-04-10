package test.domain;

public class User {
    /** 主键  Id **/
    private Integer id;

    /** 名称  countryname **/
    private String countryname;

    /** 代码  countrycode **/
    private String countrycode;

    /**   主键  Id   **/
    public Integer getId() {
        return id;
    }

    /**   主键  Id   **/
    public void setId(Integer id) {
        this.id = id;
    }

    /**   名称  countryname   **/
    public String getCountryname() {
        return countryname;
    }

    /**   名称  countryname   **/
    public void setCountryname(String countryname) {
        this.countryname = countryname == null ? null : countryname.trim();
    }

    /**   代码  countrycode   **/
    public String getCountrycode() {
        return countrycode;
    }

    /**   代码  countrycode   **/
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }
}