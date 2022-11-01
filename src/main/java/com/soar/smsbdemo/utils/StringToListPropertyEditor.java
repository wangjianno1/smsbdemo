package com.soar.smsbdemo.utils;

import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;

public class StringToListPropertyEditor extends PropertyEditorSupport {

    public void setAsText(String text) throws IllegalArgumentException {
        setValue(removePrefix(text));
    }

    private String removePrefix(String param) {
        int indexOfPrefix = param.indexOf("[");
        if (indexOfPrefix == -1) {
            return param;
        }
        int indexOfSuffix = param.indexOf("]");
        return param.substring(indexOfPrefix + 1, indexOfSuffix);
    }

    public void setAsText1(String text) throws IllegalArgumentException {
        String[] strs = null;
        if (!StringUtils.isEmpty(text)) {
            strs = text.split("_");
        }
        setValue(strs);
    }
}
