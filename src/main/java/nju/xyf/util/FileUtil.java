package nju.xyf.util;

import java.io.*;

public class FileUtil {

    public static String readFile(InputStream is)  {

        StringBuilder stringBuilder = null;
        try {
            if (is!=null) {

                InputStreamReader streamReader = new InputStreamReader(is);
                BufferedReader reader = new BufferedReader(streamReader);
                String line;
                stringBuilder = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line);
                }
                reader.close();
                is.close();
            } else {
                return "no file";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return String.valueOf(stringBuilder);
    }
}
