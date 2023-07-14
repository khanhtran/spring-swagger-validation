import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

public class User {

    @ApiModelProperty(required = true)
    @NotEmpty(message = "Name is required")
    private String name;

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

