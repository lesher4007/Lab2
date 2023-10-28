package exercise2;

public class Audio extends File{
    private String fileFormat;
    private String description;
    private Duration duration;


    public Audio(String name, int size,String formatName, String fileFormat,String description, Duration duration) {
        super(name, size, formatName);
        setFileFormat(fileFormat);
        setDescription(description);
        setDuration(duration);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public void print() {
        System.out.print(getName()+"."+getFileFormat());
        System.out.print(spaceName(getName(),getFileFormat())+"|");
        System.out.println(spaceSize(getSize())+getSize()+"|"+getFormatName()+", "+getDescription()+", "+duration.getMinutes()+":"+ duration.getSeconds());
    }
}
