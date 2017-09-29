package ua.mega.util;

import org.springframework.stereotype.Component;

@Component
public class AjaxUpdateMapper {
    private String id;
    private String field;
    private String newVal;

    public AjaxUpdateMapper() {
    }

    public AjaxUpdateMapper(String id, String field, String newVal) {
        this.id = id;
        this.field = field;
        this.newVal = newVal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getNewVal() {
        return newVal;
    }

    public void setNewVal(String newVal) {
        this.newVal = newVal;
    }
}
