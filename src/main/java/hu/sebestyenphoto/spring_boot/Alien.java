package hu.sebestyenphoto.spring_boot;

public class Alien {

    private int id;
    private String name;
    private String lang;

    @Override
    public String toString(){
        return "Alien [id=" + id + ", name= " + name + ", lang= " + lang + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
