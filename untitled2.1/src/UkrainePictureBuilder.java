class UkrainePictureBuilder extends PictureBuilder {
    public UkrainePictureBuilder() {
        super();
    }

    @Override
    public void setBasicParams(String name, short year, String author) {
        super.setBasicParams(name, year, author);
    }

    @Override
    public Picture build() {
        picture.canvas = "Ukraine Canvas";
        return picture;
    }
}