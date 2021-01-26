package Com.udemy.utils.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configreader {
public static Properties prop;
public static Properties readingProps(String ConstantConfigpath){
    ConstantConfigpath="/Users/mohammadfahimdevin/ducc/javaIntellij/proj3/src/test/resources/configreader/myconfigs.properties";
    try {
        FileInputStream fis=new FileInputStream(ConstantConfigpath);
        prop=new Properties();
        prop.load(fis);
fis.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

return prop;
}
public static String getprop(String myProp){
   String myconfigval=prop.getProperty(myProp);
   return myconfigval;
}


}
