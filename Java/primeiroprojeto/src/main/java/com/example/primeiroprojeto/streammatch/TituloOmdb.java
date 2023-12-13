package com.example.primeiroprojeto.streammatch;

public final class TituloOmdb {

    private String title;
    private String year;
    private String runtime;

    TituloOmdb(String title, String year, String runtime) {
        this.title = title;
        this.year = year;
        this.runtime = runtime;
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this || obj != null && obj.getClass() == this.getClass();
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return "TituloOmdb{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", runtime='" + runtime + '\'' +
                '}';
    }
}
