package org.example.HW9;



public enum Size {
    SMALL("S", 9, 10),
    MEDIUM("M", 11, 12),
    LARGE("L", 13, 14),
    EXTRA_LARGE("XL", 15, 16);

    private String shortName;
    private int width, length;

    Size(String shortName, int width, int length) {
        this.shortName = shortName;
        this.width = width;
        this.length = length;
    }


    public String getShortName() {
        return shortName;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }


    @Override
    public String toString() {
        return
            "\n"+ getShortName()+" or "+ name()+" size: width = "+ getWidth()+ ", length= "+getLength();



    }
}


