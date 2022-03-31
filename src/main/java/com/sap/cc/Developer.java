package com.sap.cc;

import com.sap.cc.handsoff.CodeCreator;
import com.sap.cc.handsoff.UnsupportedDevelopmentLanguageException;

public class Developer extends CodeCreator {
    private String name;
    private String language;
    public Developer(String name, String language) {
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String code() throws UnsupportedDevelopmentLanguageException {
        String result = null;
        if (language == "go" && name == "Gopher")
            result =  "fmt.Println(\"Hello, Gopher!\")";
        else if (language == "nodejs" && name == "Nabil" )
            result =  "console.log(\"Hello, Nabil!\")";
        else if (language == "python" && name == "Pranjal" )
            result =  "print(\"Hello, Pranjal!\")";
        else
            throw new UnsupportedDevelopmentLanguageException(language);
        return result;
    }
}
