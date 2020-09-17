public class book {
    public Integer lists, year, words;
    public String name, author;

    public book(Integer lists, Integer year, String name, String author, Integer words) {
        this.lists = lists;
        this.year = year;
        this.name = name;
        this.author = author;
        this.words = words;
    }

    public Integer getLists() {
        return lists;
    }

    public void setLists(Integer lists) {
        this.lists = lists;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Книга:" +
                "количество листов " + lists +
                ", год " + year +
                ", название книги " + name +
                ", имя автора " + author +
                ", количество букв ";
    }

    public Integer getWords() {
        return words;
    }

    public void setWords(Integer words) {
        this.words = words;
    }

    public void getAllwords() {
        System.out.println (this.words * this.lists);
    }
}
