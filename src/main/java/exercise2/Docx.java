package exercise2;

public class Docx extends File {

    private String fileFormat;
    private int pages;

    public Docx(String name, int size,String formatName, String fileFormat,int pages) {
        super(name, size, formatName);
        setFileFormat(fileFormat);
        setPages(pages);
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        if (fileFormat!=null && !fileFormat.isEmpty() && fileFormat.length()<=4){
            this.fileFormat = fileFormat;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages>=0){
            this.pages = pages;
        }else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void print() {
        System.out.print(getName()+"."+getFileFormat());
        System.out.print(spaceName(getName(),getFileFormat())+"|");
        System.out.println(spaceSize(getSize())+getSize()+"|"+getFormatName()+", "+getPages()+" pages");
    }

}
