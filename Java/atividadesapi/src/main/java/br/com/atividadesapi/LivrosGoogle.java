package br.com.atividadesapi;

import java.util.List;

public class LivrosGoogle {

    private String title;
    private String subtitle;
    private List<String> authors;

    public LivrosGoogle() {
    }

    public LivrosGoogle(String title, String subtitle, List<String> authors) {
        this.title = title;
        this.subtitle = subtitle;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public List<String> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "LivrosGoogle{" +
                "title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", authors=" + authors +
                '}';
    }
}
