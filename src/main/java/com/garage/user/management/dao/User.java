package com.garage.user.management.dao;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    String firstName;
    String secondName;
    String email;
    String password;
}
