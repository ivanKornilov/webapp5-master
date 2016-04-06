package lesson25;

/**
 * Kornilov
 * 04.04.2016
 */
public enum ContactType {
    PHONE("Тел."),
    MOBILE("Моб."),
    HOME_PHONE("Домашний тел."),
    SKYPE("Скайп"),
    MAIL("Почта"),
    ICQ("ICQ");

    private String title;

    ContactType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
