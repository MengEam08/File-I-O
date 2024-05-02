package Serialization;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

import java.io.Serializable;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class StudentS implements Serializable {
    private Integer id;
    private String name;
    private String[] subject;
    private String[] classes;
}
