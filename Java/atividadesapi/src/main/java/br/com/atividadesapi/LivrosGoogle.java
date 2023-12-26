package br.com.atividadesapi;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LivrosGoogle {

    @SerializedName("title")
    private String title;
    @SerializedName("subtitle")
    private String subtitle;
    @SerializedName("authors")
    private String authors;

    public LivrosGoogle() {
    }

    public LivrosGoogle(LivrosGoogleImpl livrosGoogle) {
        this.title = livrosGoogle.title();
        this.subtitle = livrosGoogle.subtitle();
        this.authors = livrosGoogle.authors();
    }

    public LivrosGoogle(String title, String subtitle, String authors) {
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

    public String getAuthors() {
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
