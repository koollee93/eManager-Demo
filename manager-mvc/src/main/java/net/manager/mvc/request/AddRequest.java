package net.manager.mvc.request;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.SafeHtml;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AddRequest {

    private String _title;

    @SafeHtml
    @NotNull
    @Length(max = 255)
    @NotEmpty
    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        _title = title;
    }
}
