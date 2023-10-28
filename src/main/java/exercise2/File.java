package exercise2;

public class File {
    private String name;
    private int size;
    private String formatName;

    public File(String name, int size,String formatName) {
        setName(name);
        setSize(size);
        setFormatName(formatName);
    }

    public String getFormatName() {
        return formatName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!=null && !name.isEmpty() && name.length()<=16){
            this.name = name;
        }else {
            throw new IllegalArgumentException();
        }
    }
    public void setFormatName(String formatName) {
        if (formatName!=null && !formatName.isEmpty()){
            this.formatName = formatName;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size>0){
            this.size = size;
        }else {
            throw new IllegalArgumentException();
        }
    }
    public void print(){

    }
    public String spaceName(String name,String formatName){
        int y = name.length()+formatName.length();
        y=20-y;
        if (y<0)
            y=0;
        while (y!=0){
            y--;
            System.out.print(" ");
        }
        return "";

    }
    public String spaceSize(int size){
        int y = Integer.toString(size).length();
        y=10-y;
        while (y!=0){
            y--;
            System.out.print(" ");
        }
        return "";

    }
    public static void printAll(File[] array) {
        System.out.println("________________________________________________________________________________________");
        System.out.println("     File name       |   Size   | Details ");
        System.out.println("---------------------+----------+-------------------------------------------------------");
        for (File file : array) {
            file.print();

        }
        System.out.println("----------------------------------------------------------------------------------------");
    }
}
