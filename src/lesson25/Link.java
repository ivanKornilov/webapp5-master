package lesson25;

/**
 * Kornilov
 * 25.03.2016
 */
public class Link {
    private static Link EMPTY = new Link();
    private String name;
    private String url;



    public Link() {
        this.name = "";
        this.url = null;
    }

    public Link(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Link(Link link) {
        name=link.name;
        url=link.url;

    }
    void inc() {
        for (int i=1;i<10;i++) {
            System.out.println(i);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Link link = (Link) o;

        if (name != null ? !name.equals(link.name) : link.name != null) return false;
        return !(url != null ? !url.equals(link.url) : link.url != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Link{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public static Link empty() {
        return EMPTY;
    }
}
