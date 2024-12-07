class Picture {
    public String name;
    public short year;
    public String author;
    public String theme;
    public String category;
    public String[] colors;
    public Size size;
    public boolean isWithFrames;
    public String canvas;

    public Picture(String name, short year, String author, String theme, String category,
                   String[] colors, Size size, boolean isWithFrames, String canvas) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.theme = theme;
        this.category = category;
        this.colors = colors;
        this.size = size;
        this.isWithFrames = isWithFrames;
        this.canvas = canvas;
    }

    public String getName() {
        return name;
    }

    public short getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(short year) {
        this.year = year;
    }
}
