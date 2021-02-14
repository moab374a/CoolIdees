package code;

import java.util.Objects;

public class Validator {

    public static String checkParam(String string){
        Objects.requireNonNull(string);
        if(string.isEmpty()) throw new IllegalArgumentException();
        return string;
    }


}
