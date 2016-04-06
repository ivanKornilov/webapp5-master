package lesson25;

/**
 * Kornilov
 * 04.04.2016
 */
public enum SectionType {
    OBJECTIVE("Позиция"),
    ACHIEVEMENT("Достижения"),
    EDUCATION("Образование"),
    QUALIFICATION("Квалификация"),
    EXPERIENCE("Опыт работы");

    private String title;

    SectionType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
