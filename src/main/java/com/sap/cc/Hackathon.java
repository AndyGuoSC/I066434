package com.sap.cc;

import com.sap.cc.handsoff.CodeCreator;
import com.sap.cc.handsoff.DeveloperEvent;
import com.sap.cc.handsoff.UnsupportedDevelopmentLanguageException;

import java.util.Iterator;
import java.util.List;

public class Hackathon implements DeveloperEvent {
    @Override
    public String codeTogether(List<CodeCreator> codeCreators) {
        String result ="";
        int index = 0;
        for (Iterator itr = codeCreators.iterator(); itr.hasNext();) {
            CodeCreator codeCreator = (Developer)itr.next();
            try {
            if (index == 0){
                    result = codeCreator.code()+"\n";
                }else{
                result = result.concat(codeCreator.code())+"\n";
            }

            }catch (UnsupportedDevelopmentLanguageException unsupportedDevelopmentLanguageException){

                if (index == 0){
                    result = unsupportedDevelopmentLanguageException.getMessage()+"\n";;
                }else{
                    result = result.concat(unsupportedDevelopmentLanguageException.getMessage())+"\n";;
                }
            }
            index += 1;
        }
        return result;
    }
}
