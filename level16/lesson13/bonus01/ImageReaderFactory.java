package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

import java.io.Reader;

/**
 * Created by KirillovEV on 29.08.2016.
 */
public class ImageReaderFactory
{
    static ImageReader getReader(ImageTypes a){
        if (a==ImageTypes.BMP) return new BmpReader();
        else if (a==ImageTypes.JPG) return new JpgReader();
        else if (a==ImageTypes.PNG) return new PngReader();
        else
        {
            System.out.println("Неизвестный тип картинки");
            throw new IllegalArgumentException();
        }


    }
}
