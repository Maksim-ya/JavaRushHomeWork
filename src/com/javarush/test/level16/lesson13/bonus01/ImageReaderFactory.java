package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by Максим on 14-Nov-15.
 */
public class ImageReaderFactory
{

    private static ImageReader imageReader;
    public static ImageReader getReader(ImageTypes x) {
        if (x == ImageTypes.BMP)
        {
            return  new  BmpReader();
        }
        if (x == ImageTypes.JPG)
        {
            return new JpgReader();
        }
        if (x == ImageTypes.PNG)
        {
            return new PngReader();
        }
        else throw new IllegalArgumentException("Неизвестный тип картинки");
//return imageReader;
}
}
