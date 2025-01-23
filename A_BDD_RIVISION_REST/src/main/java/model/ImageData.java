package model;

import java.util.ArrayList;

import lombok.Data;
@Data
public class ImageData {

    private String firstName;
    private String lastName;
    private String email;
    private Boolean status;
    private String birthday;
    private ArrayList<String> skills;
    private ArrayList<Avatar> avatar;

}
